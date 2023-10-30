package dev.drf.leetcode.subarray.sum.equals.k;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarraySumEqualsKProblemTest {
    private final SubarraySumEqualsKProblem problem = new SubarraySumEqualsKProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,1,1], k = 2
        Output: 2
         */
        int[] nums = new int[]{
                1, 1, 1
        };
        int k = 2;

        var result = problem.subarraySum(nums, k);

        assertEquals(2, result);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,3], k = 3
        Output: 2
         */
        int[] nums = new int[]{
                1, 2, 3
        };
        int k = 3;

        var result = problem.subarraySum(nums, k);

        assertEquals(2, result);
    }
}
