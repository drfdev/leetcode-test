package dev.drf.leetcode.maximum.product.of.two.elements.in.an.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductOfTwoElementsInAnArrayProblemTest {
    private final MaximumProductOfTwoElementsInAnArrayProblem problem = new MaximumProductOfTwoElementsInAnArrayProblem();

    @Test
    void example1() {
        // Input: nums = [3,4,5,2]
        // Output: 12
        int[] nums = {3, 4, 5, 2};

        int res = problem.maxProduct(nums);

        assertEquals(12, res);
    }

    @Test
    void example2() {
        // Input: nums = [1,5,4,5]
        // Output: 16
        int[] nums = {1, 5, 4, 5};

        int res = problem.maxProduct(nums);

        assertEquals(16, res);
    }

    @Test
    void example3() {
        // Input: nums = [3,7]
        // Output: 12
        int[] nums = {3, 7};

        int res = problem.maxProduct(nums);

        assertEquals(12, res);
    }
}
