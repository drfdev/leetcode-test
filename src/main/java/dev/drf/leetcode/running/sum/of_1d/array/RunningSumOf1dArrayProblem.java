package dev.drf.leetcode.running.sum.of_1d.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class RunningSumOf1dArrayProblem implements Problem {
    public int[] runningSum(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
