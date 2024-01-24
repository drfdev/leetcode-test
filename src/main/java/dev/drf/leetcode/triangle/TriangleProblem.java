package dev.drf.leetcode.triangle;

import dev.drf.leetcode.Problem;

import java.util.List;

/**
 * https://leetcode.com/problems/triangle/
 */
public class TriangleProblem implements Problem {
    public int minimumTotal(List<List<Integer>> triangle) {
        final int size = triangle.size();
        final int[][] dp = new int[size][size];

        dp[0][0] = triangle.get(0).get(0);

        for (int r = 1; r < size; r++) {
            List<Integer> row = triangle.get(r);
            int rowLen = row.size();

            for (int i = 0; i < rowLen; i++) {
                int leftIndex = i - 1;
                int rightIndex = i;

                int min = Integer.MAX_VALUE;
                if (leftIndex >= 0) {
                    min = dp[r - 1][leftIndex];
                }
                if (rightIndex < rowLen - 1) {
                    min = Math.min(min, dp[r - 1][rightIndex]);
                }
                dp[r][i] = min + row.get(i);
            }
        }

        int min = dp[size - 1][0];
        for (int i = 1; i < size; i++) {
            min = Math.min(min, dp[size - 1][i]);
        }
        return min;
    }
}
