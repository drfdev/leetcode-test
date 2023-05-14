package dev.drf.leetcode.remove.duplicates.from.sorted.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArrayProblem implements Problem {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int lastValue = nums[0];
        int cursor = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            if (value != lastValue) {
                count ++;
                lastValue = value;

                nums[cursor] = value;
                cursor ++;
            }
        }

        return count;
    }
}
