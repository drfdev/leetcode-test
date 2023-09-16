package dev.drf.leetcode.target.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetSumProblemTest {
    private final TargetSumProblem problem = new TargetSumProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,1,1,1,1], target = 3
        Output: 5
         */
        int[] nums = new int[]{
                1, 1, 1, 1, 1
        };
        int target = 3;

        var count = problem.findTargetSumWays(nums, target);

        assertEquals(5, count);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1], target = 1
        Output: 1
         */
        int[] nums = new int[]{
                1
        };
        int target = 1;

        var count = problem.findTargetSumWays(nums, target);

        assertEquals(1, count);
    }
}
