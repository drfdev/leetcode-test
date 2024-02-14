package dev.drf.leetcode.rearrange.array.elements.by.sign;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/rearrange-array-elements-by-sign/
 */
public class RearrangeArrayElementsBySignProblem implements Problem {
    public int[] rearrangeArray(int[] nums) {
        final int size = nums.length;

        int positiveIndex = 0;
        int negativeIndex = 1;

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            int value = nums[i];
            boolean isPositive = value > 0;

            if (isPositive) {
                result[positiveIndex] = value;
                positiveIndex += 2;
            } else {
                result[negativeIndex] = value;
                negativeIndex += 2;
            }
        }

        return result;
    }
}
