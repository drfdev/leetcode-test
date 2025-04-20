package dev.drf.leetcode.flipping.an.image;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/flipping-an-image/
 */
public class FlippingAnImageProblem implements Problem {
    public int[][] flipAndInvertImage(int[][] image) {
        final int n = image.length;
        int[][] res = new int[n][n];

        for (int i = 0; i < image.length; i++) {
            int[] imageRow = image[i];

            for (int j = 0; j < imageRow.length; j++) {
                final int val = imageRow[j];
                res[i][n - j - 1] = val == 1 ? 0 : 1;
            }
        }

        return res;
    }
}
