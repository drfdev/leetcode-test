package dev.drf.leetcode.minimum.falling.path.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumFallingPathSumProblemTest {
//    private final MinimumFallingPathSumProblem problem = new MinimumFallingPathSumProblem();
    private final MinimumFallingPathSumProblem2 problem = new MinimumFallingPathSumProblem2();

    @Test
    void example1() {
        /*
        Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
        Output: 13
         */
        int[][] matrix = new int[][]{
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };

        int out = problem.minFallingPathSum(matrix);

        assertEquals(13, out);
    }

    @Test
    void example2() {
        /*
        Input: matrix = [[-19,57],[-40,-5]]
        Output: -59
         */
        int[][] matrix = new int[][]{
                {-19, 57},
                {-40, -5}
        };

        int out = problem.minFallingPathSum(matrix);

        assertEquals(-59, out);
    }

    @Test
    void failed1() {
        // [[100,-42,-46,-41],[31,97,10,-10],[-58,-51,82,89],[51,81,69,-51]]
        // -36
        int[][] matrix = new int[][]{
                {100, -42, -46, -41},
                {31, 97, 10, -10},
                {-58, -51, 82, 89},
                {51, 81, 69, -51}
        };

        int out = problem.minFallingPathSum(matrix);

        assertEquals(-36, out);
    }
}
