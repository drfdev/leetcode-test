package dev.drf.leetcode.find.minimum.in.rotated.sorted.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class FindMinimumInRotatedSortedArrayProblem implements Problem {

    public int findMin(int[] nums) {
        if (nums == null) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return nums[0] < nums[1]
                    ? nums[0] : nums[1];
        }

        var minIndex = 0;
        var maxIndex = nums.length - 1;

        while (true) {
            if (minIndex == maxIndex) {
                return nums[minIndex];
            }
            if (maxIndex == minIndex + 1) {
                var minValue = nums[minIndex];
                var maxValue = nums[maxIndex];
                return minValue > maxValue ? maxValue : minValue;
            }

            var average = (minIndex + maxIndex) / 2;
            var value = nums[average];

            var minValue = nums[minIndex];
            var maxValue = nums[maxIndex];

            if (maxValue < minValue) {
                if (value > maxValue) {
                    minIndex = average;
                } else {
                    maxIndex = average;
                }
            } else {
                maxIndex = average;
            }
        }
    }
}
