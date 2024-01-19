package dev.drf.leetcode.minimum.falling.path.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-falling-path-sum/
 */
public class MinimumFallingPathSumProblem2 implements Problem {
    public int minFallingPathSum(int[][] matrix) {
        if (matrix == null) {
            return 0;
        }

        final int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }

        int[][] memo = new int[n][n];
        System.arraycopy(matrix[0], 0, memo[0], 0, n);

        for (int r = 1; r < n; r++) {
            for (int i = 0; i < n; i++) {
                final int value = matrix[r][i];
                int min = Integer.MAX_VALUE;
                if (i > 0) {
                    int left = memo[r - 1][i - 1] + value;
                    min = left;
                }
                if (i < n - 1) {
                    int right = memo[r - 1][i + 1] + value;
                    min = Math.min(min, right);
                }
                int center = memo[r - 1][i] + value;
                min = Math.min(min, center);

                memo[r][i] = min;
            }
        }

        int min = memo[n - 1][0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, memo[n - 1][i]);
        }

        return min;
    }
}
