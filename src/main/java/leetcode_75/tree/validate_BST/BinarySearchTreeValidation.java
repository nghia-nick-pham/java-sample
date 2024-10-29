package leetcode_75.tree.validate_BST;

import leetcode_75.tree.TreeNode;

import java.math.BigDecimal;

public class BinarySearchTreeValidation {

    public boolean isValidBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return true;
        return isValidBST(Long.MIN_VALUE, root,  Long.MAX_VALUE);
    }

    private boolean isValidBST(long min, TreeNode node, long max) {
        //base case
        if (node == null) return true;

        if ( min >= node.val || node.val >= max ){
            return false;
        }

        return isValidBST(min, node.left, node.val) && isValidBST(node.val, node.right, max);
    }


    public static void main(String[] args) {
//        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3)); //root = [2,1,3]
        BinarySearchTreeValidation binarySearchTreeValidation = new BinarySearchTreeValidation();
//        System.out.println(binarySearchTreeValidation.isValidBST(root)); // true
//        root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6))); //root = [5,1,4,null,null,3,6]
//        System.out.println(binarySearchTreeValidation.isValidBST(root)); // false
//        root = new TreeNode(2147483647);      ;//[2147483647]
//        System.out.println(binarySearchTreeValidation.isValidBST(root)); // true
//        root = new TreeNode(2147483647, new TreeNode(2147483647), null);
//        System.out.println(binarySearchTreeValidation.isValidBST(root)); // false
        TreeNode root = new TreeNode(-2147483647, null, new TreeNode(2147483647)); // [-2147483648,null,2147483647]
        System.out.println(binarySearchTreeValidation.isValidBST(root)); // true
    }
}
