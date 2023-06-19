package dev.drf.leetcode.search.insert.position;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPositionProblem implements Problem {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }

        final int size = nums.length;

        int leftIndex = 0;
        int rightIndex = size - 1;

        while (leftIndex <= rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;
            int value = nums[middle];

            if (value == target) {
                return middle;
            } else if (value > target) {
                rightIndex = middle - 1;
            } else {
                // value <= target
                leftIndex = middle + 1;
            }

        }

        return leftIndex;
    }
}
