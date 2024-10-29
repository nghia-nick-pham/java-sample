package java_algorithm.greedy.dymanic_programming.coin_change.greedy_vs_dp;

import java.util.Arrays;

public class CoinChangeDP {

    public static int minCoinsDP(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // Base case: 0 coins needed for amount 0

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return (dp[amount] != Integer.MAX_VALUE) ? dp[amount] : -1;
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        int amount = 30;
        int minCoins = minCoinsDP(coins, amount);
        if (minCoins != -1) {
            System.out.println("Minimum coins (DP): " + minCoins);
        } else {
            System.out.println("No solution possible with given coins.");
        }
    }
}
