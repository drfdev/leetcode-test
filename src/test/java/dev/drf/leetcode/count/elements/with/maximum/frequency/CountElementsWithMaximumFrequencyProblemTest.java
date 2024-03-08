package dev.drf.leetcode.count.elements.with.maximum.frequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountElementsWithMaximumFrequencyProblemTest {
    private final CountElementsWithMaximumFrequencyProblem problem = new CountElementsWithMaximumFrequencyProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,2,3,1,4]
        Output: 4
         */
        int[] nums = {1, 2, 2, 3, 1, 4};

        var out = problem.maxFrequencyElements(nums);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,3,4,5]
        Output: 5
         */
        int[] nums = {1, 2, 3, 4, 5};

        var out = problem.maxFrequencyElements(nums);

        assertEquals(5, out);
    }
}
