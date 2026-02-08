package dev.drf.leetcode.bitwise.or.of.even.numbers.in.an.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitwiseOrOfEvenNumbersInAnArrayProblemTest {
    private final BitwiseOrOfEvenNumbersInAnArrayProblem problem = new BitwiseOrOfEvenNumbersInAnArrayProblem();

    @Test
    void example1() {
        // Input: nums = [1,2,3,4,5,6]
        // Output: 6
        int[] nums = {1, 2, 3, 4, 5, 6};

        var out = problem.evenNumberBitwiseORs(nums);

        assertEquals(6, out);
    }

    @Test
    void example2() {
        // Input: nums = [7,9,11]
        // Output: 0
        int[] nums = {7, 9, 11};

        var out = problem.evenNumberBitwiseORs(nums);

        assertEquals(0, out);
    }

    @Test
    void example3() {
        // Input: nums = [1,8,16]
        // Output: 24
        int[] nums = {1, 8, 16};

        var out = problem.evenNumberBitwiseORs(nums);

        assertEquals(24, out);
    }
}
