package leetcode_75.dynamic_programming.house_robber.HouseRobber;

import java.util.Arrays;

public class HouseRobberMemoization {

    private static int[] memo; // Memoization table

    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1); // Initialize with -1 to indicate not calculated
        return robHelper(nums, 0);
    }

    private int robHelper(int[] nums, int index) {
        if (index >= nums.length) {
            return 0; // Base case: no more houses to rob
        }
        if (memo[index] != -1) {
            return memo[index]; // Return if already calculated
        }
        int robCurrent = nums[index] + robHelper(nums, index + 2); // Rob current house
        int skipCurrent = robHelper(nums, index + 1); // Skip current house
        memo[index] = Math.max(robCurrent, skipCurrent); // Store the maximum value
        return memo[index];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] nums2 = {2,7,9,3,1};
        int[] nums3 = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};

        HouseRobberMemoization solution = new HouseRobberMemoization();
        int maxRobbed = solution.rob(nums);
        System.out.println("Maximum amount robbed: " + maxRobbed);
    }
}
