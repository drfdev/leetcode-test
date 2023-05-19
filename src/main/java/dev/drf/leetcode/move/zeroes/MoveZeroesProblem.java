package dev.drf.leetcode.move.zeroes;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroesProblem implements Problem {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        int cursor = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (value != 0) {
                nums[cursor] = value;
                cursor++;
            }
        }

        for (int i = cursor; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
