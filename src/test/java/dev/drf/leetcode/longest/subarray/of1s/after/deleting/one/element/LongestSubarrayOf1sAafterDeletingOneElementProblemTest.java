package dev.drf.leetcode.longest.subarray.of1s.after.deleting.one.element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayOf1sAafterDeletingOneElementProblemTest {
    private final LongestSubarrayOf1sAafterDeletingOneElementProblem problem = new LongestSubarrayOf1sAafterDeletingOneElementProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,1,0,1]
        Output: 3
         */
        int[] nums = new int[]{1, 1, 0, 1};

        var count = problem.longestSubarray(nums);

        assertEquals(3, count);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,1,1,1,0,1,1,0,1]
        Output: 5
         */
        int[] nums = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1};

        var count = problem.longestSubarray(nums);

        assertEquals(5, count);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,1,1]
        Output: 2
         */
        int[] nums = new int[]{1, 1, 1};

        var count = problem.longestSubarray(nums);

        assertEquals(2, count);
    }

    @Test
    void failed1() {
        // [1,1,0,0,1,1,1,0,1]
        int[] nums = new int[]{1, 1, 0, 0, 1, 1, 1, 0, 1};

        var count = problem.longestSubarray(nums);

        assertEquals(4, count);
    }
}
