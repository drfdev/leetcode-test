package dev.drf.leetcode.best.time.to.buy.and.sell.stock.with.transaction.fee;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 * Used solution:
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/solutions/1112088/js-python-java-c-very-simple-state-machine-solution-w-explanation/
 */
public class BestTimeToBuyAndSellStockWithTransactionFeeProblem2 implements Problem {
    public int maxProfit(int[] prices, int fee) {
        int len = prices.length;
        int buying = 0;
        int selling = -prices[0];

        for (int i = 1; i < len; i++) {
            buying = Math.max(buying, selling + prices[i] - fee);
            selling = Math.max(selling, buying - prices[i]);
        }

        return buying;
    }
}
