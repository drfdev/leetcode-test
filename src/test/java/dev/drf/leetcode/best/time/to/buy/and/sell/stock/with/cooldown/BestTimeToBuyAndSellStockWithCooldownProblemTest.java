package dev.drf.leetcode.best.time.to.buy.and.sell.stock.with.cooldown;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockWithCooldownProblemTest {
    private final BestTimeToBuyAndSellStockWithCooldownProblem problem = new BestTimeToBuyAndSellStockWithCooldownProblem();

    @Test
    void example1() {
        /*
        Input: prices = [1,2,3,0,2]
        Output: 3
         */
        int[] prices = new int[]{
                1, 2, 3, 0, 2
        };

        var out = problem.maxProfit(prices);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        /*
        Input: prices = [1]
        Output: 0
         */
        int[] prices = new int[]{
                1
        };

        var out = problem.maxProfit(prices);

        assertEquals(0, out);
    }
}
