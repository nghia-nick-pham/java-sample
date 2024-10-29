package leetcode_75.array.search_rotated_sorted_array;

import leetcode_75.array.minimum_rotated_sorted_array.Sol_01;

public class SearchRotatedSortedArray {

    int searchRotatedSortedArray(int[] nums, int tar){
        int s = 0;
        int e = nums.length -1;
        int m = (s + e) / 2;
        int result = -1;

        if(nums[s] == tar){
            return s;
        } else if (nums[m] == tar) {
            return m;
        } else if (nums[e] == tar) {
            return e;
        }

        do{
            if ( nums[s] < nums[m] ){
                if (nums[s] <= tar && tar <= nums[m]){
                    //left hand
                    e = m;
                    m = (s + e) /2;
                }else {
                    //righ hand
                    s = m;
                    m = (s + e) /2;
                }
            }else{
                if (nums[m] <= tar && tar <= nums[e]){
                    //righ hand
                    s = m;
                    m = (s + e) /2;
                }else{
                    //left hand
                    e = m;
                    m = (s + e) /2;
                }
            }

            if(nums[m] == tar){
                return m;
            }

        }while (m != s && m != e );

        return result;
    }
//nums = new int[]{1,3};
//        tar = 3;
    // s0, e1, m0
    //

    public static void main(String[] args) {
//        int[] nums = new int[]{4,5,6,7,0,1,2};
//        int tar = 0;
        SearchRotatedSortedArray sol = new SearchRotatedSortedArray();
//        System.out.println(sol.searchRotatedSortedArray(nums, tar));//4
//        nums = new int[]{4,5,6,7,0,1,2};
//        tar = 3;
//        System.out.println(sol.searchRotatedSortedArray(nums, tar));//-1
//        nums = new int[]{-1};
//        tar = 0;
//        System.out.println(sol.searchRotatedSortedArray(nums, tar));//-1
        int[] nums = new int[]{1,3};
        int tar = 3;
        System.out.println(sol.search(nums, tar));//1
    }

    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<=r) {
            int m = l+(r-l)/2;
            if(nums[m] == target) return m;
            if(nums[l] <= nums[m]) {
                if(target < nums[m] && target >= nums[l]) r=m-1;
                else l=m+1;
            } else {
                if(target > nums[m] && target <= nums[r]) l=m+1;
                else r=m-1;
            }
        }
        return -1;
    }
}

// amount of eles: 0, 1 , 2
//

