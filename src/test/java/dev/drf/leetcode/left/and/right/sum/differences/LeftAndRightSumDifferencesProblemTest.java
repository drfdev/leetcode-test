package dev.drf.leetcode.left.and.right.sum.differences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeftAndRightSumDifferencesProblemTest {
    private final LeftAndRightSumDifferencesProblem problem = new LeftAndRightSumDifferencesProblem();

    @Test
    void example1() {
        // Input: nums = [10,4,8,3]
        // Output: [15,1,11,22]
        int[] nums = {10, 4, 8, 3};

        var res = problem.leftRightDifference(nums);

        int[] expected = {15, 1, 11, 22};
        assertArrayEquals(expected, res);
    }

    @Test
    void example2() {
        // Input: nums = [1]
        // Output: [0]
        int[] nums = {1};

        var res = problem.leftRightDifference(nums);

        int[] expected = {0};
        assertArrayEquals(expected, res);
    }
}
