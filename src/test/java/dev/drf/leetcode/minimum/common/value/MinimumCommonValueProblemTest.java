package dev.drf.leetcode.minimum.common.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumCommonValueProblemTest {
    private final MinimumCommonValueProblem problem = new MinimumCommonValueProblem();

    @Test
    void example1() {
        /*
        Input: nums1 = [1,2,3], nums2 = [2,4]
        Output: 2
         */
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};

        var out = problem.getCommon(nums1, nums2);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        /*
        Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
        Output: 2
         */
        int[] nums1 = {1, 2, 3, 6};
        int[] nums2 = {2, 3, 4, 5};

        var out = problem.getCommon(nums1, nums2);

        assertEquals(2, out);
    }
}
