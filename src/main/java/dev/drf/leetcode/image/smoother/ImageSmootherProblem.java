package dev.drf.leetcode.image.smoother;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/image-smoother/
 */
public class ImageSmootherProblem implements Problem {
    public int[][] imageSmoother(int[][] img) {
        if (img == null) {
            return null;
        }

        final int rows = img.length;
        final int cols = img[0].length;
        int[][] result = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int value = img[r][c];
                fillResult(result, r, c, value);
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[r][c] = (int) Math.floor((double) result[r][c] / getCount(r, c, rows, cols));
            }
        }

        return result;
    }

    private void fillResult(int[][] result, int r, int c, int value) {
        result[r][c] += value;

        int top = r - 1;
        int bot = r + 1;
        int left = c - 1;
        int right = c + 1;

        boolean correctTop = top >= 0;
        boolean correctBot = bot < result.length;
        boolean correctLeft = left >= 0;
        boolean correctRight = right < result[0].length;

        if (correctTop) {
            result[top][c] += value;
            if (correctLeft) {
                result[top][left] += value;
            }
            if (correctRight) {
                result[top][right] += value;
            }
        }
        if (correctBot) {
            result[bot][c] += value;
            if (correctLeft) {
                result[bot][left] += value;
            }
            if (correctRight) {
                result[bot][right] += value;
            }
        }
        if (correctLeft) {
            result[r][left] += value;
        }
        if (correctRight) {
            result[r][right] += value;
        }
    }

    private int getCount(int r, int c, int rows, int cols) {
        int count = 1;

        int top = r - 1;
        int bot = r + 1;
        int left = c - 1;
        int right = c + 1;

        boolean correctTop = top >= 0;
        boolean correctBot = bot < rows;
        boolean correctLeft = left >= 0;
        boolean correctRight = right < cols;

        if (correctTop) {
            count++;
            if (correctLeft) {
                count++;
            }
            if (correctRight) {
                count++;
            }
        }
        if (correctBot) {
            count++;
            if (correctLeft) {
                count++;
            }
            if (correctRight) {
                count++;
            }
        }
        if (correctLeft) {
            count++;
        }
        if (correctRight) {
            count++;
        }

        return count;
    }
}
