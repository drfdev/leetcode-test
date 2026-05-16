package dev.drf.leetcode.count.digit.appearances;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDigitAppearancesProblemTest {
    private final CountDigitAppearancesProblem problem = new CountDigitAppearancesProblem();

    @Test
    void example1() {
        // Input: nums = [12,54,32,22], digit = 2
        // Output: 4
        int[] nums = {12, 54, 32, 22};
        int digit = 2;

        int count = problem.countDigitOccurrences(nums, digit);

        assertEquals(4, count);
    }

    @Test
    void example2() {
        // Input: nums = [1,34,7], digit = 9
        // Output: 0
        int[] nums = {1, 34, 7};
        int digit = 9;

        int count = problem.countDigitOccurrences(nums, digit);

        assertEquals(0, count);
    }

    @Test
    void failed1() {
        // nums = [2]
        // digit = 0
        int[] nums = {2};
        int digit = 0;

        int count = problem.countDigitOccurrences(nums, digit);

        assertEquals(0, count);
    }
}
