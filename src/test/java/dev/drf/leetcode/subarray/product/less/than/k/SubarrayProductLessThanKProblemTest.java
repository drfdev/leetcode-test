package dev.drf.leetcode.subarray.product.less.than.k;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarrayProductLessThanKProblemTest {
    private final SubarrayProductLessThanKProblem problem = new SubarrayProductLessThanKProblem();

    @Test
    void example1() {
        /*
        Input: nums = [10,5,2,6], k = 100
        Output: 8
         */
        int[] nums = {10, 5, 2, 6};
        int k = 100;

        var out = problem.numSubarrayProductLessThanK(nums, k);

        assertEquals(8, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,3], k = 0
        Output: 0
         */
        int[] nums = {1, 2, 3};
        int k = 0;

        var out = problem.numSubarrayProductLessThanK(nums, k);

        assertEquals(0, out);
    }
}
