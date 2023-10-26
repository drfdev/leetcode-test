package dev.drf.leetcode.minimum.path.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-path-sum/
 */
public class MinimumPathSumProblem implements Problem {
    public int minPathSum(int[][] grid) {
        final int rows = grid.length;
        final int cols = grid[0].length;

        int[][] pathSum = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r == 0 && c == 0) {
                    pathSum[r][c] = grid[r][c];
                } else {
                    int top = r == 0 ? Integer.MAX_VALUE : pathSum[r - 1][c];
                    int left = c == 0 ? Integer.MAX_VALUE : pathSum[r][c - 1];
                    int min = Math.min(top, left);
                    pathSum[r][c] = min + grid[r][c];
                }
            }
        }

        return pathSum[rows - 1][cols - 1];
    }
}
