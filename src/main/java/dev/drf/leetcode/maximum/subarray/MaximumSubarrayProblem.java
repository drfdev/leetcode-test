package dev.drf.leetcode.maximum.subarray;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-subarray/
 * Used solution:
 * https://www.youtube.com/watch?v=5WZl3MMT0Eg
 * (linear solution)
 */
public class MaximumSubarrayProblem implements Problem {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            sum += n;
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
