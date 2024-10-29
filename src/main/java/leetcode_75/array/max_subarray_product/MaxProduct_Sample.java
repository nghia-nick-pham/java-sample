package leetcode_75.array.max_subarray_product;

public class MaxProduct_Sample {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap currentMax and currentMin
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
//        long tmp = 1000000000;
////        System.out.println(tmp);
//        tmp = tmp * -10;
//        tmp = tmp * 1000000000;
//////        tmp = tmp + 2147483647 + 2147483647;
//        System.out.println(tmp);
//        MaxProduct_DevideAndConquer maxProduct = new MaxProduct_DevideAndConquer();
//        int[] nums = new  int[]{2,3,-2,4};
//        System.out.println(maxProduct.maxProduct(nums)); //6
//        nums = new  int[]{-2,0,-1};
//        System.out.println(maxProduct.maxProduct(nums)); //0
//        nums = new  int[]{-2,3,-4};
//        System.out.println(maxProduct.maxProduct(nums)); //24
        int[] nums = new int[]{0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        MaxProduct_Sample maxProduct = new MaxProduct_Sample();
        System.out.println(maxProduct.maxProduct(nums)); //1981284352
    }
}
