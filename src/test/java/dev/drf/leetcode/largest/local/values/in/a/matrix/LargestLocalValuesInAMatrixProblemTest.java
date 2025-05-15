package dev.drf.leetcode.largest.local.values.in.a.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LargestLocalValuesInAMatrixProblemTest {
    private final LargestLocalValuesInAMatrixProblem problem = new LargestLocalValuesInAMatrixProblem();

    @Test
    void example1() {
        // Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
        // Output: [[9,9],[8,6]]
        int[][] grid = {
                {9, 9, 8, 1},
                {5, 6, 2, 6},
                {8, 2, 6, 4},
                {6, 2, 2, 2}
        };

        var out = problem.largestLocal(grid);

        int[][] expected = {
                {9, 9},
                {8, 6}
        };
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], out[i]);
        }
    }

    @Test
    void example2() {
        // Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
        // Output: [[2,2,2],[2,2,2],[2,2,2]]
        int[][] grid = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };

        var out = problem.largestLocal(grid);

        int[][] expected = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], out[i]);
        }
    }
}
