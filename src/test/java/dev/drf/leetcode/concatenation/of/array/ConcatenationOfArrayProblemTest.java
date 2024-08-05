package dev.drf.leetcode.concatenation.of.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatenationOfArrayProblemTest {
    private final ConcatenationOfArrayProblem problem = new ConcatenationOfArrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]
         */
        int[] nums = {1, 2, 1};

        var result = problem.getConcatenation(nums);

        int[] expected = {1, 2, 1, 1, 2, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,3,2,1]
        Output: [1,3,2,1,1,3,2,1]
         */
        int[] nums = {1, 3, 2, 1};

        var result = problem.getConcatenation(nums);

        int[] expected = {1, 3, 2, 1, 1, 3, 2, 1};
        assertArrayEquals(expected, result);
    }
}
