package dev.drf.leetcode.sum.of.variable.length.subarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfVariableLengthSubarraysProblemTest {
    private final SumOfVariableLengthSubarraysProblem problem = new SumOfVariableLengthSubarraysProblem();

    @Test
    void example1() {
        // Input: nums = [2,3,1]
        // Output: 11
        int[] nums = {2, 3, 1};

        var out = problem.subarraySum(nums);

        assertEquals(11, out);
    }

    @Test
    void example2() {
        // Input: nums = [3,1,1,2]
        // Output: 13
        int[] nums = {3, 1, 1, 2};

        var out = problem.subarraySum(nums);

        assertEquals(13, out);
    }
}
