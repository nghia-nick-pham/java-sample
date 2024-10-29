package java_recursive;

import java.util.*;

public class leetcode_conin_change {

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5,6}, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        List<Integer> list = new ArrayList<>();
        //validator
        for (int i:coins
             ) {
            list.add(Integer.valueOf(i));
        }
        list.sort(null);

        //processing
        return recur(list, amount,list.size()-1);
    }

        private static int recur(List setCoins, Integer amount, int i){

            Integer coin = (Integer) (setCoins.get(i));
            if(amount == 0){
                return 0;
            }
            if(amount >= coin){
                return 1 + recur(setCoins, amount - coin, i);
            } else if (amount < coin){
                return recur(setCoins, amount, --i);
            } else {
                return -1;
            }
        }

}
