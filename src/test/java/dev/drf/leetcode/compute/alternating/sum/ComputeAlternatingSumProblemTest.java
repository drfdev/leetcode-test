package dev.drf.leetcode.compute.alternating.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputeAlternatingSumProblemTest {
    private final ComputeAlternatingSumProblem problem = new ComputeAlternatingSumProblem();

    @Test
    void example1() {
        // Input: nums = [1,3,5,7]
        // Output: -4
        int[] nums = {1, 3, 5, 7};

        var out = problem.alternatingSum(nums);

        assertEquals(-4, out);
    }

    @Test
    void example2() {
        // Input: nums = [100]
        // Output: 100
        int[] nums = {100};

        var out = problem.alternatingSum(nums);

        assertEquals(100, out);
    }
}
