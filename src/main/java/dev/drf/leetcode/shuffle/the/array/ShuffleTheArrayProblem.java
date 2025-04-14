package dev.drf.leetcode.shuffle.the.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/shuffle-the-array/
 */
public class ShuffleTheArrayProblem implements Problem {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];

        for (int i = 0; i < n; i++) {
            final int xIndex = i;
            final int yIndex = n + i;
            final int resIndex = 2 * i;

            res[resIndex] = nums[xIndex];
            res[resIndex + 1] = nums[yIndex];
        }

        return res;
    }
}
