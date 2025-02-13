package dev.drf.leetcode.minimum.operations.to.exceed.threshold.value.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumOperationsToExceedThresholdValueIIProblemTest {
    private final MinimumOperationsToExceedThresholdValueIIProblem problem = new MinimumOperationsToExceedThresholdValueIIProblem();

    @Test
    void example1() {
        // Input: nums = [2,11,10,1,3], k = 10
        // Output: 2
        int[] nums = {2, 11, 10, 1, 3};
        int k = 10;

        var out = problem.minOperations(nums, k);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,1,2,4,9], k = 20
        // Output: 4
        int[] nums = {1, 1, 2, 4, 9};
        int k = 20;

        var out = problem.minOperations(nums, k);

        assertEquals(4, out);
    }

    @Test
    void failed1() {
        // [999999999,999999999,999999999]
        // 1000000000
        int[] nums = {999999999, 999999999, 999999999};
        int k = 1000000000;

        var out = problem.minOperations(nums, k);

        assertEquals(2, out);
    }
}
