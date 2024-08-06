package dev.drf.leetcode.minimum.average.of.smallest.and.largest.elements;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/
 */
public class MinimumAverageOfSmallestAndLargestElementsProblem implements Problem {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        final int n = nums.length;
        final int half = n / 2;

        double result = Integer.MAX_VALUE;

        for (int i = 0; i < half; i++) {
            int min = nums[i];
            int max = nums[n - i - 1];

            double average = (max + min) / 2.0;
            result = Math.min(average, result);
        }

        return result;
    }
}
