package dev.drf.leetcode.maximum.sum.circular.subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumCircularSubarrayProblemTest {
    private final MaximumSumCircularSubarrayProblem problem = new MaximumSumCircularSubarrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,-2,3,-2]
        Output: 3
         */
        int[] nums = {1, -2, 3, -2};

        var out = problem.maxSubarraySumCircular(nums);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [5,-3,5]
        Output: 10
         */
        int[] nums = {5, -3, 5};

        var out = problem.maxSubarraySumCircular(nums);

        assertEquals(10, out);
    }

    @Test
    void example3() {
        /*
        Input: nums = [-3,-2,-3]
        Output: -2
         */
        int[] nums = {-3, -2, -3};

        var out = problem.maxSubarraySumCircular(nums);

        assertEquals(-2, out);
    }
}
