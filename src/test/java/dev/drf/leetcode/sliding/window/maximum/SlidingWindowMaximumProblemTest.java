package dev.drf.leetcode.sliding.window.maximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SlidingWindowMaximumProblemTest {
    private final SlidingWindowMaximumProblem2 problem = new SlidingWindowMaximumProblem2();

    @Test
    void example1() {
        /*
        Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
        Output: [3,3,5,5,6,7]
         */
        int[] nums = new int[]{
                1, 3, -1, -3, 5, 3, 6, 7
        };
        int k = 3;

        var res = problem.maxSlidingWindow(nums, k);

        var expected = new int[]{
                3, 3, 5, 5, 6, 7
        };
        assertArrayEquals(expected, res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1], k = 1
        Output: [1]
         */
        int[] nums = new int[]{
                1
        };
        int k = 1;

        var res = problem.maxSlidingWindow(nums, k);

        var expected = new int[]{
                1
        };
        assertArrayEquals(expected, res);
    }
}
