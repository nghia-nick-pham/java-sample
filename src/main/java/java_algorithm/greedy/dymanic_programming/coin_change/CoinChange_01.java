package java_algorithm.greedy.dymanic_programming.coin_change;

public class CoinChange_01 {

    public static final int coins[] = { 1, 5, 2 };
    public static final int amount = 10;

    static int min(int a, int b) { return (a < b) ? a : b; }

    // Returns the value of maximum profit
    int rec(int m, int n){
//       todo if(n<=0 & m!=0){
//            return Integer.MIN_VALUE;
//        }
        //base case
        if(m == 0 || n <= 0){
            return 0;
        }

        if(coins[n-1] > m){
            return rec(m, n - 1);
        }else {
            int tmp1 = 1 + rec(m-coins[n-1],n);
            int tmp2 = 1 + rec(m-coins[n-1], n-1);
            return min(tmp1, tmp2);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {

        CoinChange_01 coinChange_01 =new CoinChange_01();
        System.out.println(coinChange_01.rec(amount, coins.length));
    }
}
