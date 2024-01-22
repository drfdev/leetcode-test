package dev.drf.leetcode.set.mismatch;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/set-mismatch/
 */
public class SetMismatchProblem implements Problem {
    public int[] findErrorNums(int[] nums) {
        final int n = nums.length;
        int[] memo = new int[n];

        for (int num : nums) {
            memo[num - 1]++;
        }

        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            if (memo[i] > 1) {
                result[0] = (i + 1);
            } else if (memo[i] == 0) {
                result[1] = (i + 1);
            }
        }

        return result;
    }
}
