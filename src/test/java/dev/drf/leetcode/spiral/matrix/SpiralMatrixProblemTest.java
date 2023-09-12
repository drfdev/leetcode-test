package dev.drf.leetcode.spiral.matrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpiralMatrixProblemTest {
    private final SpiralMatrixProblem problem = new SpiralMatrixProblem();

    private void assertArray(List<Integer> arr, int... values) {
        assertEquals(values.length, arr.size());
        for (int i = 0; i < values.length; i++) {
            assertEquals(values[i], arr.get(i));
        }
    }

    @Test
    void example1() {
        /*
        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        Output: [1,2,3,6,9,8,7,4,5]
         */
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        var result = problem.spiralOrder(matrix);

        assertArray(result, 1, 2, 3, 6, 9, 8, 7, 4, 5);
    }

    @Test
    void example2() {
        /*
        Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
        Output: [1,2,3,4,8,12,11,10,9,5,6,7]
         */
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        var result = problem.spiralOrder(matrix);

        assertArray(result, 1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
    }
}
