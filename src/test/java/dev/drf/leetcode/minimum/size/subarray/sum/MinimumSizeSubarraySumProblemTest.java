package dev.drf.leetcode.minimum.size.subarray.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSizeSubarraySumProblemTest {
    private final MinimumSizeSubarraySumProblem problem = new MinimumSizeSubarraySumProblem();

    @Test
    void example1() {
        /*
        Input: target = 7, nums = [2,3,1,2,4,3]
        Output: 2
         */
        int target = 7;
        int[] nums = new int[]{
                2, 3, 1, 2, 4, 3
        };

        var min = problem.minSubArrayLen(target, nums);

        assertEquals(2, min);
    }

    @Test
    void example2() {
        /*
        Input: target = 4, nums = [1,4,4]
        Output: 1
         */
        int target = 4;
        int[] nums = new int[]{
                1, 4, 4
        };

        var min = problem.minSubArrayLen(target, nums);

        assertEquals(1, min);
    }

    @Test
    void example3() {
        /*
        Input: target = 11, nums = [1,1,1,1,1,1,1,1]
        Output: 0
         */
        int target = 11;
        int[] nums = new int[]{
                1, 1, 1, 1, 1, 1, 1, 1
        };

        var min = problem.minSubArrayLen(target, nums);

        assertEquals(0, min);
    }

    @Test
    void failed1() {
        /*
        213
        [12,28,83,4,25,26,25,2,25,25,25,12]
         */
        int target = 213;
        int[] nums = new int[]{
                12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12
        };

        var min = problem.minSubArrayLen(target, nums);

        assertEquals(8, min);
    }
}
