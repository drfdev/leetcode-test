package dev.drf.leetcode.maximum.value.of.an.ordered.triplet.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/
 */
public class MaximumValueOfAnOrderedTripletIIProblem implements Problem {
    public long maximumTripletValue(int[] nums) {
        long result = 0;
        long ijValue = 0;
        long iValue = 0;

        // (nums[i] - nums[j]) * nums[k]
        for (int num : nums) {
            result = Math.max(result, ijValue * num);
            ijValue = Math.max(ijValue, iValue - num);
            iValue = Math.max(iValue, num);
        }

        return result;
    }
}
