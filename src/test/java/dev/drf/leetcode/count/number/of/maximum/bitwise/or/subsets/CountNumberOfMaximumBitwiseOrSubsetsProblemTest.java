package dev.drf.leetcode.count.number.of.maximum.bitwise.or.subsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNumberOfMaximumBitwiseOrSubsetsProblemTest {
    private final CountNumberOfMaximumBitwiseOrSubsetsProblem problem = new CountNumberOfMaximumBitwiseOrSubsetsProblem();

    @Test
    void example1() {
        // Input: nums = [3,1]
        // Output: 2
        int[] nums = {3, 1};

        var count = problem.countMaxOrSubsets(nums);

        assertEquals(2, count);
    }

    @Test
    void example2() {
        // Input: nums = [2,2,2]
        // Output: 7
        int[] nums = {2, 2, 2};

        var count = problem.countMaxOrSubsets(nums);

        assertEquals(7, count);
    }

    @Test
    void example3() {
        // Input: nums = [3,2,1,5]
        // Output: 6
        int[] nums = {3, 2, 1, 5};

        var count = problem.countMaxOrSubsets(nums);

        assertEquals(6, count);
    }
}
