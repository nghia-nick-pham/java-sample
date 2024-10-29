package java_algorithm.structure.tree.making_decision;

public class TreeNode {
    Integer feature;   // Index of the feature to split on
    Double threshold;  // Value to split the feature on
    TreeNode left;     // Left child node
    TreeNode right;    // Right child node
    Integer value;     // Class label if it's a leaf node

    public TreeNode(Integer feature, Double threshold, TreeNode left, TreeNode right, Integer value) {
        this.feature = feature;
        this.threshold = threshold;
        this.left = left;
        this.right = right;
        this.value = value;
    }

}
