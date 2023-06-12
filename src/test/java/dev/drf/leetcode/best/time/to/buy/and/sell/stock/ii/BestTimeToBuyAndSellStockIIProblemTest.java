package dev.drf.leetcode.best.time.to.buy.and.sell.stock.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockIIProblemTest {
    private final BestTimeToBuyAndSellStockIIProblem problem = new BestTimeToBuyAndSellStockIIProblem();

    @Test
    void example1() {
        /*
        Input: prices = [7,1,5,3,6,4]
        Output: 7
         */
        int[] prices = new int[]{
                7, 1, 5, 3, 6, 4
        };

        var value = problem.maxProfit(prices);

        assertEquals(7, value);
    }

    @Test
    void example2() {
        /*
        Input: prices = [1,2,3,4,5]
        Output: 4
         */
        int[] prices = new int[]{
                1, 2, 3, 4, 5
        };

        var value = problem.maxProfit(prices);

        assertEquals(4, value);
    }

    @Test
    void example3() {
        /*
        Input: prices = [7,6,4,3,1]
        Output: 0
         */
        int[] prices = new int[]{
                7, 6, 4, 3, 1
        };

        var value = problem.maxProfit(prices);

        assertEquals(0, value);
    }
}
