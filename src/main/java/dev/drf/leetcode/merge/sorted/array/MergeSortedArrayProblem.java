package dev.drf.leetcode.merge.sorted.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArrayProblem implements Problem {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n;
        int[] result = new int[size];

        int cursor1 = 0;
        int cursor2 = 0;

        while (cursor1 < m || cursor2 < n) {
            int index = cursor1 + cursor2;
            int value;

            if (cursor1 < m && cursor2 < n) {
                if (nums1[cursor1] < nums2[cursor2]) {
                    value = nums1[cursor1];
                    cursor1++;
                } else {
                    value = nums2[cursor2];
                    cursor2++;
                }
            } else if (cursor1 < m) {
                value = nums1[cursor1];
                cursor1++;
            } else {
                value = nums2[cursor2];
                cursor2++;
            }

            result[index] = value;
        }

        System.arraycopy(result, 0, nums1, 0, size);
    }
}
