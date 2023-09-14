package dev.drf.leetcode.coin.change;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeProblemTest {
    private final CoinChangeProblem problem = new CoinChangeProblem();

    @Test
    void example1() {
        /*
        Input: coins = [1,2,5], amount = 11
        Output: 3
         */
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;

        int result = problem.coinChange(coins, amount);

        assertEquals(3, result);
    }

    @Test
    void example2() {
        /*
        Input: coins = [2], amount = 3
        Output: -1
         */
        int[] coins = new int[]{2};
        int amount = 3;

        int result = problem.coinChange(coins, amount);

        assertEquals(-1, result);
    }

    @Test
    void example3() {
        /*
        Input: coins = [1], amount = 0
        Output: 0
         */
        int[] coins = new int[]{1};
        int amount = 0;

        int result = problem.coinChange(coins, amount);

        assertEquals(0, result);
    }
}
