package dev.drf.leetcode.special.positions.in.a.binary.matrix;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/special-positions-in-a-binary-matrix/
 * Used solution:
 * https://leetcode.com/problems/special-positions-in-a-binary-matrix/solutions/4397449/easy-solution-ever-java-c-python-js-ruby-go-by-prodonik/
 */
public class SpecialPositionsInABinaryMatrixProblem implements Problem {
    public int numSpecial(int[][] mat) {
        if (mat == null) {
            return 0;
        }

        final int rows = mat.length;
        final int cols = mat[0].length;

        int[] colsVals = new int[cols];

        for (int r = 0; r < rows; r++) {
            int countInRow = 0;
            int columnIndex = 0;

            for (int c = 0; c < cols; c++) {
                int value = mat[r][c];

                if (value == 1) {
                    countInRow++;

                    if (countInRow == 1) {
                        var cVal = colsVals[c];
                        colsVals[c] = cVal == 0 ? 1 : 2;
                        columnIndex = c;
                    } else {
                        colsVals[c] = 2;
                        colsVals[columnIndex] = 2;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < cols; i++) {
            if (colsVals[i] == 1) {
                count++;
            }
        }

        return count;
    }
}
