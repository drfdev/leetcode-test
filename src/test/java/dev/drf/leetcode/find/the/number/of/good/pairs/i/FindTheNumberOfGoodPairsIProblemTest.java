package dev.drf.leetcode.find.the.number.of.good.pairs.i;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheNumberOfGoodPairsIProblemTest {
    private final FindTheNumberOfGoodPairsIProblem problem = new FindTheNumberOfGoodPairsIProblem();

    @Test
    void example1() {
        /*
        Input: nums1 = [1,3,4], nums2 = [1,3,4], k = 1
        Output: 5
         */
        int[] nums1 = {1, 3, 4};
        int[] nums2 = {1, 3, 4};
        int k = 1;

        var count = problem.numberOfPairs(nums1, nums2, k);

        assertEquals(5, count);
    }

    @Test
    void example2() {
        /*
        Input: nums1 = [1,2,4,12], nums2 = [2,4], k = 3
        Output: 2
         */
        int[] nums1 = {1, 2, 4, 12};
        int[] nums2 = {2, 4};
        int k = 3;

        var count = problem.numberOfPairs(nums1, nums2, k);

        assertEquals(2, count);
    }
}
