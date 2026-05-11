package dev.drf.leetcode.concatenate.array.with.reverse;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/concatenate-array-with-reverse/
 */
public class ConcatenateArrayWithReverseProblem implements Problem {
    public int[] concatWithReverse(int[] nums) {
        final int size = nums.length;
        final int[] result = new int[2 * size];

        for (int i = 0; i < size; i++) {
            result[i] = nums[i];
            result[i + size] = nums[size - i - 1];
        }

        return result;
    }
}
