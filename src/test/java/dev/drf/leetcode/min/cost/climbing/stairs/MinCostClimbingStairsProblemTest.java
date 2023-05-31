package dev.drf.leetcode.min.cost.climbing.stairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCostClimbingStairsProblemTest {
    private final MinCostClimbingStairsProblem problem = new MinCostClimbingStairsProblem();

    @Test
    void example1() {
        /*
        Input: cost = [10,15,20]
        Output: 15
         */
        int[] cost = new int[]{10, 15, 20};

        int value = problem.minCostClimbingStairs(cost);

        assertEquals(15, value);
    }

    @Test
    void example2() {
        /*
        Input: cost = [1,100,1,1,1,100,1,1,100,1]
        Output: 6
         */
        int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        int value = problem.minCostClimbingStairs(cost);

        assertEquals(6, value);
    }
}
