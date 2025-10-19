package dev.drf.leetcode.minimum.number.of.operations.to.make.array.xor.equal.to.k;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/
 */
public class MinimumNumberOfOperationsToMakeArrayXorEqualToKProblem implements Problem {
    public int minOperations(int[] nums, int k) {
        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            val = val ^ nums[i];
        }

        return minBitFlips(val, k);
    }

    // see: MinimumBitFlipsToConvertNumberProblem
    private int minBitFlips(int start, int goal) {
        int flips = 0;

        while (start > 0 || goal > 0) {
            int startVal = start % 2;
            int goalVal = goal % 2;

            if (startVal != goalVal) {
                flips++;
            }
            start = start / 2;
            goal = goal / 2;
        }

        return flips;
    }
}
