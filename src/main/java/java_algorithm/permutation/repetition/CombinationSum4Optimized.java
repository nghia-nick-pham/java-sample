package java_algorithm.permutation.repetition;

import java.util.Arrays;

public class CombinationSum4Optimized {

    private static int[] memo; // Memoization table

    public static int combinationSum4(int[] nums, int target) {
        memo = new int[target + 1];
        Arrays.fill(memo, -1); // Initialize with -1 to indicate not calculated
        return combinationSum4Helper(nums, target);
    }

    private static int combinationSum4Helper(int[] nums, int target) {
        if (target == 0) {
            return 1; // Base case: one way to reach target 0
        }
        if (target < 0) {
            return 0; // Base case: no way to reach negative target
        }
        if (memo[target] != -1) {
            return memo[target]; // Return if already calculated
        }
        int count = 0;
        for (int num : nums) {
            count += combinationSum4Helper(nums, target - num);
        }
        memo[target] = count; // Store the result for future use
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3};
        int target = 4;
        int result = combinationSum4(nums, target);
        System.out.println("Number of combinations: " + result);
    }
}
