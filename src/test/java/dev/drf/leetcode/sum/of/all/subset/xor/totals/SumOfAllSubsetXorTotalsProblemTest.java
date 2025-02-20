package dev.drf.leetcode.sum.of.all.subset.xor.totals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfAllSubsetXorTotalsProblemTest {
    private final SumOfAllSubsetXorTotalsProblem problem = new SumOfAllSubsetXorTotalsProblem();

    @Test
    void example1() {
        // Input: nums = [1,3]
        // Output: 6
        int[] nums = {1, 3};

        var out = problem.subsetXORSum(nums);

        assertEquals(6, out);
    }

    @Test
    void example2() {
        // Input: nums = [5,1,6]
        // Output: 28
        int[] nums = {5, 1, 6};

        var out = problem.subsetXORSum(nums);

        assertEquals(28, out);
    }
}
