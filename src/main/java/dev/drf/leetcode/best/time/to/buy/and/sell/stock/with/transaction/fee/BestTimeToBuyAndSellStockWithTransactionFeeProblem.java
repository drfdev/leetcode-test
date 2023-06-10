package dev.drf.leetcode.best.time.to.buy.and.sell.stock.with.transaction.fee;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 */
@Deprecated
public class BestTimeToBuyAndSellStockWithTransactionFeeProblem implements Problem {
    public int maxProfit(int[] prices, int fee) {
        return calculateMaxProfit(prices, 0, 0, fee);
    }

    private int calculateMaxProfit(int[] prices, int cursor, int sum, int fee) {
        int step = 1;
        int maxSum = Integer.MIN_VALUE;
        while (cursor + step < prices.length) {
            int leftValue = prices[cursor];
            int rightValue = prices[cursor + step];

            int currentSum = (rightValue - leftValue - fee) + sum;
            int currentMaxSum = calculateMaxProfit(prices, cursor + step + 1, currentSum, fee);

            maxSum = Math.max(maxSum, currentMaxSum);

            step++;
        }

        return Math.max(maxSum, sum);
    }
}
