package dev.drf.leetcode.longest.increasing.subsequence;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * Used solution:
 * https://www.youtube.com/watch?v=cjWnW0hdF1Y
 */
public class LongestIncreasingSubsequenceProblem implements Problem {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int[] LIS = new int[nums.length];
        Arrays.fill(LIS, 1);
        int maximumSoFar = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    LIS[i] = Math.max(1 + LIS[j], LIS[i]);
                }
            }
            maximumSoFar = Math.max(maximumSoFar, LIS[i]);
        }
        return maximumSoFar;
    }
}
