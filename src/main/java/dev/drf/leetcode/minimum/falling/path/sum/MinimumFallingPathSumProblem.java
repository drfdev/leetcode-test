package dev.drf.leetcode.minimum.falling.path.sum;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-falling-path-sum/
 */
@Deprecated
public class MinimumFallingPathSumProblem implements Problem {
    public int minFallingPathSum(int[][] matrix) {
        if (matrix == null) {
            return 0;
        }

        final int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }

        int[] memo = new int[n];
        for (int i = 0; i < n; i++) {
            memo[i] = matrix[n - 1][i];
        }

        for (int r = n - 2; r >= 0 ; r--) {
            for (int i = 0; i < n; i++) {
                final int left = i > 0
                        ? memo[i] + matrix[r][i - 1]
                        : Integer.MAX_VALUE;
                final int right = i < n - 1
                        ? memo[i] + matrix[r][i + 1]
                        : Integer.MAX_VALUE;
                final int value = memo[i] + matrix[r][i];

                final int min = Math.min(left, Math.min(right, value));
                memo[i] = min;
            }
//            System.out.println(Arrays.toString(memo));
        }

        int min = memo[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, memo[i]);
        }

        return min;
    }
}
