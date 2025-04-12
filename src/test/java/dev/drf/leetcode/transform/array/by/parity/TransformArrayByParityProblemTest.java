package dev.drf.leetcode.transform.array.by.parity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TransformArrayByParityProblemTest {
    private final TransformArrayByParityProblem problem = new TransformArrayByParityProblem();

    @Test
    void example1() {
        // Input: nums = [4,3,2,1]
        // Output: [0,0,1,1]
        int[] nums = {4, 3, 2, 1};

        var out = problem.transformArray(nums);

        int[] expected = {0, 0, 1, 1};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,5,1,4,2]
        // Output: [0,0,1,1,1]
        int[] nums = {1, 5, 1, 4, 2};

        var out = problem.transformArray(nums);

        int[] expected = {0, 0, 1, 1, 1};
        assertArrayEquals(expected, out);
    }
}
