package dev.drf.leetcode.jump.game;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/jump-game/
 */
public class JumpGameProblem implements Problem {
    public boolean canJump(int[] nums) {
        if (nums == null) {
            return false;
        }
        final int size = nums.length;
        final int lastIndex = size - 1;

        int reachable = 0;
        for (int i = 0; i < size; i++) {
            if (i > reachable) {
                return false;
            }
            int val = nums[i];
            reachable = Math.max(reachable, i + val);
        }

        return true;
    }
}
