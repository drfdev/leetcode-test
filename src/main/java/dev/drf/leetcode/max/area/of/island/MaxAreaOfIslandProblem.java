package dev.drf.leetcode.max.area.of.island;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/max-area-of-island/
 */
public class MaxAreaOfIslandProblem implements Problem {
    public int maxAreaOfIsland(int[][] grid) {
        final int rows = grid.length;
        if (rows == 0) {
            return 0;
        }
        final int cols = grid[0].length;
        if (cols == 0) {
            return 0;
        }

        int maxSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    int sum = dfsSum(grid, i, j, rows, cols);
                    maxSum = Math.max(sum, maxSum);
                }
            }
        }

        return maxSum;
    }

    private int dfsSum(int[][] grid, int i, int j, int rows, int cols) {
        if (i < 0 || j < 0
                || i >= rows || j >= cols
                || grid[i][j] == 0) {
            return 0;
        }

        int sum = 1;
        grid[i][j] = 0;

        sum += dfsSum(grid, i + 1, j, rows, cols);
        sum += dfsSum(grid, i - 1, j, rows, cols);
        sum += dfsSum(grid, i, j + 1, rows, cols);
        sum += dfsSum(grid, i, j - 1, rows, cols);

        return sum;
    }
}
