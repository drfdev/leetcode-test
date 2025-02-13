package dev.drf.leetcode.minimum.operations.to.exceed.threshold.value.ii;

import dev.drf.leetcode.Problem;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/
 */
public class MinimumOperationsToExceedThresholdValueIIProblem implements Problem {
    public int minOperations(int[] nums, int k) {
        var prior = new PriorityQueue<Integer>();

        for (int num : nums) {
            if (num < k) {
                prior.add(num);
            }
        }

        int operations = 0;

        while (!prior.isEmpty()) {
            int min1 = prior.poll();
            operations++;

            if (prior.isEmpty()) {
                break;
            }

            int min2 = prior.poll();
            long newValue = 2L * min1 + min2;

            if (newValue < k) {
                prior.add((int) newValue);
            }
        }

        return operations;
    }
}
