package dev.drf.leetcode.count.negative.numbers.in.a.sorted.matrix;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class CountNegativeNumbersInASortedMatrixProblem implements Problem {
    public int countNegatives(int[][] grid) {
        if (grid == null) {
            return 0;
        }

        int count = 0;

        for (int i = grid.length - 1; i >= 0; i--) {
            int[] igrid = grid[i];
            for (int j = igrid.length - 1; j >= 0; j--) {
                int value = igrid[j];
                if (value < 0) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
