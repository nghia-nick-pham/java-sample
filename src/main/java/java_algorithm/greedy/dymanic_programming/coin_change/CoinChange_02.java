package java_algorithm.greedy.dymanic_programming.coin_change;

public class CoinChange_02 {

    public static final int coins[] = { 1, 5, 2 };
    public static final int amount = 10;


    static int min(int a, int b, int c) {
        int mint = (a < b) ? a : b;
        return mint < c? mint:c;
    }

    // Returns the value of maximum profit
    int rec(int m, int n, int[][]arr){
//       todo if(n<=0 & m!=0){
//            return Integer.MIN_VALUE;
//        }
        //base case
        if(m == 0 || n <= 0){
            return arr[n][m] =0;
        }

        if(coins[n-1] > m){
            return arr[n][m] = rec(m, n - 1, arr);
        }else {
            int tmp1 = 1 + rec(m-coins[n-1],n, arr);
            int tmp2 = 1 + rec(m-coins[n-1], n-1, arr);
            int tmp3 = rec(m, n - 1, arr);
            return arr[n][m] = min(tmp1, tmp2, tmp3);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[][] arr = new int[coins.length+1][amount+1];

        for (int i = 0; i < coins.length+1; i++) {
            for (int j = 0; j < amount+1; j++) {
                arr[i][j] = -1;
            }
        }

        CoinChange_02 coinChange_01 =new CoinChange_02();
        int count = (coinChange_01.rec(amount, coins.length, arr));
        System.out.println(count);
    }
}
