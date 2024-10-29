package leetcode_75.tree.subtree_of_another_tree;

import leetcode_75.tree.TreeNode;
import leetcode_75.tree.same_tree.SameTree2;
import leetcode_75.tree.same_tree.SameTreeBFS1;

public class SubTree1 {

    public static SameTree2 sameTree;
    public static SameTreeBFS1 sameTreeBFS1;
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        //Boundary
        if(root == null && subRoot == null) return true;

        //base case
        if(root == null){
            return false;
        }

        if (sameTree.isSameTree(root, subRoot)) {
            return true;}
        else{
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

    }


    public static void main(String[] args) {
        sameTree = new SameTree2();
        TreeNode rootLeft = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        TreeNode rootRight = new TreeNode(5);
        TreeNode root = new TreeNode(3, rootLeft, rootRight); // [3,4,5,1,2]
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        SubTree1 subTree = new SubTree1();
        System.out.println(subTree.isSubtree(root, subRoot)); // true

//        [3,4,5,1,2,null,null,null,null,0]
        TreeNode rootLeftLeft = new TreeNode(2, new TreeNode(0), null);
        rootLeft = new TreeNode(4, new TreeNode(1), rootLeftLeft);
        rootRight = new TreeNode(5);
        root = new TreeNode(3, rootLeft, rootRight); // [3,4,5,1,2,null,null,null,null,0]
        System.out.println(subTree.isSubtree(root, subRoot)); //false

        root = new TreeNode(1, new TreeNode(1), null); //[1,1]
        subRoot = new TreeNode(1); //[1]
        System.out.println(subTree.isSubtree(root, subRoot)); // true


        rootLeft = new TreeNode(4, new TreeNode(1), null);
        rootRight = new TreeNode(5, new TreeNode(2), null);
        root = new TreeNode(3, rootLeft, rootRight); //      [3,4,5,1,null,2]
        subRoot = new TreeNode(3, new TreeNode(1), new TreeNode(2))   ; //[3,1,2]
        System.out.println(subTree.isSubtree(root, subRoot)); // false

        rootRight = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(2),null))));
//        rootRight = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(2),null))))));
        root = new TreeNode(1, null, new TreeNode(1, null, rootRight));
        subRoot = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(2),null))));
        System.out.println(subTree.isSubtree(root, subRoot)); //true

    }
}
