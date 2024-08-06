package dev.drf.leetcode.minimum.average.of.smallest.and.largest.elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAverageOfSmallestAndLargestElementsProblemTest {
    private final MinimumAverageOfSmallestAndLargestElementsProblem problem = new MinimumAverageOfSmallestAndLargestElementsProblem();

    @Test
    void example1() {
        /*
        Input: nums = [7,8,3,4,15,13,4,1]
        Output: 5.5
         */
        int[] nums = {7, 8, 3, 4, 15, 13, 4, 1};

        var output = problem.minimumAverage(nums);

        assertEquals(5.5, output);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,9,8,3,10,5]
        Output: 5.5
         */
        int[] nums = {1, 9, 8, 3, 10, 5};

        var output = problem.minimumAverage(nums);

        assertEquals(5.5, output);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,2,3,7,8,9]
        Output: 5.0
         */
        int[] nums = {1, 2, 3, 7, 8, 9};

        var output = problem.minimumAverage(nums);

        assertEquals(5.0, output);
    }
}
