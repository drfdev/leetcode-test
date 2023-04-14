package dev.drf.leetcode.search.a2d.matrix;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
public class SearchA2dMatrixProblem implements Problem {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }

        if (matrix.length == 1 && matrix[0] == null) {
            return false;
        }

        if (matrix.length == 1 && matrix[0].length == 1) {
            return matrix[0][0] == target;
        }

        var rows = matrix.length;
        var cells = matrix[0].length;

        var minIndex = 0;
        var maxIndex = rows * cells - 1;

        while (true) {
            if (minIndex == maxIndex) {
                var row = minIndex / cells;
                var cell = minIndex % cells;

                return matrix[row][cell] == target;
            }

            if (maxIndex == minIndex + 1) {
                var minRow = minIndex / cells;
                var minCell = minIndex % cells;

                if (matrix[minRow][minCell] == target) {
                    return true;
                }

                var maxRow = maxIndex / cells;
                var maxCell = maxIndex % cells;

                return matrix[maxRow][maxCell] == target;
            }

            var index = (maxIndex + minIndex) / 2;

            var row = index / cells;
            var cell = index % cells;

            var value = matrix[row][cell];

            if (value == target) {
                return true;
            }

            if (target < value) {
                // take left
                maxIndex = index;
            } else {
                // take right
                minIndex = index;
            }
        }
    }
}
