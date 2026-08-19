package dev.drf.leetcode.maximum.product.difference.between.two.pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductDifferenceBetweenTwoPairsProblemTest {
    private final MaximumProductDifferenceBetweenTwoPairsProblem problem = new MaximumProductDifferenceBetweenTwoPairsProblem();

    @Test
    void example1() {
        // Input: nums = [5,6,2,7,4]
        // Output: 34
        int[] nums = {5, 6, 2, 7, 4};

        int out = problem.maxProductDifference(nums);

        assertEquals(34, out);
    }

    @Test
    void example2() {
        // Input: nums = [4,2,5,9,7,4,8]
        // Output: 64
        int[] nums = {4, 2, 5, 9, 7, 4, 8};

        int out = problem.maxProductDifference(nums);

        assertEquals(64, out);
    }
}
