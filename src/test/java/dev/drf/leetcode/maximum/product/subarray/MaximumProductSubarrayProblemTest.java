package dev.drf.leetcode.maximum.product.subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductSubarrayProblemTest {
    private final MaximumProductSubarrayProblem problem = new MaximumProductSubarrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [2,3,-2,4]
        Output: 6
         */
        int[] nums = new int[]{
                2, 3, -2, 4
        };

        var res = problem.maxProduct(nums);

        assertEquals(6, res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [-2,0,-1]
        Output: 0
         */
        int[] nums = new int[]{
                -2, 0, -1
        };

        var res = problem.maxProduct(nums);

        assertEquals(0, res);
    }

    @Test
    void myTest1() {
        int[] nums = new int[]{
                -1, 0, 1, 2, 3
        };

        var res = problem.maxProduct(nums);

        assertEquals(6, res);
    }
}
