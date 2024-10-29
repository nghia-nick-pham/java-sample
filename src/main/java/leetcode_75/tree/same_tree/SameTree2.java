package leetcode_75.tree.same_tree;

import leetcode_75.tree.TreeNode;

public class SameTree2 {

    public boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }

        if (root.val != subRoot.val) {
            return false;
        }

        return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
    }

    public static void main(String[] args) {
//        TreeNode lwf = new TreeNode(15);
//        TreeNode right_2_2 = new TreeNode(2);
//        TreeNode right_1_2 = new TreeNode(10, left_2_2, right_2_2);
//        TreeNode left_1_2 = new TreeNode(9, null, null);
//        TreeNode left_1_2 = new TreeNode(9, null, null);
        TreeNode inputP = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode inputQ = new TreeNode(1, new TreeNode(2), new TreeNode(3));

//        TreeNode inputP = null;
//        TreeNode inputQ = new TreeNode(1);
        SameTree2 samTree2 = new SameTree2();
        System.out.println(samTree2.isSameTree(inputP, inputQ));

        inputP = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(2),null))));
        inputQ = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(2),null))));
        System.out.println(samTree2.isSameTree(inputP, inputQ));
    }

}
