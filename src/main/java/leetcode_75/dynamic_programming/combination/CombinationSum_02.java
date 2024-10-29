package leetcode_75.dynamic_programming.combination;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_02 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> combination, int start, int n, int k) {
        // Base case: if the combination is of size k, add it to the result
        if (combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        }

        // Iterate through the numbers from 'start' to 'n'
        for (int i = start; i <= n; i++) {
            // Add the current number to the combination
            combination.add(i);
            // Recurse with the next number as the new start
            backtrack(result, combination, i + 1, n, k);
            // Backtrack by removing the last element
            combination.remove(combination.size() - 1);
        }
    }
//loop i = 1:  i= 1, n=4, k=2, com[1] -> com []
//          :  i = 2(rec):  loop i = 2, com[1,2] -> com [1]
//                              : i = 3 -> result[com[1,2]]
//          :            :  loop i = 3, com[1,3] -> com [1]
// edge cases: i =4



    public static void main(String[] args) {
        CombinationSum_02 solution = new CombinationSum_02();
        int n = 4, k = 2;
        List<List<Integer>> combinations = solution.combine(n, k);

        // Print the combinations
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
