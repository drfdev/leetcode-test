package dev.drf.leetcode.best.time.to.buy.and.sell.stock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockProblemTest {
    private final BestTimeToBuyAndSellStockProblem problem = new BestTimeToBuyAndSellStockProblem();

    @Test
    void example1() {
        /*
        Input: prices = [7,1,5,3,6,4]
        Output: 5
         */
        int[] prices = new int[]{
                7, 1, 5, 3, 6, 4
        };

        var value = problem.maxProfit(prices);

        assertEquals(5, value);
    }

    @Test
    void example2() {
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
