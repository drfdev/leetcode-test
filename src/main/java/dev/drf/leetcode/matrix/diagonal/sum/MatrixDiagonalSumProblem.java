package dev.drf.leetcode.matrix.diagonal.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/matrix-diagonal-sum/
 */
public class MatrixDiagonalSumProblem implements Problem {
    public int diagonalSum(int[][] mat) {
        final int size = mat.length;
        int sum = 0;

        int leftIndex = 0;
        int rightIndex = size - 1;

        for (int i = 0; i < size; i++) {
            if (leftIndex == rightIndex) {
                sum = sum + mat[i][leftIndex];
            } else {
                sum = sum + mat[i][leftIndex];
                sum = sum + mat[i][rightIndex];
            }

            leftIndex = leftIndex + 1;
            rightIndex = rightIndex - 1;
        }

        return sum;
    }
}
