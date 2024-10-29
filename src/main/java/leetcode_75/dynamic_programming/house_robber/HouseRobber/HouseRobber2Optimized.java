package leetcode_75.dynamic_programming.house_robber.HouseRobber;

import java.util.Arrays;

public class HouseRobber2Optimized {

    private static int[] memoRobFirst;
    private static int[] memoSkipFirst;

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        memoRobFirst = new int[nums.length];
        memoSkipFirst = new int[nums.length];
        Arrays.fill(memoRobFirst, -1);
        Arrays.fill(memoSkipFirst, -1);
        return Math.max(robHelper(Arrays.copyOf(nums,nums.length-1), 0, 1), robHelper(nums, 1, 0));
    }

    private int robHelper(int[] nums, int index, int flgRobFirst) {
        if (index >= nums.length) {
            return 0; // Base case: no more houses to rob
        }
            int[] memo = flgRobFirst == 1 ? memoRobFirst : memoSkipFirst;
        if (memo[index] != -1) {
            return memo[index]; // Return if already calculated
        }
        int robCurrent = nums[index] + robHelper(nums, index + 2, flgRobFirst);
        int skipCurrent = robHelper(nums, index + 1, flgRobFirst);
        memo[index] = Math.max(robCurrent, skipCurrent);
        return memo[index];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] nums1 = {1, 2, 3, 1, 2, 4};
        int[] nums2 = {2,7,9,3,1};

        int[] nums3 = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
        int[] nums4 = {2,3,2};
        HouseRobber2Optimized solution = new HouseRobber2Optimized();
        int maxRobbed = solution.rob(nums2);
        System.out.println("Maximum amount robbed: " + maxRobbed);
    }
}
