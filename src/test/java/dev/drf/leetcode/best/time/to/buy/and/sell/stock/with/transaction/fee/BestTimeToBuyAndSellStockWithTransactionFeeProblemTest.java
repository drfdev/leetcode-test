package dev.drf.leetcode.best.time.to.buy.and.sell.stock.with.transaction.fee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockWithTransactionFeeProblemTest {
    private final BestTimeToBuyAndSellStockWithTransactionFeeProblem2 problem = new BestTimeToBuyAndSellStockWithTransactionFeeProblem2();

    @Test
    void example1() {
        /*
        Input: prices = [1,3,2,8,4,9], fee = 2
        Output: 8
         */
        int[] prices = new int[]{
                1, 3, 2, 8, 4, 9
        };
        int fee = 2;

        var result = problem.maxProfit(prices, fee);

        assertEquals(8, result);
    }

    @Test
    void example2() {
        /*
        Input: prices = [1,3,7,5,10,3], fee = 3
        Output: 6
         */
        int[] prices = new int[]{
                1, 3, 7, 5, 10, 3
        };
        int fee = 3;

        var result = problem.maxProfit(prices, fee);

        assertEquals(6, result);
    }

    @Test
    void failed1() {
        // [4,5,2,4,3,3,1,2,5,4]
        // fee = 1
        // expected = 4

        int[] prices = new int[]{
                4, 5, 2, 4, 3, 3, 1, 2, 5, 4
        };
        int fee = 1;

        var result = problem.maxProfit(prices, fee);

        assertEquals(4, result);
        // 4 -> 5 = 1 / 0
        // 2 -> 4 = 2 / 1
        // 3 -> 3 = 0 / -1
        // 1 -> 5 = 4 / 3
        // ?? wtf ??
    }
}
