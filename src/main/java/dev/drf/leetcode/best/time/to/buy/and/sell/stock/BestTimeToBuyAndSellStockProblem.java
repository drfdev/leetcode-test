package dev.drf.leetcode.best.time.to.buy.and.sell.stock;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStockProblem implements Problem {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int buying = 0;
        int selling = -prices[0];

        for (int i = 1; i < len; i++) {
            buying = Math.max(buying, selling + prices[i]);
            selling = Math.max(selling, -prices[i]);
        }

        return buying;
    }
}
