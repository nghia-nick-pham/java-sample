package java_algorithm.combination.repetition;
import java.util.ArrayList;
import java.util.List;


public class KnapSack_CombinationRepetition {


        public static void main(String[] args) {
            int[] weights = {2, 3, 4, 5};
            int[] values = {3, 4, 5, 6};
            int capacity = 8;

            List<List<Integer>> combinations = generateCombinations(weights.length, capacity);
            int maxValue = 0;
            List<Integer> bestCombination = new ArrayList<>();

            for (List<Integer> combination : combinations) {
                int totalWeight = calculateTotalWeight(combination, weights);
                if (totalWeight <= capacity) {
                    int totalValue = calculateTotalValue(combination, values);
                    if (totalValue > maxValue) {
                        maxValue = totalValue;
                        bestCombination = new ArrayList<>(combination);
                    }
                }
            }

            System.out.println("Best combination: " + bestCombination);
            System.out.println("Max value: " + maxValue);
        }

        private static List<List<Integer>> generateCombinations(int n, int r) {
            List<List<Integer>> result = new ArrayList<>();
            generateCombinationsHelper(result, new ArrayList<>(), n, r, 0);
            return result;
        }

        //current:
        private static void generateCombinationsHelper(List<List<Integer>> result, List<Integer> current, int n, int r, int start) {
            if (r == 0) {
                result.add(new ArrayList<>(current));
                return;
            }

            for (int i = start; i < n; i++) {
                current.add(i);
                generateCombinationsHelper(result, current, n, r - 1, i);
                //clear immunable object
                current.remove(current.size() - 1);
            }
        }

        //cal
        // List indices?
        private static int calculateTotalWeight(List<Integer> indices, int[] weights) {
            int totalWeight = 0;
            for (int index : indices) {
                totalWeight += weights[index];
            }
            return totalWeight;
        }

        private static int calculateTotalValue(List<Integer> indices, int[] values) {
            int totalValue = 0;
            for (int index : indices) {
                totalValue += values[index];
            }
            return totalValue;
        }

}
