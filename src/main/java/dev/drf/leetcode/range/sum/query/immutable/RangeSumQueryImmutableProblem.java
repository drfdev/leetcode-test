package dev.drf.leetcode.range.sum.query.immutable;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/range-sum-query-immutable/
 */
public class RangeSumQueryImmutableProblem implements Problem {
    public static class NumArray {
        private final int[] sums;

        public NumArray(int[] nums) {
            this.sums = new int[nums.length];
            this.sums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int num = nums[i];
                sums[i] = sums[i - 1] + num;
            }
        }

        public int sumRange(int left, int right) {
            int index = left - 1;
            if (index < 0) {
                return sums[right];
            }
            int leftSum = sums[index];
            int rightSum = sums[right];

            return rightSum - leftSum;
        }
    }
}
