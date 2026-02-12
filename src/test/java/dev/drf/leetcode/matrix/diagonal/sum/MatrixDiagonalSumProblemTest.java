package dev.drf.leetcode.matrix.diagonal.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixDiagonalSumProblemTest {
    private final MatrixDiagonalSumProblem problem = new MatrixDiagonalSumProblem();

    @Test
    void example1() {
        // Input: mat = [[1,2,3],
        //              [4,5,6],
        //              [7,8,9]]
        // Output: 25
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = problem.diagonalSum(mat);

        assertEquals(25, sum);
    }

    @Test
    void example2() {
        // Input: mat = [[1,1,1,1],
        //              [1,1,1,1],
        //              [1,1,1,1],
        //              [1,1,1,1]]
        // Output: 8
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };

        int sum = problem.diagonalSum(mat);

        assertEquals(8, sum);
    }

    @Test
    void example3() {
        // Input: mat = [[5]]
        // Output: 5
        int[][] mat = {
                {5}
        };

        int sum = problem.diagonalSum(mat);

        assertEquals(5, sum);
    }
}
