package leetcode_75.array.buy_and_sell_stock;

public class Solution {

    public static void main(String[] args) {

//        int[] prices = new int[]{7,1,5,3,6,4};
        int[] prices = new int[]{6,1,3,2,4,7};
//        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        int tempResult;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                tempResult = prices[j] - prices[i];
                if(tempResult > 0 && tempResult > result ){
                    result = tempResult;
                }
            }
        }

        return result;
    }
}
