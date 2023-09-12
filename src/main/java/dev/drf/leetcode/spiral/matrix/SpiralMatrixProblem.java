package dev.drf.leetcode.spiral.matrix;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/
 */
public class SpiralMatrixProblem implements Problem {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd
                && columnBegin <= columnEnd) {
            for (int c = columnBegin; c <= columnEnd; c++) {
                result.add(matrix[rowBegin][c]);
            }
            rowBegin++;

            for (int r = rowBegin; r <= rowEnd; r++) {
                result.add(matrix[r][columnEnd]);
            }
            columnEnd--;

            if (rowBegin <= rowEnd) {
                for (int c = columnEnd; c >= columnBegin; c--) {
                    result.add(matrix[rowEnd][c]);
                }
            }
            rowEnd--;

            if (columnBegin <= columnEnd) {
                for (int r = rowEnd; r >= rowBegin; r--) {
                    result.add(matrix[r][columnBegin]);
                }
            }
            columnBegin++;
        }

        return result;
    }
}
