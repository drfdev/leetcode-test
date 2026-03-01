package dev.drf.leetcode.count.square.submatrices.with.all.ones;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-square-submatrices-with-all-ones/
 */
public class CountSquareSubmatricesWithAllOnesProblem implements Problem {
    public int countSquares(int[][] matrix) {
        final int n = matrix.length;
        final int m = matrix[0].length;
        final int[][] tempSums = new int[n][m];

        int count = 0;
        // copy 1 row
        for (int i = 0; i < m; i++) {
            final int val = matrix[0][i];
            tempSums[0][i] = val;
            if (val == 1) {
                count++;
            }
        }
        // copy 1 column
        for (int i = 1; i < n; i++) {
            final int val = matrix[i][0];
            tempSums[i][0] = val;
            if (val == 1) {
                count++;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                int val = matrix[i][j];
                if (val == 1) {
                    // detect min
                    final int left = tempSums[i][j - 1];
                    final int top = tempSums[i - 1][j];
                    final int corner = tempSums[i - 1][j - 1];
                    final int min = Math.min(left, Math.min(top, corner));
                    val = val + min;

                    tempSums[i][j] = val;
                    count = count + val;
                }
            }
        }
        return count;
    }
}
