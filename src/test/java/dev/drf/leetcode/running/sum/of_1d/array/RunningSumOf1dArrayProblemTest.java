package dev.drf.leetcode.running.sum.of_1d.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunningSumOf1dArrayProblemTest {
    private final RunningSumOf1dArrayProblem problem = new RunningSumOf1dArrayProblem();

    @Test
    void example1() {
        // Input: nums = [1,2,3,4]
        // Output: [1,3,6,10]
        int[] nums = {1, 2, 3, 4};

        var out = problem.runningSum(nums);

        int[] expected = {1, 3, 6, 10};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,1,1,1,1]
        // Output: [1,2,3,4,5]
        int[] nums = {1, 1, 1, 1, 1};

        var out = problem.runningSum(nums);

        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, out);
    }

    @Test
    void example3() {
        // Input: nums = [3,1,2,10,1]
        // Output: [3,4,6,16,17]
        int[] nums = {3, 1, 2, 10, 1};

        var out = problem.runningSum(nums);

        int[] expected = {3, 4, 6, 16, 17};
        assertArrayEquals(expected, out);
    }
}
