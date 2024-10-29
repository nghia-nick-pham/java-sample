package java_algorithm.combination.repetition;

import java.util.Arrays;

public class CombinationsWithRepetitions {
    public static void generateCombinationsWithRepetitions(int[] set, int k) {
        int[] combination = new int[k];
        generateCombinations(set, combination, 0, 0 );
    }

    private static int count = 0;

    public static void generateCombinations(int[] set, int[] combination, int currentIndex, int start) {

//        processCombination(combination);
        if (currentIndex == combination.length) {
            // Process the generated combination
            processCombination(combination);
            return;
        }
//        System.out.println("Entering recursiveFunction with start = " + start);
//        else{
//            processCombination(combination);
//        }

        //?combination
        for (int i = start; i < set.length; i++) {
//            System.out.println("Iteration " + i);
            combination[currentIndex] = set[i];
            generateCombinations(set, combination, currentIndex + 1, i);
//            System.out.println("End of iteration " + i);
            count++;
        }
//        System.out.println("Exiting recursiveFunction with start = " + start);
    }

    public static void processCombination(int[] combination) {
        // You can modify this method to do something with the generated combination
        System.out.println(Arrays.toString(combination));
    }

    public static void main(String[] args) {
        int[] set = {1, 2, 3};
        int k = 3;
        generateCombinationsWithRepetitions(set, k);
        System.out.println(count);
    }
}
