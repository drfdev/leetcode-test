package dev.drf.leetcode.missing.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumberProblem implements Problem {
    public int missingNumber(int[] nums) {
        if (nums == null) {
            return -1;
        }
        final int size = nums.length;

        int sum = 0;
        int total = ((size + 1) * size) / 2;

        for (int num : nums) {
            sum = sum + num;
        }

        return total - sum;
    }
}
