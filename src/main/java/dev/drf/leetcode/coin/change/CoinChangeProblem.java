package dev.drf.leetcode.coin.change;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/coin-change/
 * Used solution:
 * https://www.youtube.com/watch?v=H9bfqozjoqs
 */
public class CoinChangeProblem implements Problem {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        int[] dp = new int[amount + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp.length;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] == dp.length ? -1 : dp[amount];
    }
}
