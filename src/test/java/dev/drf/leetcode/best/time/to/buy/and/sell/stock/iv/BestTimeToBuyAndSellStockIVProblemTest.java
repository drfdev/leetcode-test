package dev.drf.leetcode.best.time.to.buy.and.sell.stock.iv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockIVProblemTest {
    private final BestTimeToBuyAndSellStockIVProblem problem = new BestTimeToBuyAndSellStockIVProblem();

    @Test
    void example1() {
        /*
        Input: k = 2, prices = [2,4,1]
        Output: 2
         */
        int k = 2;
        int[] prices = {2, 4, 1};

        var out = problem.maxProfit(k, prices);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        /*
        Input: k = 2, prices = [3,2,6,5,0,3]
        Output: 7
         */
        int k = 2;
        int[] prices = {3, 2, 6, 5, 0, 3};

        var out = problem.maxProfit(k, prices);

        assertEquals(7, out);
    }
}
