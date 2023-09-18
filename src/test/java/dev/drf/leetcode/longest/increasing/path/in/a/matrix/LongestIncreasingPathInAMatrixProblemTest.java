package dev.drf.leetcode.longest.increasing.path.in.a.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingPathInAMatrixProblemTest {
    private final LongestIncreasingPathInAMatrixProblem problem = new LongestIncreasingPathInAMatrixProblem();

    @Test
    void example1() {
        /*
        Input: matrix = [[9,9,4],[6,6,8],[2,1,1]]
        Output: 4
         */
        int[][] matrix = new int[][]{
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };

        var len = problem.longestIncreasingPath(matrix);

        assertEquals(4, len);
    }

    @Test
    void example2() {
        /*
        Input: matrix = [[3,4,5],[3,2,6],[2,2,1]]
        Output: 4
         */
        int[][] matrix = new int[][]{
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}
        };

        var len = problem.longestIncreasingPath(matrix);

        assertEquals(4, len);
    }

    @Test
    void failed1() {
        // [[1,2]]
        int[][] matrix = new int[][]{
                {1, 2}
        };

        var len = problem.longestIncreasingPath(matrix);

        assertEquals(2, len);
    }
}
