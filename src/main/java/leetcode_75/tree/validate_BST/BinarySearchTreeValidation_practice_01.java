package leetcode_75.tree.validate_BST;

import leetcode_75.tree.TreeNode;

public class BinarySearchTreeValidation_practice_01 {

    boolean validateBST (TreeNode root){
        return validateBST(Long.MIN_VALUE, root, Long.MAX_VALUE);
    }

    boolean validateBST(long left, TreeNode root, long right){
        //base case
        if (root == null) return true;

        if(!(left < root.val && root.val < right )){
//            System.out.println(root.val);
//            System.out.println("false");
            return false;
        }

        return validateBST(left, root.left, root.val)  &&  validateBST(root.val, root.right, right);
    }

    public static void main(String[] args) {
        BinarySearchTreeValidation_practice_01 binarySearchTreeValidationPractice01 = new BinarySearchTreeValidation_practice_01();
        TreeNode rootLeft = new TreeNode(5, new TreeNode(3, new TreeNode(1), new TreeNode(4)), new TreeNode(7, new TreeNode(6), new TreeNode(8)));
        TreeNode root = new TreeNode(10, rootLeft , null);
        System.out.println(binarySearchTreeValidationPractice01.validateBST(root));

        root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6))); //root = [5,1,4,null,null,3,6]
        System.out.println(binarySearchTreeValidationPractice01.validateBST(root)); // false
    }

//    5
//   / \
//  1   4
//      / \
//     3   6

//    (5, 4, Long.Max)

}
