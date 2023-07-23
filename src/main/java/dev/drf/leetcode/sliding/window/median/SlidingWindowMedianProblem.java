package dev.drf.leetcode.sliding.window.median;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sliding-window-median/
 */
@Deprecated
public class SlidingWindowMedianProblem implements Problem {
    public double[] medianSlidingWindow(int[] nums, int k) {
        if (k == 1) {
            double[] copy = new double[nums.length];
            for (int i = 0; i < nums.length; i++) {
                copy[i] = nums[i];
            }
            return copy;
        }
        final int size = nums.length - k + 1;
        double[] result = new double[size];
        int[] buff = new int[k];

        for (int i = 0; i < size; i++) {
            System.arraycopy(nums, i, buff, 0, k);
            Arrays.sort(buff);
            result[i] = k % 2 == 0
                    ? ((double) buff[k / 2 - 1] + (double) buff[k / 2] ) / 2
                    : (double) buff[k / 2];
        }

        return result;
    }
}
