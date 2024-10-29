package leetcode_75.tree.average_of_levels_in_binary_tree;

import leetcode_75.tree.TreeNode;
import leetcode_75.tree.binary_tree_level_order_traversal.LevelOrderTraversal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevel {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        //queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //itegrate queue
        while (!queue.isEmpty()){
            Queue<TreeNode> queueTmp = new LinkedList<>();
            Double levelAmount = 0.0;
            int   levelEles = 0;
            while (!queue.isEmpty()) {
                // deduct all eles of queue
                TreeNode treeNode = queue.poll();
                if (treeNode != null){
                    levelAmount += treeNode.val;
                    levelEles++;

                    //add
                    if(treeNode.left!= null) queueTmp.add(treeNode.left);
                    if(treeNode.right!= null) queueTmp.add(treeNode.right);
                }

            }
//            double scale = Math.pow(10, 5);
//            result.add(Math.round(( levelAmount / levelEles) * scale) / scale);
            System.out.println(new BigDecimal(levelAmount / levelEles).setScale(5));
//            System.out.println(new BigDecimal(levelAmount / levelEles).setScale(5).doubleValue());
            result.add(new BigDecimal(levelAmount / levelEles).setScale(5, RoundingMode.HALF_UP).doubleValue());

            // add queue
            queue.addAll(queueTmp);
        }

        return  result;
    }

    public static void main(String[] args) {
//        Input: root = [3,9,20,null,null,15,7]
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode treeNode = new TreeNode(3, left, right);

        AverageLevel averageLevel = new AverageLevel();
        System.out.println(averageLevel.averageOfLevels(treeNode)); //Output: [3.00000,14.50000,11.00000]

//        treeNode = new TreeNode(1);
//        System.out.println(levelOrderTraversal.levelOrder(treeNode)); //Output: [[1]]
//
//        treeNode = null;
//        System.out.println(levelOrderTraversal.levelOrder(treeNode)); //Output: []
    }

//    public static void main(String[] args) {
//        double input = 3.14159265359;
//        System.out.println("double : " + input);
//
//        BigDecimal bd = new BigDecimal(input).setScale(5, RoundingMode.HALF_UP);
//        double newInput = bd.doubleValue();
//
//        System.out.println("double : " + newInput);
//    }
}
