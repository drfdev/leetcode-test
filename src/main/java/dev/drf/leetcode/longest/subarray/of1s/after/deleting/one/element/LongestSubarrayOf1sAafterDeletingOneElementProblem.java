package dev.drf.leetcode.longest.subarray.of1s.after.deleting.one.element;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
 */
public class LongestSubarrayOf1sAafterDeletingOneElementProblem implements Problem {
    public int longestSubarray(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int max = -1;

        int leftIndex = -1;
        int rightIndex = 0;
        int removedIndex = -1;

        for (rightIndex = 0; rightIndex < nums.length; rightIndex++) {
            int value = nums[rightIndex];

            if (value == 0) {
                leftIndex = removedIndex;
                removedIndex = rightIndex;
            }

            int sum = rightIndex - leftIndex;
            if (removedIndex <= rightIndex && removedIndex > leftIndex) {
                sum = sum - 1;
            }
            max = Math.max(sum, max);
        }

        if (removedIndex == -1) {
            int sum = max - 1;
            max = Math.max(sum, 0);
        }

        return max;
    }
}
