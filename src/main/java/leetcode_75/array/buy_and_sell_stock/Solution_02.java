package leetcode_75.array.buy_and_sell_stock;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Solution_02 {

    public static void main(String[] args) {

//        int[] prices = new int[]{7,1,5,3,6,4};
        int[] prices = new int[]{6,1,3,2,4,7};
//        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int maxi = 0;
        int minimum = prices[0];

        for (int i = 0; i < prices.length; i++) {
            minimum = min(minimum ,prices[i]);
            maxi = max(maxi ,prices[i] - minimum );
        }

        return maxi;
    }
}
