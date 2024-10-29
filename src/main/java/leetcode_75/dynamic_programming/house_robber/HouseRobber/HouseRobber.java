package leetcode_75.dynamic_programming.house_robber.HouseRobber;

public class HouseRobber {
    public int rob(int[] nums) {
        return count(nums, 0, 0);
    }

    public int count (int[] nums, int index, int curCount ){
        int result = 0;

        //base case
        if(index > nums.length - 1){
            return curCount;
        }

        for (int i = index; i < nums.length; i++) {
            result = swap(result, count(nums, i + 2, curCount + nums[i])); //avoiding the next adjacent house
        }

        return result;
    }

    //return the higher value
    public int swap(int left, int right){
        return left >= right? left: right;
    }

    public static void main(String[] args) {
        int[] set = {1,2,3,1};
        int[] set2 = {2,7,9,3,1};
        int[] set3 = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
        HouseRobber houseRobber = new HouseRobber();
        System.out.println(houseRobber.rob(set3));


    }
}
