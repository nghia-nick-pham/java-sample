package leetcode_75.tree.binary_tree_max_depth;

import leetcode_75.tree.TreeNode;

public class BinaryTreeMaxDepth_Recursion_DFS {

    public int maxDepth(TreeNode root) {
        //base case
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode left_2_2 = new TreeNode(15);
        TreeNode right_2_2 = new TreeNode(2);
        TreeNode right_1_2 = new TreeNode(10, left_2_2, right_2_2);
        TreeNode left_1_2 = new TreeNode(9, null, null);
        TreeNode input = new TreeNode(3, left_1_2, right_1_2);

        BinaryTreeMaxDepth_Recursion_DFS binaryTreeMaxDepth = new BinaryTreeMaxDepth_Recursion_DFS();
        System.out.println(binaryTreeMaxDepth.maxDepth(input));

    }

}
