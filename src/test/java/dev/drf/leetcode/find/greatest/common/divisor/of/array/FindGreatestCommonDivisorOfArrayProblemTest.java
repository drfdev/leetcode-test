package dev.drf.leetcode.find.greatest.common.divisor.of.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindGreatestCommonDivisorOfArrayProblemTest {
    private final FindGreatestCommonDivisorOfArrayProblem problem = new FindGreatestCommonDivisorOfArrayProblem();

    @Test
    void example1() {
        // Input: nums = [2,5,6,9,10]
        // Output: 2
        int[] nums = {2, 5, 6, 9, 10};

        int out = problem.findGCD(nums);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        // Input: nums = [7,5,6,8,3]
        // Output: 1
        int[] nums = {7, 5, 6, 8, 3};

        int out = problem.findGCD(nums);

        assertEquals(1, out);
    }

    @Test
    void example3() {
        // Input: nums = [3,3]
        // Output: 3
        int[] nums = {3, 3};

        int out = problem.findGCD(nums);

        assertEquals(3, out);
    }
}
