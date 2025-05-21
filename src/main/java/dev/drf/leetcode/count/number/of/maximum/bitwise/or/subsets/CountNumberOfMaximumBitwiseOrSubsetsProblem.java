package dev.drf.leetcode.count.number.of.maximum.bitwise.or.subsets;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/
 * Used solution:
 * https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/solutions/5928761/beats-96-00-step-by-step-breakdown/
 */
public class CountNumberOfMaximumBitwiseOrSubsetsProblem implements Problem {
    public int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;

        for (int num : nums) {
            maxOR |= num;
        }

        int[] count = new int[1];
        backtrack(nums, 0, 0, maxOR, count);

        return count[0];
    }

    private void backtrack(final int[] nums,
                           final int index,
                           final int currentOR,
                           final int maxOR,
                           final int[] count) {
        if (currentOR == maxOR) {
            count[0]++;
        }

        for (int i = index; i < nums.length; i++) {
            backtrack(nums, i + 1, currentOR | nums[i], maxOR, count);
        }
    }
}
