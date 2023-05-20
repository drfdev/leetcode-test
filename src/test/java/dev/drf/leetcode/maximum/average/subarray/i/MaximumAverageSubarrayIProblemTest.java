package dev.drf.leetcode.maximum.average.subarray.i;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumAverageSubarrayIProblemTest {
    private final MaximumAverageSubarrayIProblem problem = new MaximumAverageSubarrayIProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,12,-5,-6,50,3], k = 4
        Output: 12.75000
         */
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;

        var value = problem.findMaxAverage(nums, k);

        assertEquals(12.75000d, value);
    }

    @Test
    void example2() {
        /*
        Input: nums = [5], k = 1
        Output: 5.00000
         */
        int[] nums = new int[]{5};
        int k = 1;

        var value = problem.findMaxAverage(nums, k);

        assertEquals(5.00000d, value);
    }

    @Test
    void failed1() {
        int[] nums = new int[]{-1};
        int k = 1;

        var value = problem.findMaxAverage(nums, k);

        assertEquals(-1d, value);
    }
}
