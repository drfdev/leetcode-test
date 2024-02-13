package dev.drf.leetcode.maximum.sum.circular.subarray;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 * Used solution:
 * https://leetcode.com/problems/maximum-sum-circular-subarray/solutions/3066636/weird-kadane-explanation-with-images/
 */
public class MaximumSumCircularSubarrayProblem implements Problem {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int curMax = 0;
        int curMin = 0;
        int totalSum = 0;
        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(minSum, curMin);
            totalSum += num;
        }
        return maxSum > 0
                ? Math.max(maxSum, totalSum - minSum)
                : maxSum;
    }
}
