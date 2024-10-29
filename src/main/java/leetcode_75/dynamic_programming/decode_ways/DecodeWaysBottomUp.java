package leetcode_75.dynamic_programming.decode_ways;

import java.util.Arrays;

public class DecodeWaysBottomUp {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                dp[i] += dp[i-1];
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
//            System.out.println(i + " " + dp[i]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        String s = "11106";
        String s1 = "12";
        String s2 = "226";
        String s3 = "06";
        String s4 = "111";
        DecodeWaysBottomUp decodeWaysBottomUp = new DecodeWaysBottomUp();
        System.out.println(decodeWaysBottomUp.numDecodings(s4));
    }
}
