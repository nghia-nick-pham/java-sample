package leetcode_75.tree.binary_tree_max_depth;

import leetcode_75.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeMaxDepth_BFS {

    public int maxDepth(TreeNode root) {
        int count = 0;
        if(root == null) return count;

        //create empty queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int levelSize;

        //loop all ele of queue
        while(queue.size() > 0) {
//            levelSize = queue.size()>1?1: queue.size();
            levelSize = queue.size();
            //loop through level
            for (int i = 0; i < levelSize; i++) {
                //dequeue
                TreeNode currentNode = queue.poll();
                //enqueue left
                if(currentNode.left!=null) queue.add(currentNode.left);
                //enqueue right
                if(currentNode.right!=null) queue.add(currentNode.right);
            }
            //counting the level
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode left_2_2 = new TreeNode(15);
        TreeNode right_2_2 = new TreeNode(2);
        TreeNode right_1_2 = new TreeNode(10, left_2_2, right_2_2);
        TreeNode left_1_2 = new TreeNode(9, null, null);
        TreeNode input = new TreeNode(3, left_1_2, right_1_2);

        BinaryTreeMaxDepth_BFS binaryTreeMaxDepth = new BinaryTreeMaxDepth_BFS();
        System.out.println(binaryTreeMaxDepth.maxDepth(input));

    }

}
