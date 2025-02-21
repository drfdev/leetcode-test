package dev.drf.leetcode.partition.array.according.to.given.pivot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PartitionArrayAccordingToGivenPivotProblemTest {
    private final PartitionArrayAccordingToGivenPivotProblem problem = new PartitionArrayAccordingToGivenPivotProblem();

    @Test
    void example1() {
        // Input: nums = [9,12,5,10,14,3,10], pivot = 10
        // Output: [9,5,3,10,10,12,14]
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;

        var out = problem.pivotArray(nums, pivot);

        int[] expected = {9, 5, 3, 10, 10, 12, 14};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: nums = [-3,4,3,2], pivot = 2
        // Output: [-3,2,4,3]
        int[] nums = {-3, 4, 3, 2};
        int pivot = 2;

        var out = problem.pivotArray(nums, pivot);

        int[] expected = {-3, 2, 4, 3};
        assertArrayEquals(expected, out);
    }

    @Test
    void myTest() {
        // 1,2,1,4,1,2,1,3
        // 1,1,1,1,2,2,4,3
        int[] nums = {1, 2, 1, 4, 1, 2, 1, 3};
        int pivot = 2;

        var out = problem.pivotArray(nums, pivot);

        int[] expected = {1, 1, 1, 1, 2, 2, 4, 3};
        assertArrayEquals(expected, out);
    }
}
