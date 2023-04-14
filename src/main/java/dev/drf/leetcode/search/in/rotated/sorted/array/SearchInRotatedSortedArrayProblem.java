package dev.drf.leetcode.search.in.rotated.sorted.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArrayProblem implements Problem {

    public int search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        var minIndex = 0;
        var maxIndex = nums.length - 1;

        while (true) {
            if (minIndex == maxIndex) {
                return nums[minIndex] == target ? minIndex : -1;
            }
            if (maxIndex == minIndex + 1) {
                return nums[minIndex] == target ? minIndex
                        : nums[maxIndex] == target ? maxIndex : -1;
            }

            var average = (minIndex + maxIndex) / 2;
            var value = nums[average];

            if (target == value) {
                return average;
            }

            if (target < value) {
                // left
                var minValue = nums[minIndex];
                if (minValue > target && minValue < value) {
                    minIndex = average + 1;
                } else {
                    maxIndex = average;
                }
            } else {
                // right
                var maxValue = nums[maxIndex];
                if (maxValue < target && value < maxValue) {
                    maxIndex = average - 1;
                } else {
                    minIndex = average;
                }
            }
        }

    }
}
