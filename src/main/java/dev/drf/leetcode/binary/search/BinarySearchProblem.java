package dev.drf.leetcode.binary.search;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/binary-search/
 */
public class BinarySearchProblem implements Problem {
    public int search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        var minIndex = 0;
        var maxIndex = nums.length - 1;

        return recursiveSearch(nums, target, minIndex, maxIndex);
    }

    private int recursiveSearch(int[] nums, int target, int minIndex, int maxIndex) {
        if (minIndex > maxIndex) {
            return -1;
        }
        if (minIndex == maxIndex) {
            return nums[minIndex] == target ? minIndex : -1;
        }

        var index = (minIndex + maxIndex) / 2;

        var value = nums[index];
        if (value == target) {
            return index;
        }
        if (target < value) {
            // choose left
            return recursiveSearch(nums, target, minIndex, index);
        }

        // choose right
        return recursiveSearch(nums, target, index + 1, maxIndex);
    }
}
