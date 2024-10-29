package java_algorithm.dynamic_programming.bitmask;

import java.util.*;

public class BitmaskingDP {
    static final int MAXN = 20;
    static long[] dp = new long[1 << MAXN];
    static int[][] a = new int[MAXN][MAXN];

    static long calc(int n, int mask) {
        int k = Integer.bitCount(mask);
        if (k == n) {
            return 1;
        }

        if (dp[mask] != -1) {
            return dp[mask];
        }

        long ans = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i][k] == 1 && (mask & (1 << i)) == 0) {
                ans += calc(n, mask | (1 << i));
            }
        }

        return dp[mask] = ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    a[i][j] = sc.nextInt();
                }
            }

            Arrays.fill(dp, -1);
            calc(n, 0);

            System.out.println(dp[0]);
        }
    }
}
