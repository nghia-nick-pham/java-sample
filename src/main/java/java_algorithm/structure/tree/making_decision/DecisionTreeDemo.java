package java_algorithm.structure.tree.making_decision;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DecisionTreeDemo {
    public static void main(String[] args) {
        double[][] X;
        int[] y;

        try {
            Reader in = new FileReader("D:\\Programming\\Sample\\JavaCore\\java_core_01\\src\\main\\resources\\iris.csv");
            List<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in).getRecords();

            X = records.stream()
                    .map(record -> new double[]{
                            Double.parseDouble(record.get("sepal.length")),
                            Double.parseDouble(record.get("sepal.width")),
                            Double.parseDouble(record.get("petal.length")),
                            Double.parseDouble(record.get("petal.width"))
                    })
                    .toArray(double[][]::new);

            y = records.stream()
                    .map(record -> {
                        switch (record.get("variety")) {
                            case "Setosa":
                                return 0;
                            case "Versicolor":
                                return 1;
                            case "Virginica":
                                return 2;
                            default:
                                throw new IllegalArgumentException("Unknown variety: " + record.get("variety"));
                        }
                    })
                    .mapToInt(Integer::intValue)
                    .toArray();

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        DecisionTree tree = new DecisionTree(3);
        tree.fit(X, y);

        double[][] XTest = Arrays.copyOfRange(X, 100, X.length);
        int[] yTest = Arrays.copyOfRange(y, 100, y.length);

        int[] predictions = tree.predict(XTest);

        long correct = IntStream.range(0, yTest.length)
                .filter(i -> yTest[i] == predictions[i])
                .count();

        System.out.println("Accuracy: " + (correct / (double) yTest.length) * 100 + "%");
    }
}

