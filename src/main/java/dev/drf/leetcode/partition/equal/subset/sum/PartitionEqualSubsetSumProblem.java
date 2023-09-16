package dev.drf.leetcode.partition.equal.subset.sum;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/partition-equal-subset-sum/
 * Used solution:
 * https://www.youtube.com/watch?v=IsvocB5BJhw
 */
public class PartitionEqualSubsetSumProblem implements Problem {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return nums[0] == 0;
        }

        int sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        boolean[] dp = new boolean[target];
        dp[0] = true;

        for (int no : nums) {
            for (int i = target; i >= no; i--) {
                if (dp[i - no]) {
                    if (i == target) {
                        return true;
                    }
                    dp[i] = true;
                }
            }
        }
        return false;
    }
}
