package dev.drf.leetcode.find.missing.and.repeated.values;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-missing-and-repeated-values/
 */
public class FindMissingAndRepeatedValuesProblem implements Problem {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        final int size = grid.length;
        final int size2 = size * size;
        int[] cnt = new int[size2];
        int[] answer = new int[2];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                final int index = grid[i][j] - 1;
                cnt[index]++;
            }
        }
        for (int i = 0; i < size2; i++) {
            if (cnt[i] > 1) {
                answer[0] = i + 1;
            } else if (cnt[i] == 0) {
                answer[1] = i + 1;
            }
        }

        return answer;
    }
}
