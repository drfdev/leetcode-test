package dev.drf.leetcode.coin.change.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeIIProblemTest {
    private final CoinChangeIIProblem problem = new CoinChangeIIProblem();

    @Test
    void example1() {
        /*
        Input: amount = 5, coins = [1,2,5]
        Output: 4
         */
        int amount = 5;
        int[] coins = new int[]{
                1, 2, 5
        };

        var count = problem.change(amount, coins);

        assertEquals(4, count);
    }

    @Test
    void example2() {
        /*
        Input: amount = 3, coins = [2]
        Output: 0
         */
        int amount = 3;
        int[] coins = new int[]{
                2
        };

        var count = problem.change(amount, coins);

        assertEquals(0, count);
    }

    @Test
    void example3() {
        /*
        Input: amount = 10, coins = [10]
        Output: 1
         */
        int amount = 10;
        int[] coins = new int[]{
                10
        };

        var count = problem.change(amount, coins);

        assertEquals(1, count);
    }

    @Test
    void failed1() {
        // amount = 10
        // coins = [5]
        int amount = 10;
        int[] coins = new int[]{
                5
        };

        var count = problem.change(amount, coins);

        assertEquals(1, count);
    }
}
