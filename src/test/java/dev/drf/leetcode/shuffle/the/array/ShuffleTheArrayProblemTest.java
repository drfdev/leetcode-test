package dev.drf.leetcode.shuffle.the.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ShuffleTheArrayProblemTest {
    private final ShuffleTheArrayProblem problem = new ShuffleTheArrayProblem();

    @Test
    void example1() {
        // Input: nums = [2,5,1,3,4,7], n = 3
        // Output: [2,3,5,4,1,7]
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        var res = problem.shuffle(nums, n);

        int[] expected = {2, 3, 5, 4, 1, 7};
        assertArrayEquals(expected, res);
    }

    @Test
    void example2() {
        // Input: nums = [1,2,3,4,4,3,2,1], n = 4
        // Output: [1,4,2,3,3,2,4,1]
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;

        var res = problem.shuffle(nums, n);

        int[] expected = {1, 4, 2, 3, 3, 2, 4, 1};
        assertArrayEquals(expected, res);
    }

    @Test
    void example3() {
        // Input: nums = [1,1,2,2], n = 2
        // Output: [1,2,1,2]
        int[] nums = {1, 1, 2, 2};
        int n = 2;

        var res = problem.shuffle(nums, n);

        int[] expected = {1, 2, 1, 2};
        assertArrayEquals(expected, res);
    }
}
