package dev.drf.leetcode.search.in.rotated.sorted.array.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 */
public class SearchInRotatedSortedArrayIiProblem implements Problem {
    public boolean search(int[] nums, int target) {
        if (nums == null) {
            return false;
        }

        if (nums.length == 1) {
            return nums[0] == target;
        }

        var minIndex = 0;
        var maxIndex = nums.length - 1;

        while (true) {
            if (minIndex == maxIndex) {
                return nums[minIndex] == target;
            }
            if (maxIndex == minIndex + 1) {
                return nums[minIndex] == target || nums[maxIndex] == target;
            }

            var average = (minIndex + maxIndex) / 2;
            var value = nums[average];

            if (target == value) {
                return true;
            }

            var minValue = nums[minIndex];
            var maxValue = nums[maxIndex];

            if (minValue == target
                    || maxValue == target) {
                return true;
            }
            if (minValue == maxValue) {
                minIndex = minIndex + 1;
            } else if (value == minValue) {
                minIndex = average;
            } else if (value == maxValue) {
                maxIndex = average;
            } else if (target < value) {
                // left
                if (minValue > target && minValue < value) {
                    minIndex = average + 1;
                } else {
                    maxIndex = average;
                }
            } else {
                // right
                if (maxValue < target && value < maxValue) {
                    maxIndex = average - 1;
                } else {
                    minIndex = average;
                }
            }
        }
    }
}
