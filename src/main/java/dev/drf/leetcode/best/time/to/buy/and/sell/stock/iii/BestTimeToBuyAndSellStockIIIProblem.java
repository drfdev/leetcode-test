package dev.drf.leetcode.best.time.to.buy.and.sell.stock.iii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 * Used solution:
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/solutions/39615/my-explanation-for-o-n-solution/
 */
public class BestTimeToBuyAndSellStockIIIProblem implements Problem {
    public int maxProfit(int[] prices) {
        int sellStockNotAfterDay = 0;
        int finalProfit = 0;
        int minimumProfit = Integer.MIN_VALUE;
        int buyStockNotAfterDay = Integer.MIN_VALUE;

        for (int price : prices) {
            minimumProfit = Math.max(minimumProfit, -price);
            sellStockNotAfterDay = Math.max(sellStockNotAfterDay, minimumProfit + price);
            buyStockNotAfterDay = Math.max(buyStockNotAfterDay, sellStockNotAfterDay - price);
            finalProfit = Math.max(finalProfit, buyStockNotAfterDay + price);
        }
        return finalProfit;
    }
}
