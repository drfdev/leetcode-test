package dev.drf.leetcode.longest.increasing.path.in.a.matrix;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
 */
public class LongestIncreasingPathInAMatrixProblem implements Problem {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null) {
            return 0;
        }

        final int rows = matrix.length;
        final int cols = matrix[0].length;

        int[][] dp = new int[rows][cols];
        for (int d[] : dp) {
            Arrays.fill(d, -1);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                var val = dp[i][j];
                if (val == -1) {
                    dfs(matrix, dp, rows, cols, i, j, -1);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int[] d : dp) {
            for (int i : d) {
                max = Math.max(i, max);
            }
        }

        return max;
    }

    private int dfs(int[][] matrix,
                    int[][] dp,
                    int rows,
                    int cols,
                    int i,
                    int j,
                    int parent) {
        if (i >= rows || j >= cols ||
                i < 0 || j < 0 || matrix[i][j] <= parent) {
            return 0;
        }
        parent = matrix[i][j];
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int left = dfs(matrix, dp, rows, cols, i, j - 1, parent);
        int right = dfs(matrix, dp, rows, cols, i, j + 1, parent);
        int bottom = dfs(matrix, dp, rows, cols, i + 1, j, parent);
        int top = dfs(matrix, dp, rows, cols, i - 1, j, parent);

        int lrMax = Math.max(left, right);
        int btMax = Math.max(top, bottom);
        dp[i][j] = 1 + Math.max(lrMax, btMax);

        return dp[i][j];
    }
}
