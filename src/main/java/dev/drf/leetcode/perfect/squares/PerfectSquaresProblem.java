package dev.drf.leetcode.perfect.squares;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/perfect-squares/
 * Used solution:
 * https://leetcode.com/problems/perfect-squares/solutions/2837992/java-recursion-memoization-dp-3-square-theorem-explained/
 */
public class PerfectSquaresProblem implements Problem {
    public int numSquares(int n) {
        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n + 1];
        return calculate(n, dp);
    }

    private int calculate(int value, int[] dp) {
        if (value < 4) {
            return value;
        }

        if (dp[value] != 0) {
            return dp[value];
        }

        int ans = value;

        for (int i = 1; i * i <= value; i++) {
            int square = i * i;
            ans = Math.min(ans, 1 + calculate(value - square, dp));
        }

        dp[value] = ans;
        return ans;
    }
}
