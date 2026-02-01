package dev.drf.leetcode.minimum.element.after.replacement.with.digit.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumElementAfterReplacementWithDigitSumProblemTest {
    private final MinimumElementAfterReplacementWithDigitSumProblem problem = new MinimumElementAfterReplacementWithDigitSumProblem();

    @Test
    void example1() {
        // Input: nums = [10,12,13,14]
        // Output: 1
        int[] nums = {10, 12, 13, 14};

        int out = problem.minElement(nums);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,2,3,4]
        // Output: 1
        int[] nums = {1, 2, 3, 4};

        int out = problem.minElement(nums);

        assertEquals(1, out);
    }

    @Test
    void example3() {
        // Input: nums = [999,19,199]
        // Output: 10
        int[] nums = {999, 19, 199};

        int out = problem.minElement(nums);

        assertEquals(10, out);
    }
}
