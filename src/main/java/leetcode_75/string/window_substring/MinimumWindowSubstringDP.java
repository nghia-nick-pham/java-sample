package leetcode_75.string.window_substring;

public class MinimumWindowSubstringDP {

    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];
        int minWindowSize = Integer.MAX_VALUE;
        int startIndex = -1;

        // Initialize base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1; // Base case: empty t
        }
        for (int j = 1; j <= m; j++) {
            dp[n][j] = Integer.MAX_VALUE; // Base case: end of s
        }

        // Fill the DP table
        for (int j = 1; j <= m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i + 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i + 1][j] + 1;
                }
                // Check if current window is smaller and contains all of t
                if (j == m && dp[i][j] < minWindowSize) {
                    minWindowSize = dp[i][j];
                    startIndex = i;
                }
            }
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minWindowSize);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        MinimumWindowSubstringDP solution = new MinimumWindowSubstringDP();
        String minWindow = solution.minWindow(s, t);
        System.out.println("Minimum window substring: " + minWindow);
    }
}
