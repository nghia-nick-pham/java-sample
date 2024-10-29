package leetcode_75.tree.binary_tree_level_order_traversal;

import leetcode_75.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args) {
//        Input: root = [3,9,20,null,null,15,7]
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode treeNode = new TreeNode(3, left, right);

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        System.out.println(levelOrderTraversal.levelOrder(treeNode)); //Output: [[3],[9,20],[15,7]]

        treeNode = new TreeNode(1);
        System.out.println(levelOrderTraversal.levelOrder(treeNode)); //Output: [[1]]

        treeNode = null;
        System.out.println(levelOrderTraversal.levelOrder(treeNode)); //Output: []
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        //breast first search
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> nodesCurrentLevel;

        //queue for levels
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        //traversal through all nodes of levels of the tree
        while(root != null && !queue.isEmpty()) {
            // for space, I need List<Integer> currentLevel.
            int countNode = queue.size();
            nodesCurrentLevel = new ArrayList<>();
            for (int i = 0; i < countNode; i++) {
                //dequeue
                TreeNode currentNode = queue.poll();
                nodesCurrentLevel.add(currentNode.val);

                //addQueue
                if(currentNode.left!=null)queue.add(currentNode.left);
                if(currentNode.right!=null)queue.add(currentNode.right);
            }
            result.add(nodesCurrentLevel);

        }
        return result;
    }


}
