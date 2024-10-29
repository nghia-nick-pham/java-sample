package leetcode_75.tree.construct_binary_tree_preorder_inorder;

import leetcode_75.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTree_Practice_01 {

    static int currentIdx = 0;
    TreeNode constructTree (int[] preOrder, int[] inOrder){
        Map<Integer, Integer> mapInOrder = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++
             ) {
            mapInOrder.put(inOrder[i], i);
        }

        return constructTree(preOrder, 0, preOrder.length - 1, mapInOrder);
    }

    TreeNode constructTree ( int[] preOrder, int leftIdx, int rightIdx, Map<Integer, Integer> mapInOrder){
        //base case
        if(leftIdx > rightIdx) return null;

        int val = preOrder[currentIdx++];
        TreeNode result = new TreeNode(val);

        result.left = constructTree( preOrder, leftIdx , mapInOrder.get(val) - 1, mapInOrder);
        result.right = constructTree( preOrder, mapInOrder.get(val) + 1, rightIdx, mapInOrder);

        return result;
    }


    public static void main(String[] args) {
        int[] preOrder = new int[] {3, 9, 20, 15, 7};
        int[] inOrder = new int[] {9, 3, 15, 20, 7};
        ConstructBinaryTree_Practice_01 constructBinaryTree = new ConstructBinaryTree_Practice_01();
        TreeNode treeNode = constructBinaryTree.constructTree(preOrder, inOrder);
        printTreePreOrder(treeNode);
    }

    static void printTreePreOrder(TreeNode root){
        if(root == null) return;

        System.out.println(root.val);
        if (root.left == null) { System.out.println("null"); }else{ printTreePreOrder(root.left);}
        if (root.right == null) { System.out.println("null"); }else{ printTreePreOrder(root.right);}
    }


}
