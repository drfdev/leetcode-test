package dev.drf.leetcode.minimum.operations.to.exceed.threshold.value.i;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumOperationsToExceedThresholdValueIProblemTest {
    private final MinimumOperationsToExceedThresholdValueIProblem problem = new MinimumOperationsToExceedThresholdValueIProblem();

    @Test
    void example1() {
        // Input: nums = [2,11,10,1,3], k = 10
        // Output: 3
        int[] nums = {2, 11, 10, 1, 3};
        int k = 10;

        var out = problem.minOperations(nums, k);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,1,2,4,9], k = 1
        // Output: 0
        int[] nums = {1, 1, 2, 4, 9};
        int k = 1;

        var out = problem.minOperations(nums, k);

        assertEquals(0, out);
    }

    @Test
    void example3() {
        // Input: nums = [1,1,2,4,9], k = 9
        // Output: 4
        int[] nums = {1, 1, 2, 4, 9};
        int k = 9;

        var out = problem.minOperations(nums, k);

        assertEquals(4, out);
    }
}
