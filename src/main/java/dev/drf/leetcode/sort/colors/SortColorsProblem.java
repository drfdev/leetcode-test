package dev.drf.leetcode.sort.colors;

import dev.drf.leetcode.Problem;


/**
 * https://leetcode.com/problems/sort-colors/
 * Used algorithm:
 * https://en.wikipedia.org/wiki/Bubble_sort
 */
public class SortColorsProblem implements Problem {
    public void sortColors(int[] nums) {
//        java.util.Arrays.sort(nums);

        if (nums == null) {
            return;
        }

        final int size = nums.length;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < size - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    private void swap(int[] nums, int first, int second) {
        int firstValue = nums[first];
        nums[first] = nums[second];
        nums[second] = firstValue;
    }
}
