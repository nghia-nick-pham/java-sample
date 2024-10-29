package java_algorithm.permutation.repetition;

public class Solution_Itegration {
    public static int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target+1];
        dp[0]=1;
//        int count = 0;
        for(int i=1;i<=target;i++){
            for(int j=0;j<nums.length;j++){
//                count++;
                if(nums[j]<=i)
                    dp[i]+=dp[i-nums[j]];
            }
        }
//        System.out.println("count:" + count);
        return dp[target];
    }
    public static void main(String[] args) {
        int[] nums = {2,1,3};
        int target = 4;
        int result = combinationSum4(nums, target);
        System.out.println("Number of combinations: " + result);
    }
}
