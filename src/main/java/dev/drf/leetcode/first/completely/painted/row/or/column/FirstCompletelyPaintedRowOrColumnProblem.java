package dev.drf.leetcode.first.completely.painted.row.or.column;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/first-completely-painted-row-or-column/
 */
public class FirstCompletelyPaintedRowOrColumnProblem implements Problem {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        final int colCount = mat.length;
        final int rowCount = mat[0].length;

        var matrixMap = new HashMap<Integer, int[]>();
        int[] cols = new int[colCount];
        int[] rows = new int[rowCount];

        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                int[] pair = {i, j};
                int value = mat[i][j];
                matrixMap.put(value, pair);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            var value = arr[i];

            var pair = matrixMap.get(value);
            cols[pair[0]] += 1;
            rows[pair[1]] += 1;

            if (cols[pair[0]] == rowCount
                    || rows[pair[1]] == colCount) {
                return i;
            }
        }

        return -1;
    }
}
