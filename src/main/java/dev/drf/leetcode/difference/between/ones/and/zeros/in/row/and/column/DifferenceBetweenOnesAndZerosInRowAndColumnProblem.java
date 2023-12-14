package dev.drf.leetcode.difference.between.ones.and.zeros.in.row.and.column;

/**
 * https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/
 */
public class DifferenceBetweenOnesAndZerosInRowAndColumnProblem {
    public int[][] onesMinusZeros(int[][] grid) {
        if (grid == null) {
            return null;
        }

        final int rows = grid.length;
        final int cols = grid[0].length;

        int[][] rowsSum = new int[rows][2];
        int[][] colsSum = new int[cols][2];

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = grid[i][j];

                if (value == 1) {
                    rowsSum[i][0]++;
                    colsSum[j][0]++;
                } else {
                    rowsSum[i][1]++;
                    colsSum[j][1]++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj
                result[i][j] = rowsSum[i][0] + colsSum[j][0] - rowsSum[i][1] - colsSum[j][1];
            }
        }

        return result;
    }
}
