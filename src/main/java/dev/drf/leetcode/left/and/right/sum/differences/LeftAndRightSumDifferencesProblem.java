package dev.drf.leetcode.left.and.right.sum.differences;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/left-and-right-sum-differences/
 */
public class LeftAndRightSumDifferencesProblem implements Problem {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        final int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            rightSum -= num;
            res[i] = Math.abs(leftSum - rightSum);
            leftSum += num;
        }
        return res;
    }
}
