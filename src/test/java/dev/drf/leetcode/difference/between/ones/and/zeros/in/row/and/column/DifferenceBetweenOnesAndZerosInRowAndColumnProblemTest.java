package dev.drf.leetcode.difference.between.ones.and.zeros.in.row.and.column;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DifferenceBetweenOnesAndZerosInRowAndColumnProblemTest {
    private final DifferenceBetweenOnesAndZerosInRowAndColumnProblem problem = new DifferenceBetweenOnesAndZerosInRowAndColumnProblem();

    @Test
    void example1() {
        /*
        Input: grid = [[0,1,1],[1,0,1],[0,0,1]]
        Output: [[0,0,4],[0,0,4],[-2,-2,2]]
         */
        int[][] grid = new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {0, 0, 1}
        };

        var diff = problem.onesMinusZeros(grid);

        int[][] expected = new int[][]{
                {0, 0, 4},
                {0, 0, 4},
                {-2, -2, 2}
        };
        assertArrayEquals(expected, diff);
    }

    @Test
    void example2() {
        /*
        Input: grid = [[1,1,1],[1,1,1]]
        Output: [[5,5,5],[5,5,5]]
         */
        int[][] grid = new int[][]{
                {1, 1, 1},
                {1, 1, 1}
        };

        var diff = problem.onesMinusZeros(grid);

        int[][] expected = new int[][]{
                {5, 5, 5},
                {5, 5, 5}
        };
        assertArrayEquals(expected, diff);
    }
}
