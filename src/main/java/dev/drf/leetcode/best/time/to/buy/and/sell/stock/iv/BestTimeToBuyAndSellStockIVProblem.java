package dev.drf.leetcode.best.time.to.buy.and.sell.stock.iv;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
 * Used solution:
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/solutions/54117/clean-java-dp-solution-with-comment/
 */
public class BestTimeToBuyAndSellStockIVProblem implements Problem {
    public int maxProfit(int k, int[] prices) {
        final int size = prices.length;
        if (size <= 1) {
            return 0;
        }

        //if k >= n/2, then you can make maximum number of transactions.
        if (k >= size / 2) {
            int maxPro = 0;
            for (int i = 1; i < size; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxPro += prices[i] - prices[i - 1];
                }
            }
            return maxPro;
        }

        int[][] dp = new int[k + 1][size];
        for (int i = 1; i <= k; i++) {
            int localMax = dp[i - 1][0] - prices[0];
            for (int j = 1; j < size; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + localMax);
                localMax = Math.max(localMax, dp[i - 1][j] - prices[j]);
            }
        }
        return dp[k][size - 1];
    }
}
