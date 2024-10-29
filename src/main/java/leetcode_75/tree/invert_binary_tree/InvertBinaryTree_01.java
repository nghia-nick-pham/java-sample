package leetcode_75.tree.invert_binary_tree;

import leetcode_75.tree.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_01 {

    public static void main(String[] args) {
        //2,1,3
        //4,2,7,1,3,6,9
//        TreeNode treeNode = new TreeNode(2, new TreeNode(1), new TreeNode(3));
//        TreeNode leftSub = new TreeNode(2, new TreeNode(1),new TreeNode(3));
//        TreeNode righSub = new TreeNode(7, new TreeNode(6),new TreeNode(9));
//        TreeNode treeNode = new TreeNode(4, leftSub, righSub);
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), null);

        InvertBinaryTree_01 invertBinaryTree_01 = new InvertBinaryTree_01();
        //print the tree node val
        printTreeNode(invertBinaryTree_01.invertTree(treeNode));
//        printTreeNode(treeNode);

    }

//    static void printTreeNode(TreeNode treeNode){
//        //base case
//        if(treeNode==null){
//            return;
//        }
//        System.out.println(treeNode.val);
//        if(treeNode.left != null) printTreeNode(treeNode.left);
//        if(treeNode.right != null) printTreeNode(treeNode.right);
//    }

    static void printTreeNode(TreeNode treeNode){
       //queue

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
//        int level = queue.size();

        while(queue != null && !queue.isEmpty()){
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode sub = queue.poll();
                System.out.println(sub.val);

                if (sub.left !=null) queue.add(sub.left);
                if (sub.right !=null) queue.add(sub.right);
            }
        }
    }


    public TreeNode invertTree(TreeNode root) {
        if (root==null)return null;
        return invertTreeHelper(root, new TreeNode(root.val));
    }

    //helper
    public TreeNode invertTreeHelper(TreeNode root , TreeNode currentTreeNode) {
        TreeNode result = null;

        //base case
        if(root == null ){
            return null;
        }
        if (root.left == null && root.right == null)
        {return root;}

        //recursion
        if(root.right !=null) {currentTreeNode.left = new TreeNode(root.right.val);}
        if(root.left !=null) currentTreeNode.right = new TreeNode(root.left.val);

        invertTreeHelper(root.right, currentTreeNode.left);
        invertTreeHelper(root.left, currentTreeNode.right);

        result = currentTreeNode;

        return result;
    }
}
