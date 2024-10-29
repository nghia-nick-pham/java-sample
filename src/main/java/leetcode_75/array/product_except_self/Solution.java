package leetcode_75.array.product_except_self;

public class Solution {

    public static int[] productExceptSelf(int[] nums){
        int[]result = new int[nums.length];

        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] =  prod;
            prod *= nums[i];
        }

        prod =1 ;
        for (int i = nums.length -1 ; i >= 0; i--) {
            result[i] *= prod;
            prod *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{1,3,4,9,10};
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(productExceptSelf(arr));
    }
}
