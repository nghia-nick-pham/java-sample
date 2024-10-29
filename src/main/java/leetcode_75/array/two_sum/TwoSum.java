package leetcode_75.array.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++
        ) {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]) && i != map.get(nums[i])){
                return new int[]{i, map.get(nums[i])};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = new int[]{3,3};
        int target = 6;
        System.out.printf(Arrays.toString(twoSum.twoSum(arr, target)));
//        System.out.println(twoSum.getTwoSum(arr,target));
    }
}
