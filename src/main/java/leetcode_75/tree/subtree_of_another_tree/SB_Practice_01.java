package leetcode_75.tree.subtree_of_another_tree;

import leetcode_75.tree.TreeNode;
import leetcode_75.tree.same_tree.SameTree2;
import sun.reflect.generics.tree.Tree;

public class SB_Practice_01 {

    public static void main(String[] args) {

        TreeNode rootLeft = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        TreeNode rootRight = new TreeNode(5);
        TreeNode root = new TreeNode(3, rootLeft, rootRight); // [3,4,5,1,2]
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        SB_Practice_01 subTree = new SB_Practice_01();
        System.out.println(subTree.isSubTree(root, subRoot)); // true'

////        [3,4,5,1,2,null,null,null,null,0]
        TreeNode rootLeftLeft = new TreeNode(2, new TreeNode(0), null);
        rootLeft = new TreeNode(4, new TreeNode(1), rootLeftLeft);
        rootRight = new TreeNode(5);
        root = new TreeNode(3, rootLeft, rootRight); // [3,4,5,1,2,null,null,null,null,0]
        System.out.println(subTree.isSubTree(root, subRoot)); //false

        root = new TreeNode(1, new TreeNode(1), null); //[1,1]
        subRoot = new TreeNode(1); //[1]
        System.out.println(subTree.isSubTree(root, subRoot)); // true


        rootLeft = new TreeNode(4, new TreeNode(1), null);
        rootRight = new TreeNode(5, new TreeNode(2), null);
        root = new TreeNode(3, rootLeft, rootRight); //      [3,4,5,1,null,2]
        subRoot = new TreeNode(3, new TreeNode(1), new TreeNode(2))   ; //[3,1,2]
        System.out.println(subTree.isSubTree(root, subRoot)); // false

        rootRight = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(2),null))));
//        rootRight = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(2),null))))));
        root = new TreeNode(1, null, new TreeNode(1, null, rootRight));
        subRoot = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(2),null))));
        System.out.println(subTree.isSubTree(root, subRoot)); //true

    }

    boolean isSubTree(TreeNode root, TreeNode sub){
        //base case
        if (root == null) return false;

        if (isEqualTree(root, sub))return true;

        return isSubTree(root.left, sub) || isSubTree(root.right, sub);
    }

    boolean isEqualTree(TreeNode a, TreeNode b){
        //base case
        if(a == null && b == null) return true;

        if(a == null || b == null) return false;

        if(a.val != b.val) return false;

        return isEqualTree(a.left, b.left) && isEqualTree(a.right, b.right);
    }
}
