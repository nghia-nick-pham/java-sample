package java_algorithm.structure.tree.making_decision;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DecisionTree {
    private TreeNode root;
    private final int maxDepth;

    public DecisionTree(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public void fit(double[][] X, int[] y) {
        root = growTree(X, y, 0);
    }

    private TreeNode growTree(double[][] X, int[] y, int depth) {
        int numSamples = X.length;
        int numFeatures = X[0].length;

        if (depth >= maxDepth || countUnique(y) == 1) {
            return new TreeNode(null, null, null, null, mostCommonLabel(y));
        }

        int bestFeature = -1;
        double bestThreshold = Double.NEGATIVE_INFINITY;
        double bestGini = Double.POSITIVE_INFINITY;

        for (int feature = 0; feature < numFeatures; feature++) {
            final int currentFeature = feature;
            double[] thresholds = Arrays.stream(X).mapToDouble(row -> row[currentFeature]).distinct().toArray();
            for (double threshold : thresholds) {
                double gini = calculateGini(X, y, feature, threshold);
                if (gini < bestGini) {
                    bestGini = gini;
                    bestFeature = feature;
                    bestThreshold = threshold;
                }
            }
        }

        if (bestFeature == -1) {
            return new TreeNode(null, null, null, null, mostCommonLabel(y));
        }

        int[] leftIndices = split(X, bestFeature, bestThreshold, true);
        int[] rightIndices = split(X, bestFeature, bestThreshold, false);

        double[][] leftX = filterRows(X, leftIndices);
        int[] leftY = filterRows(y, leftIndices);
        double[][] rightX = filterRows(X, rightIndices);
        int[] rightY = filterRows(rightIndices, y);

        TreeNode leftChild = growTree(leftX, leftY, depth + 1);
        TreeNode rightChild = growTree(rightX, rightY, depth + 1);

        return new TreeNode(bestFeature, bestThreshold, leftChild, rightChild, null);
    }

    private double calculateGini(double[][] X, int[] y, int feature, double threshold) {
        int[] leftIndices = split(X, feature, threshold, true);
        int[] rightIndices = split(X, feature, threshold, false);

        double leftGini = 1.0;
        double rightGini = 1.0;

        if (leftIndices.length > 0) {
            leftGini = gini(y, leftIndices);
        }

        if (rightIndices.length > 0) {
            rightGini = gini(y, rightIndices);
        }

        return (leftIndices.length / (double) y.length) * leftGini + (rightIndices.length / (double) y.length) * rightGini;
    }

    private int[] split(double[][] X, int feature, double threshold, boolean left) {
        return IntStream.range(0, X.length)
                .filter(i -> left ? X[i][feature] <= threshold : X[i][feature] > threshold)
                .toArray();
    }

    private double[][] filterRows(double[][] X, int[] indices) {
        double[][] filtered = new double[indices.length][X[0].length];
        for (int i = 0; i < indices.length; i++) {
            filtered[i] = X[indices[i]];
        }
        return filtered;
    }

    private int[] filterRows(int[] y, int[] indices) {
        int[] filtered = new int[indices.length];
        for (int i = 0; i < indices.length; i++) {
            filtered[i] = y[indices[i]];
        }
        return filtered;
    }

    private double gini(int[] y, int[] indices) {
        Map<Integer, Long> labelCounts = Arrays.stream(indices)
                .mapToObj(i -> y[i])
                .collect(Collectors.groupingBy(label -> label, Collectors.counting()));

        double impurity = 1.0;
        for (long count : labelCounts.values()) {
            double prob = count / (double) indices.length;
            impurity -= prob * prob;
        }

        return impurity;
    }

    private int countUnique(int[] array) {
        return (int) Arrays.stream(array).distinct().count();
    }

    private int mostCommonLabel(int[] y) {
        return Arrays.stream(y)
                .boxed()
                .collect(Collectors.groupingBy(label -> label, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    public int[] predict(double[][] X) {
        return Arrays.stream(X)
                .mapToInt(this::predict)
                .toArray();
    }

    private int predict(double[] x) {
        TreeNode node = root;
        while (node.value == null) {
            if (x[node.feature] <= node.threshold) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return node.value;
    }
}

