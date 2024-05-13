package dev.drf.leetcode.score.after.flipping.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreAfterFlippingMatrixProblemTest {
    private final ScoreAfterFlippingMatrixProblem problem = new ScoreAfterFlippingMatrixProblem();

    @Test
    void example1() {
        /*
        Input: grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
        Output: 39
         */
        int[][] grid = {
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0}
        };

        var out = problem.matrixScore(grid);

        assertEquals(39, out);
    }

    @Test
    void example2() {
        /*
        Input: grid = [[0]]
        Output: 1
         */
        int[][] grid = {
                {0}
        };

        var out = problem.matrixScore(grid);

        assertEquals(1, out);
    }
}
