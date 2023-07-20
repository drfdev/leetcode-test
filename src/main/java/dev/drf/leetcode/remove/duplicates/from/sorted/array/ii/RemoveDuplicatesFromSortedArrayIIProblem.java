package dev.drf.leetcode.remove.duplicates.from.sorted.array.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class RemoveDuplicatesFromSortedArrayIIProblem implements Problem {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        int prevValue = nums[0];
        int index = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];

            if (prevValue == value) {
                count++;
                if (count <= 2) {
                    index++;
                }
            } else {
                prevValue = value;
                count = 1;
                index++;
            }
            nums[index] = value;
        }

        return index + 1;
    }
}
