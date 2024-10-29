package leetcode_75.array.minimum_rotated_sorted_array;

public class Sol_01 {

    public int findMin(int[] nums) {

        int min = 0;
        int max = nums.length - 1;

        return findMin(nums, min, max);

    }

    private int findMin(int[] nums, int min, int max){
        int smallest = nums[0];
        //exception
        //n == 1

        //base case
        if (min + 1 == max){
            return Math.min(nums[min], nums[max]);
        }
        //  + comparing first and last ele of each direction
        //    - if lefhand && first > medium || righthand && medium > last
        int med = (min + max) / 2;
        // int elements = max - min + 1;
        if(nums[min] > nums[med]){ // left hand
            // if(elements % 2 == 1) { //odd
            smallest = findMin(nums, min, med);
        }else if (nums[med] > nums[max]){ // right hand
            smallest = findMin(nums, med, max);
        }else{ // original array

        }

        return  smallest;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,0,1,2,4,5,6};
        Sol_01 sol_01 = new Sol_01();
        System.out.println(sol_01.findMin(arr));//0
        arr = new int[]{3,4,5,1,2};
        System.out.println(sol_01.findMin(arr));//1
        arr = new int[]{4,5,6,7,0,1,2};
        System.out.println(sol_01.findMin(arr));//0
        arr = new int[]{11,13,15,17};
        System.out.println(sol_01.findMin(arr));//11
    }
}

//concern: base case > previous case

//7,0,1,2,4,5,6 <<< 0
//7,0,1,2 <<< 0
//7,0 <<< 0
