package leetcode_75.array.three_sum;

import java.util.*;

public class ThreeSum {

//        public List<List<Integer>> threeSum(int[] nums) {
            // int n = nums.length
            // int start = 0;
            // List<Integer> triplet = new LinkedList() <<< LIFO(stack)

            //backtrack (List<List<Integer>> triplets, triplet , int[] nums, int start, int n, int sum )
            // base case:
            // triplet.legth == 3
            // if(sum == 0) triplets.add(triplet);
            // recursive
            // itegrate (i from start to n)
            // add
            // tripet.add(nums[i])
            // sum = sum +  nums[i]
            //  call backtrack
            // remove
            // tripet.remove(tripet.length())
            // sum = sum - nums[i]
//        }
        //myconern:
        //  1. sum: right if it's on only iteration/ wrong if it's for both recursion !!!

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length -1 ;
        int start = 0;
        List<Integer> tripet = new LinkedList<>();
        List<List<Integer>> tripets = new ArrayList<List<Integer>>();
        backtrack (tripets, tripet,nums, start, 0);
        return tripets;
    }

    private void backtrack (List<List<Integer>> triplets, List<Integer> tripet, int[] nums, int start, int sum){
        //base case
        if(tripet.size() == 3){
            if(sum == 0) {
                List<Integer> tripetTemp = new ArrayList<>(tripet);
                Collections.sort(tripetTemp);
                if(!triplets.contains(tripetTemp)) { // prevent different order triplet
                    triplets.add(new LinkedList<>(tripetTemp));
                }
            }
            return;
        }

        //recur
        for (int i = start; i < nums.length; i++) {
            tripet.add(nums[i]);
            sum = sum + nums[i];
            backtrack(triplets, tripet, nums, ++start, sum);
            tripet.remove(tripet.size()-1);
            sum = sum - nums[i];
        }
    }

    //loop 0: start = 0, sum = -1, com[-1]
//          : rec 1: loop 1: start = 1, sum = -1, com[-1, 0]
//                    rec 2: loop 2: start 2, sum = 0, com [-1, 0, 1] -> sum = -1
//                           rec 3: -> tripets[[-1, 0, 1]]

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        ThreeSum threeSum = new ThreeSum();
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
