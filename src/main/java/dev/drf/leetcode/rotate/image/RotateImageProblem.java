package dev.drf.leetcode.rotate.image;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/rotate-image/
 */
public class RotateImageProblem implements Problem {
    public void rotate(int[][] matrix) {
        final int size = matrix.length;

        /*
         (0,0) (0,1) (0,2)       (2,0) (1,0) (0,0)
         (1,0) (1,1) (1,2)  -->  (2,1) (1,1) (0,1)
         (2,0) (2,1) (2,2)       (2,2) (1,2) (0,2)

         (0,0) (0,1) (0,2) (0,3)       (3,0) (2,0) (1,0) (0,0)
         (1,0) (1,1) (1,2) (1,3)  -->  (3,1) (2,1) (1,1) (0,1)
         (2,0) (2,1) (2,2) (2,3)       (3,2) (2,2) (1,2) (0,2)
         (3,0) (3,1) (3,2) (3,3)       (3,3) (2,3) (1,3) (0,3)
         */
        final int levels = size / 2;
        for (int lvl = 0; lvl < levels; lvl++) {
            // (0,0) (0,1)   ... (0,k) (1,k)
            // (0,k) (1,k)   ... (k,k) (k,k-1)
            // (k,k) (k,k-1) ... (k,0) (k-1,0)
            // (k,0) (k-1,0) ... (0,0) (0,1)
            int zeroIndex = lvl;
            int kIndex = size - 1 - lvl;
            int value;

            for (int i = zeroIndex; i < kIndex; i++) {
                value = matrix[zeroIndex][i];
                value = swapToValue(matrix, i, kIndex, value);
                value = swapToValue(matrix, kIndex, kIndex - i + zeroIndex, value);
                value = swapToValue(matrix, kIndex - i + zeroIndex, zeroIndex, value);
                value = swapToValue(matrix, zeroIndex, i, value);
            }
        }
    }

    private int swapToValue(int[][] matrix, int i, int j, int value) {
        int old = matrix[i][j];
        matrix[i][j] = value;
        return old;
    }
}
