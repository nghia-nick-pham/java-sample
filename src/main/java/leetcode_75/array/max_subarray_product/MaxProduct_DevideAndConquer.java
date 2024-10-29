package leetcode_75.array.max_subarray_product;

import java.util.Map;

public class MaxProduct_DevideAndConquer {

    public int maxProduct(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int product = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                product *= nums[j];
                max = Math.max(max, product);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        long tmp = 1000000000;
//        System.out.println(tmp);
        tmp = tmp * -10;
        tmp = tmp * 1000000000;
////        tmp = tmp + 2147483647 + 2147483647;
        System.out.println(tmp);
//        MaxProduct_DevideAndConquer maxProduct = new MaxProduct_DevideAndConquer();
//        int[] nums = new  int[]{2,3,-2,4};
//        System.out.println(maxProduct.maxProduct(nums)); //6
//        nums = new  int[]{-2,0,-1};
//        System.out.println(maxProduct.maxProduct(nums)); //0
//        nums = new  int[]{-2,3,-4};
//        System.out.println(maxProduct.maxProduct(nums)); //24
        int[] nums = new int[]{0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        MaxProduct_DevideAndConquer maxProduct = new MaxProduct_DevideAndConquer();
        System.out.println(maxProduct.maxProduct(nums)); //1981284352
    }
}
