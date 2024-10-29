package java_algorithm.permutation.repetition;

import java.util.HashMap;
import java.util.Map;

public class SolutionHashmap {
    static Map<Integer, Integer> map = new HashMap();
    public static int combinationSum4(int[] nums, int target) {
        return findCombo(nums, target);

    }

    public static int findCombo(int[] nums, int target) {
        if (target < 0)  {
            map.put(target, 0);
            return 0;
        }
        if (target == 0) {
            map.put(target, 1);
            return 1;
        }
        int totalCount=0;
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                totalCount += map.get(target-nums[i]);
            } else {
                int count = findCombo(nums, target - nums[i]);
                map.put(target-nums[i], count);
                totalCount += count;
            }

        }

        return totalCount;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3};
        int target = 4;
        int result = combinationSum4(nums, target);
        System.out.println("Number of combinations: " + result);
    }
}
