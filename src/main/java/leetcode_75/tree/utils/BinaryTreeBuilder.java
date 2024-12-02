package leetcode_75.tree.utils;

import leetcode_75.tree.TreeNode;

public class BinaryTreeBuilder {
    public static TreeNode buildTree(Integer[] nodes) {
        return buildTreeHelper(nodes, 0);
    }

    private static TreeNode buildTreeHelper(Integer[] nodes, int index) {
        if (index >= nodes.length || nodes[index] == null) {
            return null;
        }

        TreeNode node = new TreeNode(nodes[index]);
        node.left = buildTreeHelper(nodes, 2 * index + 1);  // Left child index
        node.right = buildTreeHelper(nodes, 2 * index + 2); // Right child index
        return node;
    }
}
