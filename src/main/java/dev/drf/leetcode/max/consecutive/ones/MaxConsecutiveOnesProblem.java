package dev.drf.leetcode.max.consecutive.ones;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 */
public class MaxConsecutiveOnesProblem implements Problem {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int ones = 0;
        int maxOnes = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (value == 0) {
                maxOnes = Math.max(ones, maxOnes);
                ones = 0;
            } else {
                ones++;
            }
        }

        return Math.max(ones, maxOnes);
    }
}
