package dev.drf.leetcode.minimum.operations.to.exceed.threshold.value.i;

/**
 * https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/
 */
public class MinimumOperationsToExceedThresholdValueIProblem {
    public int minOperations(int[] nums, int k) {
        int operations = 0;

        for (int num : nums) {
            if (num < k) {
                operations++;
            }
        }

        return operations;
    }
}
