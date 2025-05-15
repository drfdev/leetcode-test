package dev.drf.leetcode.largest.local.values.in.a.matrix;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/largest-local-values-in-a-matrix/
 */
public class LargestLocalValuesInAMatrixProblem implements Problem {
    public int[][] largestLocal(int[][] grid) {
        final int n = grid.length;
        final int maxLocalSize = n - 2;
        final int[][] maxLocal = new int[maxLocalSize][maxLocalSize];

        for (int row = 0; row < maxLocalSize; row++) {
            for (int cell = 0; cell < maxLocalSize; cell++) {
                // find max by grid
                maxLocal[row][cell] = max3x3(grid, row, cell);
            }
        }

        return maxLocal;
    }

    private int max3x3(int[][] grid,
                       int row,
                       int cell) {
        int max = -1;
        for (int i = row; i <= row + 2; i++) {
            for (int j = cell; j <= cell + 2; j++) {
                max = Math.max(grid[i][j], max);
            }
        }
        return max;
    }
}
