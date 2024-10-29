package leetcode_75.tree.symmetric_tree.iteration;

import leetcode_75.tree.TreeNode;
import leetcode_75.tree.same_tree.SameTreeBFS1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public boolean isSymmetric(TreeNode root) {

        //Constrainst: add null eles, and comparing pair following the order
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null) continue;
            if (left == null || right == null || left.val != right.val) return false;

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode inputP = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                                                new TreeNode(2, new TreeNode(4),new TreeNode(3)));
        Solution sol = new Solution();
        System.out.println(sol.isSymmetric(inputP));//true;
    }
}
