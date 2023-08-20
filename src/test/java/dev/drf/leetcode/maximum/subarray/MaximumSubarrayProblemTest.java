package dev.drf.leetcode.maximum.subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayProblemTest {
    private final MaximumSubarrayProblem problem = new MaximumSubarrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
         */
        int[] nums = new int[]{
                -2, 1, -3, 4, -1, 2, 1, -5, 4
        };

        var result = problem.maxSubArray(nums);

        assertEquals(6, result);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1]
        Output: 1
         */
        int[] nums = new int[]{
                1
        };

        var result = problem.maxSubArray(nums);

        assertEquals(1, result);
    }

    @Test
    void example3() {
        /*
        Input: nums = [5,4,-1,7,8]
        Output: 23
         */
        int[] nums = new int[]{
                5, 4, -1, 7, 8
        };

        var result = problem.maxSubArray(nums);

        assertEquals(23, result);
    }
}
