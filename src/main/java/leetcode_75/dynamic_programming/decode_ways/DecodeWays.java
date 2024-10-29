package leetcode_75.dynamic_programming.decode_ways;

import leetcode_75.dynamic_programming.house_robber.HouseRobber.HouseRobber;

import java.util.*;

public class DecodeWays {

    static Map<String, String> dict = new HashMap<String, String>() {
        {
        put("1","A");
        put("2","B");
        put("3","C");
        put("4","D");
        put("5","E");
        put("6","F");
        put("7","G");
        put("8","H");
        put("9","I");
        put("10","J");
        put("11","K");
        put("12","L");
        put("13","M");
        put("14","N");
        put("15","O");
        put("16","P");
        put("17","Q");
        put("18","R");
        put("19","S");
        put("20","T");
        put("21","U");
        put("22","V");
        put("23","W");
        put("24","X");
        put("25","Y");
        put("26","Z");
    }
    };

    public static int[] memo;

    public int numDecodings(String s) {
        // using String[] !!!
        List<String> listStr = new ArrayList<>(Arrays.asList(s.split("")));
        return recNum(listStr, 0, new StringBuilder());
    }

    public int recNum(List<String> lstStr, int index, StringBuilder currentResult){
        int accumulator = 0;
        //base case
        if(index > lstStr.size()){
            return 0;
        }
        if(index == lstStr.size()){
            System.out.println(currentResult.toString());
            return 1;
        }
        if(lstStr.get(index).equalsIgnoreCase("0")){ //
            return 0;
        }
        if(memo[index] != -1){
            return memo[index];
        }
        currentResult.append(dict.get(lstStr.get(index))); //adding 1 element into current result
        accumulator += recNum(lstStr , index+1, currentResult); // 1-element group
        currentResult.deleteCharAt(currentResult.length() - 1);

        if(index + 1 < lstStr.size() ) {
            if (dict.get(lstStr.get(index).concat(lstStr.get(index + 1))) != null) {
                currentResult.append(dict.get(lstStr.get(index).concat(lstStr.get(index + 1)))); // adding 1 element ( 2 element in total ) into current result
                accumulator += recNum(lstStr, index + 2, currentResult); // 2-elements group
                currentResult.deleteCharAt(currentResult.length() - 1); //backtrack to remove 1  last elements from current result
            }
        }
        memo[index] = accumulator;
        return  memo[index];
    }

    public static void main(String[] args) {
        String s = "11106";
        memo = new int[s.length()];
        Arrays.fill(memo, -1);
        DecodeWays decodeWays = new DecodeWays();
        System.out.println(decodeWays.numDecodings(s));
    }
}
