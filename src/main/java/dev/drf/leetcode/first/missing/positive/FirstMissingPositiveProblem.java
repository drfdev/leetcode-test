package dev.drf.leetcode.first.missing.positive;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/first-missing-positive/
 * Used solution:
 * https://leetcode.com/problems/first-missing-positive/solutions/17083/o-1-space-java-solution
 */
public class FirstMissingPositiveProblem implements Problem {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }

        final int size = nums.length;
        int i = 0;
        while (i < size) {
            int value = nums[i];
            if (value >= 1
                    && value <= size
                    && nums[value - 1] != value) {
                swap(nums, i, value - 1);
            } else {
                i++;
            }
        }

        i = 0;
        while (i < size
                && nums[i] == i + 1) {
            i++;
        }

        return i + 1;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
