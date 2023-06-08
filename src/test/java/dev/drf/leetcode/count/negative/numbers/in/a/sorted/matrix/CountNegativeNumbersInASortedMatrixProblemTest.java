package dev.drf.leetcode.count.negative.numbers.in.a.sorted.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNegativeNumbersInASortedMatrixProblemTest {
    private final CountNegativeNumbersInASortedMatrixProblem problem = new CountNegativeNumbersInASortedMatrixProblem();

    @Test
    void example1() {
        /*
        Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
        Output: 8
         */
        int[][] grid = new int[][]{
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        var count = problem.countNegatives(grid);

        assertEquals(8, count);
    }

    @Test
    void example2() {
        /*
        Input: grid = [[3,2],[1,0]]
        Output: 0
         */
        int[][] grid = new int[][]{
                {3, 2},
                {1, 0}
        };

        var count = problem.countNegatives(grid);

        assertEquals(0, count);
    }
}
