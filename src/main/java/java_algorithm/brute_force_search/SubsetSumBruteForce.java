package java_algorithm.brute_force_search;

public class SubsetSumBruteForce {
    // Helper function to check if a subset sum equals the target
    private static boolean subsetSumHelper(int[] nums, int target, int index) {
        if (target == 0) return true; // Base case: target is achieved
        if (index >= nums.length || target < 0) return false; // Base case: out of bounds or negative target

        // Include the current element and check if the target can be achieved
        boolean include = subsetSumHelper(nums, target - nums[index], index + 1);

        // Exclude the current element and check if the target can be achieved
        boolean exclude = subsetSumHelper(nums, target, index + 1);

        // Return true if either including or excluding the current element leads to the target
        return include || exclude;
    }

    // Main function to check if a subset sum equals the target
    public static boolean subsetSum(int[] nums, int target) {
        return subsetSumHelper(nums, target, 0);
    }

    // Main method to test the subset sum function
    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int target = 9;
        System.out.println("Does a subset sum to " + target + "? " + subsetSum(nums, target)); // true

        target = 30;
        System.out.println("Does a subset sum to " + target + "? " + subsetSum(nums, target)); // false
    }
}
