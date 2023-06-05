package dev.drf.leetcode.find.peak.element;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-peak-element/
 * Used solution:
 * https://leetcode.com/problems/find-peak-element/solutions/50239/java-solution-and-explanation-using-invariants/
 */
public class FindPeakElementProblem implements Problem {
    public int findPeakElement(int[] nums) {
        final int size = nums.length;
        if (size == 1) {
            return 0;
        }

        int left = 0;
        int right = size - 1;

        while (right - left > 1) {
            int index = (left + right) / 2;

            int leftValue = nums[index];
            int rightValue = nums[index + 1];

            if (leftValue < rightValue) {
                left = index + 1;
            } else {
                right = index;
            }
        }

        if (left == size - 1 || nums[left] > nums[left + 1]) {
            return left;
        }

        return right;
    }
}
