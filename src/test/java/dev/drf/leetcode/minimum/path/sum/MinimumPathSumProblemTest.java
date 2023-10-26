package dev.drf.leetcode.minimum.path.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumPathSumProblemTest {
    private final MinimumPathSumProblem problem = new MinimumPathSumProblem();

    @Test
    void example1() {
        /*
        Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
        Output: 7
         */
        int[][] grid = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        var sum = problem.minPathSum(grid);

        assertEquals(7, sum);
    }

    @Test
    void example2() {
        /*
        Input: grid = [[1,2,3],[4,5,6]]
        Output: 12
         */
        int[][] grid = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };

        var sum = problem.minPathSum(grid);

        assertEquals(12, sum);
    }
}
