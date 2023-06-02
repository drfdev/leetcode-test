package dev.drf.leetcode.kth.largest.element.in.an.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestElementInAnArrayProblemTest {
    private final KthLargestElementInAnArrayProblem problem = new KthLargestElementInAnArrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [3,2,1,5,6,4], k = 2
        Output: 5
         */
        int[] nums = new int[]{
                3, 2, 1, 5, 6, 4
        };
        int k = 2;

        var result = problem.findKthLargest(nums, k);

        assertEquals(5, result);
    }

    @Test
    void example2() {
        /*
        Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
        Output: 4
         */
        int[] nums = new int[]{
                3, 2, 3, 1, 2, 4, 5, 5, 6
        };
        int k = 4;

        var result = problem.findKthLargest(nums, k);

        assertEquals(4, result);
    }
}
