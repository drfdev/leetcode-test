package dev.drf.leetcode.find.first.and.last.position.of.element.in.sorted.array;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
 */
public class FindFirstAndLastPositionOfElementInSortedArrayProblem {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        if (nums.length == 1) {
            if (target == nums[0]) {
                return new int[]{0, 0};
            } else {
                return new int[]{-1, -1};
            }
        }

        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left < right) {
            int middle = (left + right) / 2;
            var value = nums[middle];

            if (value == target) {
                index = middle;
                break;
            } else if (value > target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        if (left == right
                && nums[left] == target) {
            return new int[]{left, left};
        }

        if (index == -1) {
            return new int[]{-1, -1};
        }
        left = index;
        right = index;

        for (int i = left; i >= 0; i--) {
            if (nums[i] == target) {
                left = i;
            } else {
                break;
            }
        }
        for (int i = right; i < nums.length; i++) {
            if (nums[i] == target) {
                right = i;
            } else {
                break;
            }
        }

        return new int[]{
                left,
                right
        };
    }
}
