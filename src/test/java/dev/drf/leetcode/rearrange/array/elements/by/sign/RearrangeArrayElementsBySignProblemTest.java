package dev.drf.leetcode.rearrange.array.elements.by.sign;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RearrangeArrayElementsBySignProblemTest {
    private final RearrangeArrayElementsBySignProblem problem = new RearrangeArrayElementsBySignProblem();

    @Test
    void example1() {
        /*
        Input: nums = [3,1,-2,-5,2,-4]
        Output: [3,-2,1,-5,2,-4]
         */
        int[] nums = {
                3, 1, -2, -5, 2, -4
        };

        var out = problem.rearrangeArray(nums);

        int[] expected = {
                3, -2, 1, -5, 2, -4
        };
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [-1,1]
        Output: [1,-1]
         */
        int[] nums = {
                -1, 1
        };

        var out = problem.rearrangeArray(nums);

        int[] expected = {
                1, -1
        };
        assertArrayEquals(expected, out);
    }
}
