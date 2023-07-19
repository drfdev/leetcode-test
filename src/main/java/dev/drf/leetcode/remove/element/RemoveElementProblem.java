package dev.drf.leetcode.remove.element;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElementProblem implements Problem {
    public int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (value != val) {
                nums[index] = value;
                index++;
            }
        }

        return index;
    }
}
