package dev.drf.leetcode.minimum.number.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinimumNumberGameProblemTest {
    private final MinimumNumberGameProblem problem = new MinimumNumberGameProblem();

    @Test
    void example1() {
        // Input: nums = [5,4,2,3]
        // Output: [3,2,5,4]
        int[] nums = {5, 4, 2, 3};

        int[] values = problem.numberGame(nums);

        int[] expected = {3, 2, 5, 4};
        assertArrayEquals(expected, values);
    }

    @Test
    void example2() {
        // Input: nums = [2,5]
        // Output: [5,2]
        int[] nums = {2, 5};

        int[] values = problem.numberGame(nums);

        int[] expected = {5, 2};
        assertArrayEquals(expected, values);
    }
}
