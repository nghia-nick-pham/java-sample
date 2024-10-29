package leetcode_75.dynamic_programming.decode_ways;

import java.util.*;

public class DecodeWayBottomUpConverting {
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

    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[n] = 1; // Base case: empty string has one way to decode (empty string)
        dp[n - 1] = s.charAt(n - 1) == '0' ? 0 : 1; // Base case: single digit

        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                dp[i] = 0; // Invalid decoding if starting with '0'
            } else {
                dp[i] = dp[i + 1]; // Consider single digit decoding
                String twoDigits = s.substring(i, i + 2);
                if (dict.containsKey(twoDigits)) {
                    dp[i] += dp[i + 2]; // Add decodings considering two digits
                }
            }
        }

        return dp[0]; // Result is at the beginning of the dp table
    }

    public static void main(String[] args) {
        String s = "11106";
        DecodeWayBottomUpConverting decodeWays = new DecodeWayBottomUpConverting();
        System.out.println(decodeWays.numDecodings(s));
    }

}
