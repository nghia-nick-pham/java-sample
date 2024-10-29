package java_algorithm.greedy.dymanic_programming.coin_change;

import java.util.Arrays;

public class CoinChange_CombinationRepetitions {

    public static final int coins[] = { 1, 2, 3 };
    public static final int amount = 3;



    void rec(int start, int currentIndex, int coinsLength, int amount, int []arr,  int countMain, int countTmp){
        //todo:
        //1. Ngưỡng đầu
        //2. return countMain
        //3. base case: not expected condition:

        //base case

            processCombination(arr);
            if (amount == 0) {
//                if (countMain == 0 || (countMain > 0 & countTmp < countMain)) {
//                if (countMain == 0 || (countMain > 0 & countTmp < countMain)) {
//                    countMain = countTmp;
                    System.out.println("countTmp: " + countTmp);
//                }
                countTmp = 0;
                return;
            } else if (amount < 0) {
                countTmp = 0;
                return;
            }

        if(currentIndex == coinsLength) {
            countTmp = 0;
            return;
        }


        for (int i = start; i < coinsLength  ; i++) {
//            countTmp++;
            arr[currentIndex] = coins[i];
            amount = amount - coins[i];
            rec(i, currentIndex + 1,coinsLength, amount, arr, countMain, countTmp );
        }


    }
    public static void processCombination(int[] combination) {
        // You can modify this method to do something with the generated combination
        System.out.println(Arrays.toString(combination));
    }

    public static void main(String[] args) {
        CoinChange_CombinationRepetitions combinationRepetitions = new CoinChange_CombinationRepetitions();
        combinationRepetitions.rec(0, 0,coins.length, amount, new int[3], 0, 0 );
    }

}
