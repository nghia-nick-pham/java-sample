package leetcode_75.array.three_sum;

import java.util.*;

public class ThreeSum_TwoPointer {

    /*
    #### Steps:

1. **Sort the Array**:
   - First, sort the array to enable the two-pointer approach.

2. **Fix One Element and Use Two Pointers**:
   - Iterate through the array, fixing one element at a time.
   - For the remaining part of the array, use two pointers to find pairs that sum up to the negative of the fixed element.

3. **Skip Duplicates**:
   - To avoid duplicate triplets, skip over elements that are the same as the previous one.
     */

//complexity:
//    time: n^2
//    space: 1
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();

        //1.sort
        Arrays.sort(nums);

        //2.
        for (int i = 0; i < nums.length - 2; i++) {
//            if (i > 0 && nums[i] == nums[i - 1]) continue;  // Skip duplicates for the first element

            int left = i + 1;
            int right = nums.length - 1;
            int sum = 0;

            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while ((left < right) &&  (nums[left] == nums[left+1])) left++; // avoid duplicate triplets
                    while ((left < right) &&  (nums[right] == nums[right-1])) right--; // avoid duplicate triplets
                    left++;
                    right--;

                } else if (sum < 0) { // total of nums[left] + nums[right] is too small
                    // num[i] + (nums[left] + nums[right]) < 0
                    // e.g. -4  + ( -1 + 2) < 0
                    while ((left < right) && (nums[left] == nums[left+1])) left++; // avoid duplicate triplets
                    left++;
                } else { //total of nums[left] + nums[right] is too large
                    //e.g.  // -1  + (0 + 2) > 0
                    while ((left < right) && (nums[right] == nums[right-1])) right--; // avoid duplicate triplets
                    right--;

                }


            }
        }

        return triplets;
    }



    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        ThreeSum_TwoPointer threeSum = new ThreeSum_TwoPointer();
        List<List<Integer>> result = threeSum.threeSum(nums);
        print(result);
    }

    private static void print(List<List<Integer>> result){
        for (List<Integer> ele: result
             ) {
            System.out.println(ele.toString());
        }
    }
}
