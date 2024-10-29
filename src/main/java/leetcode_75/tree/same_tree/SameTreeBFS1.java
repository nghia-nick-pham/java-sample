package leetcode_75.tree.same_tree;

import leetcode_75.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTreeBFS1 {



    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queueP = new LinkedList<>();
        Queue<TreeNode> queueQ = new LinkedList<>();
        //valid input null in first element of each Tree
        if(p == null && q==null) return true;
        if(p== null || q == null) return false; //ignore for 2 opposite rest options

        queueP.add(p);
        queueQ.add(q);



        while(!queueP.isEmpty() || !queueQ.isEmpty()){
            int listSizeP = queueP.size();
            int listSizeQ = queueQ.size();

            //comparing size
            if(listSizeP != listSizeQ){
                return false;
            }

            //iterate through all elements of level
            for (int i = 0; i < listSizeP; i++) {
                TreeNode treeNodeP = queueP.poll();
                TreeNode treeNodeQ = queueQ.poll();

                //comparing val
                if(treeNodeP.val != treeNodeQ.val ){
                    return false;
                }

                //comparing position
                //for left children
                if(treeNodeP.left != null && treeNodeQ.left != null){
                    queueP.add(treeNodeP.left);
                    queueQ.add(treeNodeQ.left);
                }else if (treeNodeP.left != null || treeNodeQ.left != null){
                    return false;
                }

                //for right children
                if(treeNodeP.right != null && treeNodeQ.right != null){
                    queueP.add(treeNodeP.right);
                    queueQ.add(treeNodeQ.right);
                }else if (treeNodeP.right != null || treeNodeQ.right != null){
                    return false;
                }
            }

        }
        // Ensure both queues are empty (both trees have the same structure)
        return queueP.isEmpty() && queueQ.isEmpty();
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
        SameTreeBFS1 sameTreeBFS1 = new SameTreeBFS1();
        System.out.println(sameTreeBFS1.isSameTree(inputP, inputQ));

        inputP = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(2),null))));
        inputQ = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(2),null))));
        System.out.println(sameTreeBFS1.isSameTree(inputP, inputQ));
    }

}
