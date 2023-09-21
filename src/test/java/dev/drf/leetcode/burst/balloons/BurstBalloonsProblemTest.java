package dev.drf.leetcode.burst.balloons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurstBalloonsProblemTest {
    private final BurstBalloonsProblem problem = new BurstBalloonsProblem();

    @Test
    void example1() {
        /*
        Input: nums = [3,1,5,8]
        Output: 167
         */
        int[] nums = new int[]{
                3, 1, 5, 8
        };

        var coins = problem.maxCoins(nums);

        assertEquals(167, coins);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,5]
        Output: 10
         */
        int[] nums = new int[]{
                1, 5
        };

        var coins = problem.maxCoins(nums);

        assertEquals(10, coins);
    }
}
