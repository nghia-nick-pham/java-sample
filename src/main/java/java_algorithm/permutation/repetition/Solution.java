package java_algorithm.permutation.repetition;

import leetcode_75.dynamic_programming.house_robber.HouseRobber.CombinationSum;

class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,3};
        int target = 35;
        Solution combinationSum = new Solution();
//        System.out.println(combinationSum.combinationSum4(nums, target));
        System.out.println(combinationSum.combinationSum4SubInt(nums, target,0));

//        System.out.println(combinationSum.test(0));

    }
    public int test( int num){
        if (num == 2){
            return 0;
        }else{
           return  test(num + 1) + 1;
        }
//        return +1;
    }
    private static int count = 0;
    public int combinationSum4(int[] nums, int target) {
        int count = 0;
        combinationSum4Sub(nums,  target);
        return count;
    }



    public void combinationSum4Sub(int[] nums, int target) {

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            target = target - nums[i];


            if (target < 0) {
            }
            //base case
            else if (target == 0) {
                count++;
            } else if (target > 0) {
                combinationSum4Sub(nums, target);
            }
            target = target + nums[i];

        }
        return;
    }

    public int combinationSum4SubInt(int[] nums, int target, int count) {
        //
        int countIn = count;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            target = target - nums[i];

            if (target < 0) {
            }
            //base case
            else if (target == 0) {
                countIn++;
            } else if (target > 0) {
                //get the newest count
                countIn = combinationSum4SubInt(nums, target, countIn);
            }
            target = target + nums[i];

        }
        //give the newest count
        return countIn;
    }
}
