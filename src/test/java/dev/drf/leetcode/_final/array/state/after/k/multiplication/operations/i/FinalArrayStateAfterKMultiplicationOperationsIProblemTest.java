package dev.drf.leetcode._final.array.state.after.k.multiplication.operations.i;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FinalArrayStateAfterKMultiplicationOperationsIProblemTest {
    private final FinalArrayStateAfterKMultiplicationOperationsIProblem problem = new FinalArrayStateAfterKMultiplicationOperationsIProblem();

    @Test
    void example1() {
        // Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
        // Output: [8,4,6,5,6]
        int[] nums = {2, 1, 3, 5, 6};
        int k = 5;
        int multiplier = 2;

        var out = problem.getFinalState(nums, k, multiplier);

        int[] expected = {8, 4, 6, 5, 6};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,2], k = 3, multiplier = 4
        // Output: [16,8]
        int[] nums = {1, 2};
        int k = 3;
        int multiplier = 4;

        var out = problem.getFinalState(nums, k, multiplier);

        int[] expected = {16, 8};
        assertArrayEquals(expected, out);
    }

    @Test
    void failed1() {
        // nums = [1]
        //k = 1
        //multiplier = 4
        int[] nums = {1};
        int k = 1;
        int multiplier = 4;

        var out = problem.getFinalState(nums, k, multiplier);

        int[] expected = {4};
        assertArrayEquals(expected, out);
    }
}
