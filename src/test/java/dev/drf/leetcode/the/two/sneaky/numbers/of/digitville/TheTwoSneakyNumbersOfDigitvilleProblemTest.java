package dev.drf.leetcode.the.two.sneaky.numbers.of.digitville;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TheTwoSneakyNumbersOfDigitvilleProblemTest {
    private final TheTwoSneakyNumbersOfDigitvilleProblem problem = new TheTwoSneakyNumbersOfDigitvilleProblem();

    @Test
    void example1() {
        // Input: nums = [0,1,1,0]
        // Output: [0,1]
        int[] nums = {0, 1, 1, 0};

        var res = problem.getSneakyNumbers(nums);

        Arrays.sort(res);
        int[] expected = {0, 1};
        assertArrayEquals(expected, res);
    }

    @Test
    void example2() {
        // Input: nums = [0,3,2,1,3,2]
        // Output: [2,3]
        int[] nums = {0, 3, 2, 1, 3, 2};

        var res = problem.getSneakyNumbers(nums);

        Arrays.sort(res);
        int[] expected = {2, 3};
        assertArrayEquals(expected, res);
    }

    @Test
    void example3() {
        // Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]
        // Output: [4,5]
        int[] nums = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};

        var res = problem.getSneakyNumbers(nums);

        Arrays.sort(res);
        int[] expected = {4, 5};
        assertArrayEquals(expected, res);
    }
}
