package dev.drf.leetcode.merge.sorted.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortedArrayProblemTest {
    private final MergeSortedArrayProblem problem = new MergeSortedArrayProblem();

    private static void assertArray(int[] nums1, int... values) {
        assertEquals(values.length, nums1.length);
        for (int i = 0; i < nums1.length; i++) {
            assertEquals(values[i], nums1[i]);
        }
    }

    @Test
    void example1() {
        /*
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
         */
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        problem.merge(nums1, m, nums2, n);

        assertArray(nums1, 1, 2, 2, 3, 5, 6);
    }

    @Test
    void example2() {
        /*
        Input: nums1 = [1], m = 1, nums2 = [], n = 0
        Output: [1]
         */
        int[] nums1 = new int[]{1};
        int m = 1;
        int[] nums2 = new int[0];
        int n = 0;

        problem.merge(nums1, m, nums2, n);

        assertArray(nums1, 1);
    }

    @Test
    void example3() {
        /*
        Input: nums1 = [0], m = 0, nums2 = [1], n = 1
        Output: [1]
         */
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;

        problem.merge(nums1, m, nums2, n);

        assertArray(nums1, 1);
    }

    @Test
    void myTest1() {
        int[] nums1 = new int[]{2, 9, 0, 0, 0, 0};
        int m = 2;
        int[] nums2 = new int[]{1, 3, 4, 7};
        int n = 4;

        problem.merge(nums1, m, nums2, n);

        assertArray(nums1, 1, 2, 3, 4, 7, 9);
    }
}
