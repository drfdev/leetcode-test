package dev.drf.leetcode.count.square.submatrices.with.all.ones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSquareSubmatricesWithAllOnesProblemTest {
    private final CountSquareSubmatricesWithAllOnesProblem problem = new CountSquareSubmatricesWithAllOnesProblem();

    @Test
    void example1() {
        // Input: matrix =
        // [
        //   [0,1,1,1],
        //   [1,1,1,1],
        //   [0,1,1,1]
        // ]
        // Output: 15
        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };

        int count = problem.countSquares(matrix);

        assertEquals(15, count);
    }

    @Test
    void example2() {
        // Input: matrix =
        // [
        //   [1,0,1],
        //   [1,1,0],
        //   [1,1,0]
        // ]
        // Output: 7
        int[][] matrix = {
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 0}
        };

        int count = problem.countSquares(matrix);

        assertEquals(7, count);
    }
}
