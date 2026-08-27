package dev.drf.leetcode.distribute.elements.into.two.arrays.i;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DistributeElementsIntoTwoArraysIProblemTest {
    private final DistributeElementsIntoTwoArraysIProblem problem = new DistributeElementsIntoTwoArraysIProblem();

    @Test
    void example1() {
        // Input: nums = [2,1,3]
        // Output: [2,3,1]
        int[] nums = {2, 1, 3};

        var out = problem.resultArray(nums);

        int[] expected = {2, 3, 1};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: nums = [5,4,3,8]
        // Output: [5,3,4,8]
        int[] nums = {5, 4, 3, 8};

        var out = problem.resultArray(nums);

        int[] expected = {5, 3, 4, 8};
        assertArrayEquals(expected, out);
    }

    @Test
    void failure1() {
        // [1,2,14,15]
        int[] nums = {1, 2, 14, 15};

        var out = problem.resultArray(nums);

        int[] expected = {1, 2, 14, 15};
        assertArrayEquals(expected, out);
    }
}
