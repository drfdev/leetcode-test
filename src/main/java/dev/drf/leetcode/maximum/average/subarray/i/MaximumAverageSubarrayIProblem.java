package dev.drf.leetcode.maximum.average.subarray.i;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-average-subarray-i/
 */
public class MaximumAverageSubarrayIProblem implements Problem {
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null) {
            return 0;
        }

        double result = windowAverage(nums, 0, k);
        double window = result;
        int lastLeft = 0;

        for (int i = k; i < nums.length; i++, lastLeft++) {
            window = window - ((double) nums[lastLeft] / k);
            window = window + ((double) nums[i] / k);

            if (window > result) {
                result = window;
            }
        }

        return result;
    }

    private double windowAverage(int[] nums, int firstIndex, int length) {
        double value = 0;
        for (int i = firstIndex; i < firstIndex + length; i++) {
            value += nums[i];
        }

        value = value / length;
        return value;
    }
}
