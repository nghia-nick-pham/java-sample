package leetcode_75.tree.construct_binary_tree_preorder_inorder;

import leetcode_75.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BinaryTree {
    private int preorderIndex = 0;
    private Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Build a hashmap to store value -> its index relations
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] preorder, int left, int right) {
        // If there are no elements to construct the tree
        if (left > right) {
            return null;
        }

        // Select the preorder_index element as the root and increment it
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        // Build left and right subtree
        // excluding inorderIndexMap[rootVal] element because it's the root
        root.left = buildTreeHelper(preorder, left, inorderIndexMap.get(rootVal) - 1);
        root.right = buildTreeHelper(preorder, inorderIndexMap.get(rootVal) + 1, right);
        return root;
    }

    // Helper function to print inorder traversal of the tree
    public void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = tree.buildTree(preorder, inorder);

        System.out.println("Inorder traversal of the constructed tree:");
        tree.printInorder(root);
    }
}
