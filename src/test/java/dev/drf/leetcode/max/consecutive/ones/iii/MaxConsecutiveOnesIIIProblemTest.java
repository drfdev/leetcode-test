package dev.drf.leetcode.max.consecutive.ones.iii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesIIIProblemTest {
    private final MaxConsecutiveOnesIIIProblem problem = new MaxConsecutiveOnesIIIProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
        Output: 6
         */
        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        var result = problem.longestOnes(nums, k);

        assertEquals(6, result);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
        Output: 10
         */
        int[] nums = new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;

        var result = problem.longestOnes(nums, k);

        assertEquals(10, result);
    }
}
