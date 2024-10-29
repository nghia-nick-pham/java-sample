package java_algorithm.greedy.dymanic_programming.coin_change.greedy_vs_dp;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;

public class CoinChangeGreedy {

    public static int minCoinsGreedy(int[] coinsInput, int amount) {
        Integer[] newArray = ArrayUtils.toObject(coinsInput);
        Arrays.sort(newArray, Collections.reverseOrder()); // Sort coins in descending order
        int[] coins = ArrayUtils.toPrimitive(newArray);
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        return (amount == 0) ? count : -1; // -1 indicates no solution
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        int amount = 30;
        int minCoins = minCoinsGreedy(coins, amount);
        if (minCoins != -1) {
            System.out.println("Minimum coins (greedy): " + minCoins);
        } else {
            System.out.println("No solution possible with given coins.");
        }
    }
}
