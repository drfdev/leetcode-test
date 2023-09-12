package dev.drf.leetcode.set.matrix.zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetMatrixZeroesProblemTest {
    private final SetMatrixZeroesProblem problem = new SetMatrixZeroesProblem();

    private void assertMatrix(int[][] expected, int[][] matrix) {
        assertEquals(expected.length, matrix.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].length, matrix[i].length);
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], matrix[i][j]);
            }
        }
    }

    @Test
    void example1() {
        /*
        Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
        Output: [[1,0,1],[0,0,0],[1,0,1]]
         */
        int[][] matrix = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] expected = new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };

        problem.setZeroes(matrix);

        assertMatrix(expected, matrix);
    }

    @Test
    void example2() {
        /*
        Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
         */
        int[][] matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int[][] expected = new int[][]{
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };

        problem.setZeroes(matrix);

        assertMatrix(expected, matrix);
    }
}
