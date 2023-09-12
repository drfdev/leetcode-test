package dev.drf.leetcode.set.matrix.zeroes;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/set-matrix-zeroes/
 */
public class SetMatrixZeroesProblem implements Problem {
    private static final byte ZERO_VALUE = 2;

    public void setZeroes(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        final int rowCount = matrix.length;
        final int colCount = matrix[0].length;

        final byte[] rowMarks = new byte[rowCount];
        final byte[] colMarks = new byte[colCount];

        for (int r = 0; r < rowCount; r++) {
            for (int c = 0; c < colCount; c++) {
                int value = matrix[r][c];
                if (value == 0) {
                    rowMarks[r] = ZERO_VALUE;
                    colMarks[c] = ZERO_VALUE;
                }
            }
        }

        for (int r = 0; r < rowCount; r++) {
            for (int c = 0; c < colCount; c++) {
                if (rowMarks[r] == ZERO_VALUE
                        || colMarks[c] == ZERO_VALUE) {
                    matrix[r][c] = 0;
                }
            }
        }
    }
}
