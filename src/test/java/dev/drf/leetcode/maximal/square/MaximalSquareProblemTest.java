package dev.drf.leetcode.maximal.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximalSquareProblemTest {
    private final MaximalSquareProblem problem = new MaximalSquareProblem();

    @Test
    void example1() {
        /*
        Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
        Output: 4
         */
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        var out = problem.maximalSquare(matrix);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        /*
        Input: matrix = [["0","1"],["1","0"]]
        Output: 1
         */
        char[][] matrix = new char[][]{
                {'0', '1'},
                {'1', '0'}
        };

        var out = problem.maximalSquare(matrix);

        assertEquals(1, out);
    }

    @Test
    void example3() {
        /*
        Input: matrix = [["0"]]
        Output: 0
         */
        char[][] matrix = new char[][]{
                {'0'}
        };

        var out = problem.maximalSquare(matrix);

        assertEquals(0, out);
    }
}
