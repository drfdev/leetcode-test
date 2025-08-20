package dev.drf.leetcode.max.increase.to.keep.city.skyline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxIncreaseToKeepCitySkylineProblemTest {
    private final MaxIncreaseToKeepCitySkylineProblem problem = new MaxIncreaseToKeepCitySkylineProblem();

    @Test
    void example1() {
        // Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
        // Output: 35
        int[][] grid = {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };

        var out = problem.maxIncreaseKeepingSkyline(grid);

        assertEquals(35, out);
    }

    @Test
    void example2() {
        // Input: grid = [[0,0,0],[0,0,0],[0,0,0]]
        // Output: 0
        int[][] grid = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        var out = problem.maxIncreaseKeepingSkyline(grid);

        assertEquals(0, out);
    }
}
