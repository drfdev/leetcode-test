package dev.drf.leetcode.largest.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberProblemTest {
    private final LargestNumberProblem problem = new LargestNumberProblem();

    @Test
    void example1() {
        /*
        Input: nums = [10,2]
        Output: "210"
         */
        int[] nums = new int[]{
                10, 2
        };

        var out = problem.largestNumber(nums);

        assertEquals("210", out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [3,30,34,5,9]
        Output: "9534330"
         */
        int[] nums = new int[]{
                3, 30, 34, 5, 9
        };

        var out = problem.largestNumber(nums);

        assertEquals("9534330", out);
    }
}
