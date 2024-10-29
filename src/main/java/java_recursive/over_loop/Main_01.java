package java_recursive.over_loop;

public class Main_01 {

    static int _lis(int arr[], int n) {
        // Base case
        if (n == 1)
            return 1;

        int res, max_ending_here = 1;

        for (int i = 1; i < n; i++) {
            System.out.println("Level: " + n + " - Itegration: " + i);
            res = _lis(arr, i);
            System.out.println("arr[i - 1] :" + arr[i - 1]);
            System.out.println("arr[n - 1] :" + arr[n - 1]);
            if (arr[i - 1] < arr[n - 1]
                    && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }

        System.out.println("--------" + max_ending_here + "---------");
        return max_ending_here;
    }

    public static void main(String[] args) {
//        _lis(new int[]{3, 7 ,5}, 3);
//        int[]arr = new int[]{10, 22, 9, 33, 21, 50, 41, 60};
        int[]arr = new int[]{3, 10, 2, 1, 20};
        _lis(arr, arr.length);
    }
}
