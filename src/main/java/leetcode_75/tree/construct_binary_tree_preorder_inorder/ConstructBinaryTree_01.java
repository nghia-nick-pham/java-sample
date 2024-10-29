package leetcode_75.tree.construct_binary_tree_preorder_inorder;

import leetcode_75.tree.TreeNode;

public class ConstructBinaryTree_01 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(0,preorder, inorder, new TreeNode(preorder[0]));
    }

    public TreeNode buildTreeHelper(int index, int[] preorder, int[] inorder, TreeNode totalTreeNode){
        TreeNode result;
        TreeNode currentTreenode;
        //base case
        if (index >= preorder.length){
            return null;
        }
        currentTreenode = new TreeNode(preorder[index]);

        return null;

    }

    public static void main(String[] args) {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        ConstructBinaryTree_01 constructBinaryTree = new ConstructBinaryTree_01();
        print(constructBinaryTree.buildTree(preorder, inorder)); //[3,9,20,null,null,15,7]

        preorder = new int[]{-1};
        inorder = new int[]{-1};
        print(constructBinaryTree.buildTree(preorder, inorder)); //[-1]
    }

    static void print(TreeNode treeNode){
        //base case
        if (treeNode == null) return;

        System.out.println(treeNode.val);
        print(treeNode.left);
        print(treeNode.right);
    }
}
