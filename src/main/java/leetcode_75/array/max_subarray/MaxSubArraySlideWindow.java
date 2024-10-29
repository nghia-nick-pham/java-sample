package leetcode_75.array.max_subarray;

import com.aspose.pdf.internal.xps.XpsEdgeMode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxSubArraySlideWindow {

    public int maxSubArray(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSum = nums[0];
        queue.add(nums[0]);
        int currSum = maxSum;

        for (int i = 1; i < nums.length; i++) {

            //Expanding the window
            currSum = currSum + nums[i];
            queue.add(nums[i]);

            int removeLeft = currSum - queue.peek();
            while((currSum < removeLeft || currSum < nums[i]) && queue.size() > 1 ){ //sum[1,-3,4] < sum [-3,4]  || sum[1,-3,4] < sum [4]
                currSum = currSum - queue.poll();
                removeLeft = currSum - queue.peek();
            }

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArraySlideWindow maxSubArraySlideWindow = new MaxSubArraySlideWindow();
        System.out.println(maxSubArraySlideWindow.maxSubArray(nums));//Output: 6

        nums = new int[]{1};
        System.out.println(maxSubArraySlideWindow.maxSubArray(nums));//Output: 1

        nums = new int[]{5,4,-1,7,8};
        System.out.println(maxSubArraySlideWindow.maxSubArray(nums));//Output: 23
    }

}
