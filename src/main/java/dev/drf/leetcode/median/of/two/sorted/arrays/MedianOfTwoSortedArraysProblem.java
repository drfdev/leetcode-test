package dev.drf.leetcode.median.of.two.sorted.arrays;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * solution explanation:
 * https://www.youtube.com/watch?v=q6IEA26hvXc
 */
public class MedianOfTwoSortedArraysProblem implements Problem {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int minSize = nums1.length;
        final int maxSize = nums2.length;

        if (minSize > maxSize) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int totalSize = minSize + maxSize;
        int half = (totalSize + 1) / 2;

        int left = 0;
        int right = minSize;

        double result = 0.0;

        while (left <= right) {
            int i = (right + left) / 2;
            int j = half - i;

            int left1 = (i > 0)
                    ? nums1[i - 1]
                    : Integer.MIN_VALUE;
            int right1 = (i < minSize)
                    ? nums1[i]
                    : Integer.MAX_VALUE;
            int left2 = (j > 0)
                    ? nums2[j - 1]
                    : Integer.MIN_VALUE;
            int right2 = (j < maxSize)
                    ? nums2[j]
                    : Integer.MAX_VALUE;

            if (left1 <= right2 && left2 <= right1) {
                if (totalSize % 2 == 0) {
                    // even
                    double leftMax = Math.max(left1, left2);
                    double rightMin = Math.min(right1, right2);

                    result = (leftMax + rightMin) / 2.0;
                } else {
                    // odd
                    result = Math.max(left1, left2);
                }

                break;
            } else if (left1 > right2) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }

        return result;
    }
}
