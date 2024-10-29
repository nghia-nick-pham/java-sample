package leetcode_75.tree.kth_smallest_element_in_a_bst;

import leetcode_75.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthSmallest {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> preOrder = new ArrayList<>();
        kthSmallest(root, preOrder);
        return preOrder.get(k-1);
    }

    public void kthSmallest(TreeNode root, List<Integer> preOrder) {
        //basecase
             //root = null  return 0;
        if (root == null) return;
        //recursion
            //print with preOrder (left - root - right)
        if (root.left != null) kthSmallest(root.left, preOrder);
        preOrder.add(root.val);
        if (root.right != null) kthSmallest(root.right, preOrder);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1) , null) , new TreeNode(4)) , new TreeNode(6) );
        int k = 3;
        KthSmallest kthSmallest = new KthSmallest();
        System.out.println(kthSmallest.kthSmallest(root, k)); //Output: 3
//        root = [3,1,4,null,2], k = 1
        root  = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        k = 1;
        System.out.println(kthSmallest.kthSmallest(root, k)); //Output: 1
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
