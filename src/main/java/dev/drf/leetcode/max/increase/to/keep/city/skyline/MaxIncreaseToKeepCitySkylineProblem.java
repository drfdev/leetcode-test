package dev.drf.leetcode.max.increase.to.keep.city.skyline;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/max-increase-to-keep-city-skyline/
 */
public class MaxIncreaseToKeepCitySkylineProblem implements Problem {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        final int n = grid.length;

        final int[] vertical = new int[n];
        final int[] horizontal = new int[n];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int value = grid[r][c];

                horizontal[c] = Math.max(horizontal[c], value);
                vertical[r] = Math.max(vertical[r], value);
            }
        }

        int result = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int value = grid[r][c];
                int maxValue = Math.min(horizontal[c], vertical[r]);

                result += (maxValue - value);
            }
        }

        return result;
    }
}
