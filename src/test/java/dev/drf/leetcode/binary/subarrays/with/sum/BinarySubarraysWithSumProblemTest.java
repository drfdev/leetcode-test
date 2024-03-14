package dev.drf.leetcode.binary.subarrays.with.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySubarraysWithSumProblemTest {
    private final BinarySubarraysWithSumProblem problem = new BinarySubarraysWithSumProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,0,1,0,1], goal = 2
        Output: 4
         */
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        var res = problem.numSubarraysWithSum(nums, goal);

        assertEquals(4, res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,0,0,0,0], goal = 0
        Output: 15
         */
        int[] nums = {0, 0, 0, 0, 0};
        int goal = 0;

        var res = problem.numSubarraysWithSum(nums, goal);

        assertEquals(15, res);
    }
}
