package dev.drf.leetcode.largest.rectangle.in.histogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestRectangleInHistogramProblemTest {
    private final LargestRectangleInHistogramProblem problem = new LargestRectangleInHistogramProblem();

    @Test
    void example1() {
        /*
        Input: heights = [2,1,5,6,2,3]
        Output: 10
         */
        int[] heights = new int[]{
                2, 1, 5, 6, 2, 3
        };

        var result = problem.largestRectangleArea(heights);

        assertEquals(10, result);
    }

    @Test
    void example2() {
        /*
        Input: heights = [2,4]
        Output: 4
         */
        int[] heights = new int[]{
                2, 4
        };

        var result = problem.largestRectangleArea(heights);

        assertEquals(4, result);
    }
}
