package dev.drf.leetcode.coin.change.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/coin-change-ii/
 * Used solution:
 * https://www.youtube.com/watch?v=Mjy4hd2xgrs
 */
public class CoinChangeIIProblem implements Problem {
    public int change(int amount, int[] coins) {
        if (coins == null) {
            return 0;
        }

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (coin <= i) {
                    dp[i] += dp[i - coin];
                }
            }
        }

        return dp[amount];
    }
}
