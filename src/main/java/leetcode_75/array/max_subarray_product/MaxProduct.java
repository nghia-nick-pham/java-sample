package leetcode_75.array.max_subarray_product;

public class MaxProduct {

    public int maxProduct(int[] nums) {
        int maxResult = nums[0];
        int maxCurrent = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(maxCurrent * nums[i], nums[i]);
            maxResult = Math.max(maxResult, maxCurrent);
        }

        return maxResult;
    }

    public static void main(String[] args) {
        MaxProduct maxProduct = new MaxProduct();
        int[] nums = new  int[]{2,3,-2,4};
        System.out.println(maxProduct.maxProduct(nums)); //6
        nums = new  int[]{-2,0,-1};
        System.out.println(maxProduct.maxProduct(nums)); //0
    }
}
