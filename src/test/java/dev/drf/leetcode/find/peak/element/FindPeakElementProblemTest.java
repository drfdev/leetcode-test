package dev.drf.leetcode.find.peak.element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementProblemTest {
    private final FindPeakElementProblem problem = new FindPeakElementProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,1]
        Output: 2
         */
        int[] nums = new int[]{
                1, 2, 3, 1
        };

        int index = problem.findPeakElement(nums);

        assertEquals(2, index);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,1,3,5,6,4]
        Output: 5
         */
        int[] nums = new int[]{
                1, 2, 1, 3, 5, 6, 4
        };

        int index = problem.findPeakElement(nums);

        assertEquals(5, index);
    }
}
