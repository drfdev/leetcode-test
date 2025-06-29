package dev.drf.leetcode.minimum.operations.to.make.array.sum.divisible.by.k;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumOperationsToMakeArraySumDivisibleByKProblemTest {
    private final MinimumOperationsToMakeArraySumDivisibleByKProblem problem = new MinimumOperationsToMakeArraySumDivisibleByKProblem();

    @Test
    void example1() {
        // Input: nums = [3,9,7], k = 5
        // Output: 4
        int[] nums = {3, 9, 7};
        int k = 5;

        var out = problem.minOperations(nums, k);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        // Input: nums = [4,1,3], k = 4
        // Output: 0
        int[] nums = {4, 1, 3};
        int k = 4;

        var out = problem.minOperations(nums, k);

        assertEquals(0, out);
    }

    @Test
    void example3() {
        // Input: nums = [3,2], k = 6
        // Output: 5
        int[] nums = {3, 2};
        int k = 6;

        var out = problem.minOperations(nums, k);

        assertEquals(5, out);
    }
}
