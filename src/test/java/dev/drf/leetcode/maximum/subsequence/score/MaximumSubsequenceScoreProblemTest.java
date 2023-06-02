package dev.drf.leetcode.maximum.subsequence.score;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubsequenceScoreProblemTest {
    private final MaximumSubsequenceScoreProblem problem = new MaximumSubsequenceScoreProblem();

    @Test
    void example1() {
        /*
        Input: nums1 = [1,3,3,2], nums2 = [2,1,3,4], k = 3
        Output: 12
         */
        int[] nums1 = new int[]{1, 3, 3, 2};
        int[] nums2 = new int[]{2, 1, 3, 4};
        int k = 3;

        var res = problem.maxScore(nums1, nums2, k);

        assertEquals(12, res);
    }

    @Test
    void example2() {
        /*
        Input: nums1 = [4,2,3,1,1], nums2 = [7,5,10,9,6], k = 1
        Output: 30
         */
        int[] nums1 = new int[]{4, 2, 3, 1, 1};
        int[] nums2 = new int[]{7, 5, 10, 9, 6};
        int k = 1;

        var res = problem.maxScore(nums1, nums2, k);

        assertEquals(30, res);
    }
}
