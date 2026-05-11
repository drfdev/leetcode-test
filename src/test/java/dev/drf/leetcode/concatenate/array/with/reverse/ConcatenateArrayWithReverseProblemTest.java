package dev.drf.leetcode.concatenate.array.with.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatenateArrayWithReverseProblemTest {
    private final ConcatenateArrayWithReverseProblem problem = new ConcatenateArrayWithReverseProblem();

    @Test
    void example1() {
        // Input: nums = [1,2,3]
        // Output: [1,2,3,3,2,1]
        int[] nums = {1, 2, 3};

        var out = problem.concatWithReverse(nums);

        int[] expected = {1, 2, 3, 3, 2, 1};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: nums = [1]
        // Output: [1,1]
        int[] nums = {1};

        var out = problem.concatWithReverse(nums);

        int[] expected = {1, 1};
        assertArrayEquals(expected, out);
    }
}
