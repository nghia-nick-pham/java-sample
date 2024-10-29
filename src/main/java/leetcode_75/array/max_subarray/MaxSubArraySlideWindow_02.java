package leetcode_75.array.max_subarray;

import java.util.LinkedList;
import java.util.Queue;

public class MaxSubArraySlideWindow_02 {

    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum, max);

        }

        System.gc();
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArraySlideWindow_02 maxSubArraySlideWindow = new MaxSubArraySlideWindow_02();
        System.out.println(maxSubArraySlideWindow.maxSubArray(nums));//Output: 6

        nums = new int[]{1};
        System.out.println(maxSubArraySlideWindow.maxSubArray(nums));//Output: 1

        nums = new int[]{5,4,-1,7,8};
        System.out.println(maxSubArraySlideWindow.maxSubArray(nums));//Output: 23
    }

}
