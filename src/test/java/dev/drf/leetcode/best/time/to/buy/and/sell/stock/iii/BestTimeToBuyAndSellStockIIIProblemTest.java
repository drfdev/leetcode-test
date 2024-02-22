package dev.drf.leetcode.best.time.to.buy.and.sell.stock.iii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockIIIProblemTest {
    private final BestTimeToBuyAndSellStockIIIProblem problem = new BestTimeToBuyAndSellStockIIIProblem();

    @Test
    void exampled1() {
        /*
        Input: prices = [3,3,5,0,0,3,1,4]
        Output: 6
         */
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};

        var out = problem.maxProfit(prices);

        assertEquals(6, out);
    }

    @Test
    void exampled2() {
        /*
        Input: prices = [1,2,3,4,5]
        Output: 4
         */
        int[] prices = {1, 2, 3, 4, 5};

        var out = problem.maxProfit(prices);

        assertEquals(4, out);
    }

    @Test
    void exampled3() {
        /*
        Input: prices = [7,6,4,3,1]
        Output: 0
         */
        int[] prices = {7, 6, 4, 3, 1};

        var out = problem.maxProfit(prices);

        assertEquals(0, out);
    }
}
