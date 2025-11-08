package dev.drf.leetcode.minimum.number.game;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-number-game/
 */
public class MinimumNumberGameProblem implements Problem {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        final int size = nums.length;
        for (int i = 0; i < size; i += 2) {
            int val0 = nums[i];
            int val1 = nums[i + 1];
            nums[i + 1] = val0;
            nums[i] = val1;
        }
        return nums;
    }
}
