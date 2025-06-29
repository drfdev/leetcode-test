package dev.drf.leetcode.minimum.operations.to.make.array.sum.divisible.by.k;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/
 */
public class MinimumOperationsToMakeArraySumDivisibleByKProblem implements Problem {
    public int minOperations(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0] % k;
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum % k;
    }
}
