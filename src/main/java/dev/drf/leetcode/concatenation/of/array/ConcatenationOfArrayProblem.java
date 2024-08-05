package dev.drf.leetcode.concatenation.of.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/concatenation-of-array/
 */
public class ConcatenationOfArrayProblem implements Problem {
    public int[] getConcatenation(int[] nums) {
        final int n = nums.length;
        int[] result = new int[2 * n];

        System.arraycopy(nums, 0, result, 0, n);
        System.arraycopy(nums, 0, result, n, n);

        return result;
    }
}
