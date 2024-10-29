package java_algorithm.structure.tree.making_decision;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DecisionTree_01  {
    public static void main(String[] args) throws IOException {
        // Load data
        Reader in = new FileReader("D:\\Programming\\Sample\\JavaCore\\java_core_01\\src\\main\\resources\\iris.csv");
        List<String[]> data = new BufferedReader(in).lines().skip(1).map(line -> line.split(",")).collect(Collectors.toList());

        int numFeatures = 4;
        int numRows = data.size();

        double[][] X = new double[numRows][numFeatures];
        String[] y = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numFeatures; j++) {
                X[i][j] = Double.parseDouble(data.get(i)[j]);
            }
            y[i] = data.get(i)[numFeatures];
        }

        // Example of splitting data
        double[][] XLeft = Arrays.stream(X).filter(row -> row[0] <= 5.0).toArray(double[][]::new);
        double[][] XRight = Arrays.stream(X).filter(row -> row[0] > 5.0).toArray(double[][]::new);

        int[] leftIndices = Arrays.stream(X)
                .filter(row -> row[0] <= 5.0)
                .mapToInt(row -> Arrays.asList(X).indexOf(row))
                .toArray();

        int[] rightIndices = Arrays.stream(X)
                .filter(row -> row[0] > 5.0)
                .mapToInt(row -> Arrays.asList(X).indexOf(row))
                .toArray();

        String[] yLeft = filterArray(y, leftIndices);
        String[] yRight = filterArray(y, rightIndices);

        System.out.println("XLeft size: " + XLeft.length);
        System.out.println("XRight size: " + XRight.length);
        System.out.println("yLeft size: " + yLeft.length);
        System.out.println("yRight size: " + yRight.length);
    }

    public static String[] filterArray(String[] y, int[] indices) {
        String[] filtered = new String[indices.length];
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] < y.length) {
                filtered[i] = y[indices[i]];
            } else {
                System.out.println("Index out of bounds: " + indices[i] + " for y length: " + y.length);
            }
        }
        return filtered;
    }
}

