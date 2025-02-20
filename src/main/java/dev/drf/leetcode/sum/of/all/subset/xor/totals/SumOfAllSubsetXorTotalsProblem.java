package dev.drf.leetcode.sum.of.all.subset.xor.totals;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sum-of-all-subset-xor-totals/
 */
public class SumOfAllSubsetXorTotalsProblem implements Problem {
    public int subsetXORSum(int[] nums) {
        return calculateSubSet(0, 0, nums);
    }

    private int calculateSubSet(int xorSum, int startIndex, int[] nums) {
        if (startIndex >= nums.length) {
            return 0;
        }

        int sum = 0;
        for (int i = startIndex; i < nums.length; i++) {
            int num = nums[i];
            int numSum = (xorSum ^ num);
            sum = sum + numSum;
            sum = sum + calculateSubSet(numSum, i + 1, nums);
        }
        return sum;
    }
}
