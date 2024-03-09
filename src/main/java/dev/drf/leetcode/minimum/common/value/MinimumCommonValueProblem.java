package dev.drf.leetcode.minimum.common.value;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-common-value/
 */
public class MinimumCommonValueProblem implements Problem {
    public int getCommon(int[] nums1, int[] nums2) {
        final int size1 = nums1.length;
        final int size2 = nums2.length;

        int p1 = 0;
        int p2 = 0;

        while (p1 < size1 && p2 < size2) {
            int val1 = nums1[p1];
            int val2 = nums2[p2];

            if (val1 == val2) {
                return val1;
            }
            if (val2 > val1) {
                p1++;
            } else {
                p2++;
            }
        }

        return -1;
    }
}
