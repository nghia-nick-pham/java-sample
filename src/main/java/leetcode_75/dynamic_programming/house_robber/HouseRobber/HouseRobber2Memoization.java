package leetcode_75.dynamic_programming.house_robber.HouseRobber;

import java.util.Arrays;

public class HouseRobber2Memoization {

    private static int[] memo; // Memoization table
    private static int[] memoFlg; // Memoization table

    public int rob(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        memo = new int[nums.length];
        memoFlg = new int[nums.length];
        Arrays.fill(memo, -1); // Initialize with -1 to indicate not calculated
        Arrays.fill(memoFlg, -1); // Initialize with -1 to indicate not calculated
        return robHelper(nums, 0, 0);
    }

    private int robHelper(int[] nums, int index, int flgRob) {
        //flgRob: -1 : intiallzing
        //flgRob: 0 : Rob current house
        //flgRob: 1 : Rob current house

        int lengh = flgRob==1?nums.length-1:nums.length;
        if ( index >= lengh) {
            return 0; // Base case: no more houses to rob
        }
        if (memo[index] != -1 && flgRob == memoFlg[index]) {
            return memo[index]; // Return if already calculated
        }
        int robCurrent = nums[index] + robHelper(nums, index + 2, 0); // Rob current house
        int skipCurrent = robHelper(nums, index + 1, 1); // Skip current house
        memo[index] = Math.max(robCurrent, skipCurrent); // Store the maximum value
        memoFlg[index] = flgRob; // Store the maximum value
        return memo[index];
    }

    // TODO: 4/24/2024
    //detect rob current house <<< length -1

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] nums1 = {1, 2, 3, 1, 2, 4};
        int[] nums2 = {2,7,9,3,1};
        int[] nums3 = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};

        HouseRobber2Memoization solution = new HouseRobber2Memoization();
        int maxRobbed = solution.rob(nums2);
        System.out.println("Maximum amount robbed: " + maxRobbed);
    }
}
