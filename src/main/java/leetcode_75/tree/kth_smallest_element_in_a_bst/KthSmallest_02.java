package leetcode_75.tree.kth_smallest_element_in_a_bst;

import leetcode_75.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest_02 {

    static int countReturn = 0;
    static int result = -1;
    public int kthSmallest(TreeNode root, int k) {
//      basecase
         if(root == null) return 0;
            //root = null  return 0;
        //recursion
         if(root.left != null) countReturn = 1 + kthSmallest(root.left, k);
         if (countReturn == k) {
             System.out.println(countReturn);
             result = root.val;};
         if(root.right != null) countReturn = 1 + kthSmallest(root.right, k);
         return countReturn;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1) , null) , new TreeNode(4)) , new TreeNode(6) );
        int k = 3;
        KthSmallest_02 kthSmallest = new KthSmallest_02();
        System.out.println(kthSmallest.kthSmallest(root, k)); //Output: 3
//        root = [3,1,4,null,2], k = 1
//        root  = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
//        k = 1;
//        System.out.println(kthSmallest.kthSmallest(root, k)); //Output: 1
    }

//        5
//       /  \
//      3    6
//    /  \
//   2    4
//  /
// 1

    //boundary cases
//     1. null <<< ignored (1 <= k <= n)
//    2. 1 element


}
