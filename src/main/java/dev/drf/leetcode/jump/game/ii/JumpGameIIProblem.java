package dev.drf.leetcode.jump.game.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/jump-game-ii/
 */
public class JumpGameIIProblem implements Problem {
    public int jump(int[] nums) {
        if (nums == null) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }

        final int size = nums.length;
        final int lastIndex = size - 1;

        int stepCount = 0;
        int coverage = 0;
        int lastJumpIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            coverage = Math.max(coverage, i + val);

            if (i == lastJumpIndex) {
                lastJumpIndex = coverage;
                stepCount++;

                if (coverage >= lastIndex) {
                    return stepCount;
                }
            }
        }

        return stepCount;
    }
}
