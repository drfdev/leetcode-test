package dev.drf.leetcode.ugly.number.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/ugly-number-ii/
 * Used solution:
 * https://leetcode.com/problems/ugly-number-ii/solutions/69362/o-n-java-solution/
 */
public class UglyNumberIIProblem implements Problem {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;

        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        for (int i = 1; i < n; i++) {
            int dp2 = dp[i2] * 2;
            int dp3 = dp[i3] * 3;
            int dp5 = dp[i5] * 5;

            int nextDp = Math.min(dp2, Math.min(dp3, dp5));
            dp[i] = nextDp;

            if (nextDp == dp2) {
                i2++;
            }
            if (nextDp == dp3) {
                i3++;
            }
            if (nextDp == dp5) {
                i5++;
            }
        }

        return dp[n - 1];
    }
}
