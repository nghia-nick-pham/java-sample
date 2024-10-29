package leetcode_75.array.max_subarray;

public class MaxSubArraySlideWindow_DevideAndConquer {

    public int maxSubArray(int[] nums) {
       return maxSubArray(0, nums);
    }

    private int maxSubArray(int index, int[] nums) {
        //base case
        if(index >= nums.length) return Integer.MIN_VALUE;

        //recursive
        int max = nums[index];
        // calculate max of each substring starting from index position
        int maxCurrent = 0;
        for (int i = index; i < nums.length; i++) {
            maxCurrent += nums[i];
            max = Math.max(max, maxCurrent);
        }

        max = Math.max(max, maxSubArray(++index, nums));
        return max;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArraySlideWindow_DevideAndConquer maxSubArraySlideWindow = new MaxSubArraySlideWindow_DevideAndConquer();
        System.out.println(maxSubArraySlideWindow.maxSubArray(nums));//Output: 6

        nums = new int[]{1};
        System.out.println(maxSubArraySlideWindow.maxSubArray(nums));//Output: 1

        nums = new int[]{5,4,-1,7,8};
        System.out.println(maxSubArraySlideWindow.maxSubArray(nums));//Output: 23
    }

}
