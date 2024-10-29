package leetcode_75.dynamic_programming.house_robber.HouseRobber;

public class CombinationSum {

    public static void main(String[] args) {
        int[] nums = new int[]{9};
        int target = 3;
        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum4(nums, target));
    }

    private static int count = 0;
    private  static StringBuilder stringBuilder = new StringBuilder();

    public int combinationSum4(int[] nums, int target){
        combinationSum4Sub(nums,  target);
        return count;
    }
    public void combinationSum4Sub(int[] nums, int target) {

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            target = target - nums[i];
            stringBuilder.append(nums[i]);

            if (target < 0) {
            }
            //base case
            else if (target == 0) {
                count++;
                System.out.println(stringBuilder.toString());
            } else if (target > 0) {
                combinationSum4(nums, target);
            }
            target = target + nums[i];
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        return;
    }
}

