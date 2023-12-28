package dev.drf.leetcode.maximum.value.of.an.ordered.triplet.i;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/
 * Solution:
 * https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/solutions/4111950/java-c-python-one-pass-o-n/
 */
public class MaximumValueOfAnOrderedTripletIProblem implements Problem {
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
