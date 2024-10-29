package leetcode_75.tree.subtree_of_another_tree;

import leetcode_75.tree.TreeNode;
import sun.reflect.generics.tree.Tree;

public class SubTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        return isSubtreeHelper(root, subRoot, subRoot, true);
    }

    public boolean isSubtreeHelper(TreeNode root, TreeNode subRoot, TreeNode subRootOri, boolean flgFirstSub) {

        //base case:
        if (subRoot == null && root == null) {
            return true;
        }
        if (root == null || subRoot == null) return false;

        if (root.val != subRoot.val){
            subRoot = subRootOri;
            flgFirstSub = true;
            return  isSubtreeHelper(root.left, new TreeNode(subRootOri.val,subRootOri.left,subRootOri.right), subRootOri, flgFirstSub) || isSubtreeHelper(root.right, new TreeNode(subRootOri.val,subRootOri.left,subRootOri.right), subRootOri, flgFirstSub);
        }else{ //root.val == sub.val
            if (flgFirstSub &&  ((root.left!=null && root.val == root.left.val) || (root.right!=null && root.val == root.right.val))){
                flgFirstSub = false;
                return (isSubtreeHelper(root.left, subRoot.left, subRootOri, flgFirstSub) && isSubtreeHelper(root.right, subRoot.right, subRootOri, flgFirstSub) )
                        ||
                        (isSubtreeHelper(root.left, subRoot, subRootOri, flgFirstSub) || isSubtreeHelper(root.right, subRoot, subRootOri, flgFirstSub))
                        ;
            }
            else{
                flgFirstSub = false;
                return isSubtreeHelper(root.left, subRoot.left, subRootOri, flgFirstSub) && isSubtreeHelper(root.right, subRoot.right, subRootOri, flgFirstSub);
            }
        }
    }

    public static void main(String[] args) {

        TreeNode rootLeft = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        TreeNode rootRight = new TreeNode(5);
        TreeNode root = new TreeNode(3, rootLeft, rootRight); // [3,4,5,1,2]
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        SubTree subTree = new SubTree();
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


    }
}
