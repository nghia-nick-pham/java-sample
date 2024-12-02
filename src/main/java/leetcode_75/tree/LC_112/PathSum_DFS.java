package leetcode_75.tree.LC_112;

import leetcode_75.tree.TreeNode;
import leetcode_75.tree.utils.BinaryTreeBuilder;


public class PathSum_DFS {

    public boolean isPathSum(TreeNode root, int targetSum) {
        return isPathSum(root, 0, targetSum);
    }
    public boolean isPathSum(TreeNode root, int currentSum, int targetSum) {
        //none-code analyze: edge cases
        //1. root null (tree node number = 0) && targetSum = 0;
        //2. no root-to-leaf paths <<< no-children node

        //base case
        if(root == null && targetSum == 0){
            return false;
        }

        if(root == null){
            return false;
        }

        //set current value
        currentSum += root.val;
        if (currentSum == targetSum && root.left == null && root.right == null)
            return true;

        //next recursion
        return isPathSum(root.left, currentSum,targetSum) || isPathSum(root.right, currentSum,targetSum);
    }

    public static void main(String[] args) {
//        TreeNode n_1_1_1 = new TreeNode(11,  new TreeNode(7), new TreeNode(2));
//        TreeNode n_1_2_2 = new TreeNode(4, null, new TreeNode(1));
//        TreeNode n_1_2 = new TreeNode(8, new TreeNode(13), n_1_2_2);
//        TreeNode n_1_1 = new TreeNode(4, n_1_1_1, null);
//        TreeNode input = new TreeNode(5, n_1_1, n_1_2);

        Integer[] node = new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1};
//        5
//       /  \
//      4    8
//     / \    /\
//    11  n  13 4
//    /\     /\  /\
//   7  2    n n n 1
        TreeNode input = BinaryTreeBuilder.buildTree(node);

        PathSum_DFS pathSum = new PathSum_DFS();
        int targetSum = 22;
        System.out.println(pathSum.isPathSum(input, targetSum)); // true;

        node = new Integer[]{1,2,3};
        input = BinaryTreeBuilder.buildTree(node);
        targetSum = 5;
        System.out.println(pathSum.isPathSum(input, targetSum)); // false;

        node = new Integer[]{};
        input = BinaryTreeBuilder.buildTree(node);
        targetSum = 0;
        System.out.println(pathSum.isPathSum(input, targetSum)); // false;

        node = new Integer[]{1,2};
        input = BinaryTreeBuilder.buildTree(node);
        targetSum = 1;
        System.out.println(pathSum.isPathSum(input, targetSum)); // false;

        node = new Integer[]{-2,null,-3};
        input = BinaryTreeBuilder.buildTree(node);
        targetSum = -5;
        System.out.println(pathSum.isPathSum(input, targetSum)); // true;
    }

}
