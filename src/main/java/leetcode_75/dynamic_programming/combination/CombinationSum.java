package leetcode_75.dynamic_programming.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static Integer count = 0;
    public static List<List<Integer>> results = new ArrayList<>(); // Store matching groups
    public static void generateCombinations_new(int[] set,int target,  int start, List<Integer> current) {
        for (int i = start; i < set.length; i++) {
            if(target < 0){
                return;
            }
            else if(target == 0){
                count++;
                results.add(new ArrayList<>(current));
                return;
            }
            current.add(set[i]);
            generateCombinations_new(set,target - set[i], i, current);
            current.remove(current.size() - 1); // Backtrack: remove element after recursion
        }
    }

    /**
     *
     */
    public static List<List<Integer>> generateCombinations(int[] set, int target, int start, List<Integer> current) {
        List<List<Integer>> result = new ArrayList<>(); // Local list for each recursion level

        for (int i = start; i < set.length; i++) {
            if (target < 0) {
                return result; // Return empty list on negative target
            } else if (target == 0) {
                result.add(new ArrayList<>(current)); // Add current combination to result
                return result; // Return the list with the found combination
            }

            current.add(set[i]);
            result.addAll(generateCombinations(set, target - set[i], i, current)); // Add results from deeper recursion
            current.remove(current.size() - 1); // Backtrack
        }

        return result; // Return the accumulated list
    }

    public static void main(String[] args) {
        int[] set = {3,2,5};
        int target = 8;
//        generateCombinations_new(set, target,0, new ArrayList<>());
        List<List<Integer>>  results = generateCombinations(set, target,0, new ArrayList<>());
        System.out.println("Matching groups:");
        for (List<Integer> group : results) {
            System.out.println(group);
        }
    }
}
