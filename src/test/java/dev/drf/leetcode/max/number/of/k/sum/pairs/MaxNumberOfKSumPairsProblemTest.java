package dev.drf.leetcode.max.number.of.k.sum.pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberOfKSumPairsProblemTest {
    private final MaxNumberOfKSumPairsProblem problem = new MaxNumberOfKSumPairsProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,4], k = 5
        Output: 2
         */
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 5;

        int count = problem.maxOperations(nums, k);

        assertEquals(2, count);
    }

    @Test
    void example2() {
        /*
        Input: nums = [3,1,3,4,3], k = 6
        Output: 1
         */
        int[] nums = new int[]{3, 1, 3, 4, 3};
        int k = 6;

        int count = problem.maxOperations(nums, k);

        assertEquals(1, count);
    }
}
