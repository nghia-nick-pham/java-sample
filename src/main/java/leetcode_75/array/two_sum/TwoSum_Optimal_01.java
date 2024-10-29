package leetcode_75.array.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_Optimal_01 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++
        ) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum_Optimal_01 twoSum = new TwoSum_Optimal_01();
        int[] arr = new int[]{3,3};
        int target = 6;
        System.out.printf(Arrays.toString(twoSum.twoSum(arr, target)));
//        System.out.println(twoSum.getTwoSum(arr,target));
    }
}
