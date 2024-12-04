package leetcode_75.tree.LC_129;

import leetcode_75.tree.TreeNode;
import leetcode_75.tree.utils.BinaryTreeBuilder;

//https://leetcode.com/problems/sum-root-to-leaf-numbers/?envType=study-plan-v2&envId=top-interview-150
public class SumNumbers {

    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, "", 0);
    }
//        4
//       /\
//      9  0
//     /\
//    5  1

    public int sumNumbers(TreeNode root, String strVals, int sum) {
        //edge cases:

        int result = 0;

        //base case
        if (root == null) return 0;


        strVals = strVals.concat(String.valueOf(root.val));

        //return
        if (root.left == null && root.right ==null){
            return Integer.sum(sum, Integer.parseInt(strVals));
        }

        //recursive
        return sumNumbers(root.left, strVals, sum) + sumNumbers(root.right, strVals, sum);

    }

    public static void main(String[] args) {
        SumNumbers sumNumbers = new SumNumbers();
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[]{4,9,0,5,1});

        System.out.println( sumNumbers.sumNumbers(root)); //1026
    }
}
