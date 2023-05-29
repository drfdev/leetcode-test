package dev.drf.leetcode.longest.consecutive.sequence;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 */
public class LongestConsecutiveSequenceProblem implements Problem {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int maxLength = 0;
        int currentLength = 1;
        int previousValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];

            if (value == previousValue + 1) {
                currentLength++;
            } else if (value == previousValue) {
                // skip this value
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }

            previousValue = value;
        }

        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }
}
