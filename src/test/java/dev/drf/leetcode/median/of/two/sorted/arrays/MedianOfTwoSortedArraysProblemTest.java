package dev.drf.leetcode.median.of.two.sorted.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysProblemTest {
    private final MedianOfTwoSortedArraysProblem problem = new MedianOfTwoSortedArraysProblem();

    @Test
    void example1() {
        /*
        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
         */
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};

        var res = problem.findMedianSortedArrays(nums1, nums2);

        assertEquals(2.00000, res);
    }

    @Test
    void example2() {
        /*
        Input: nums1 = [1,2], nums2 = [3,4]
        Output: 2.50000
         */
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};

        var res = problem.findMedianSortedArrays(nums1, nums2);

        assertEquals(2.50000, res);
    }

    @Test
    void myTest1() {
        int[] nums1 = new int[]{
                1, 3, 5, 7, 9
        };
        int[] nums2 = new int[]{
                2, 4, 6, 8, 10
        };

        var res = problem.findMedianSortedArrays(nums1, nums2);

        assertEquals(5.50000, res);
    }
}
