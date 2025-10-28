package dev.drf.leetcode.sum.of.variable.length.subarrays;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sum-of-variable-length-subarrays/
 */
public class SumOfVariableLengthSubarraysProblem implements Problem {
    public int subarraySum(int[] nums) {
        // start = max(0, i - nums[i])
        int sum = 0;
        int prefix = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix = prefix + nums[i];
            int start = Math.max(0, i - nums[i]);

            if (start == 0) {
                sum += prefix;
            } else {
                int tempSum = prefix;
                for (int t = 0; t < start; t++) {
                    tempSum = tempSum - nums[t];
                }
                sum += tempSum;
            }
        }

        return sum;
    }
}
