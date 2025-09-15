package dev.drf.leetcode.subrectangle.queries;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/subrectangle-queries/
 */
public class SubrectangleQueriesProblem implements Problem {
    public static class SubrectangleQueries {
        private final int[][] rect;

        public SubrectangleQueries(int[][] rectangle) {
            this.rect = rectangle;
        }

        public void updateSubrectangle(int row1, int col1,
                                       int row2, int col2,
                                       int newValue) {
            for (int rowIndex = row1; rowIndex <= row2; rowIndex++) {
                Arrays.fill(this.rect[rowIndex], col1, (col2 + 1), newValue);
            }
        }

        public int getValue(int row, int col) {
            return rect[row][col];
        }
    }
}
