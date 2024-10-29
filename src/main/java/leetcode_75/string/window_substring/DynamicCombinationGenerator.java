package leetcode_75.string.window_substring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicCombinationGenerator {

    public static List<List<Integer>> generateCombinations(List<List<Integer>> groups) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinationsHelper(groups, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateCombinationsHelper(List<List<Integer>> groups, int groupIndex,
                                                   List<Integer> currentCombination, List<List<Integer>> result) {
        if (groupIndex == groups.size()) {
            result.add(new ArrayList<>(currentCombination)); // Base case: add combination to result
            return;
        }

        List<Integer> currentGroup = groups.get(groupIndex);
        for (int element : currentGroup) {
            currentCombination.add(element);
            generateCombinationsHelper(groups, groupIndex + 1, currentCombination, result); // Explore next group
            currentCombination.remove(currentCombination.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> groups = new ArrayList<>();
        groups.add(Arrays.asList(0, 10)); // Group A
        groups.add(Arrays.asList(3, 9)); // Group B
        groups.add(Arrays.asList(5, 12)); // Group C

        List<List<Integer>> combinations = generateCombinations(groups);
        System.out.println("Combinations:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
