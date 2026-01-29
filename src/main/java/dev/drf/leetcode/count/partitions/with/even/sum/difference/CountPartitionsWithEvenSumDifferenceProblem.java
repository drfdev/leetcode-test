package dev.drf.leetcode.count.partitions.with.even.sum.difference;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-partitions-with-even-sum-difference/
 */
public class CountPartitionsWithEvenSumDifferenceProblem implements Problem {
    public int countPartitions(int[] nums) {
        int fullSum = 0;
        for (int num : nums) {
            fullSum += num;
        }

        int partCount = 0;
        final int lenMinus1 = nums.length - 1;
        int leftSum = 0;
        int rightSum = fullSum;
        for (int i = 0; i < lenMinus1; i++) {
            int val = nums[i];
            leftSum += val;
            rightSum -= val;

            if ((leftSum - rightSum) % 2 == 0) {
                partCount++;
            }
        }

        return partCount;
    }
}
