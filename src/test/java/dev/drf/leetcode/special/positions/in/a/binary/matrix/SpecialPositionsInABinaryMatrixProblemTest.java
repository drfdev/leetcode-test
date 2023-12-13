package dev.drf.leetcode.special.positions.in.a.binary.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialPositionsInABinaryMatrixProblemTest {
    private final SpecialPositionsInABinaryMatrixProblem problem = new SpecialPositionsInABinaryMatrixProblem();

    @Test
    void example1() {
        /*
        Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
        Output: 1
         */
        int[][] mat = new int[][]{
                {1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}
        };

        var count = problem.numSpecial(mat);

        assertEquals(1, count);
    }

    @Test
    void example2() {
        /*
        Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
        Output: 3
         */
        int[][] mat = new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        var count = problem.numSpecial(mat);

        assertEquals(3, count);
    }

    @Test
    void failed1() {
        // mat = [[0,0,0,0,0,1,0,0],[0,0,0,0,1,0,0,1],[0,0,0,0,1,0,0,0],[1,0,0,0,1,0,0,0],[0,0,1,1,0,0,0,0]]
        int[][] mat = new int[][]{
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0}
        };

        var count = problem.numSpecial(mat);

        assertEquals(1, count);
    }
}
