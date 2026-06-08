package dev.drf.leetcode.minimum.cost.to.reach.every.position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinimumCostToReachEveryPositionProblemTest {
    private final MinimumCostToReachEveryPositionProblem problem = new MinimumCostToReachEveryPositionProblem();

    @Test
    void example1() {
        // Input: cost = [5,3,4,1,3,2]
        // Output: [5,3,3,1,1,1]
        int[] cost = {5, 3, 4, 1, 3, 2};

        int[] out = problem.minCosts(cost);

        int[] expected = {5, 3, 3, 1, 1, 1};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: cost = [1,2,4,6,7]
        // Output: [1,1,1,1,1]
        int[] cost = {1, 2, 4, 6, 7};

        int[] out = problem.minCosts(cost);

        int[] expected = {1, 1, 1, 1, 1};
        assertArrayEquals(expected, out);
    }
}
