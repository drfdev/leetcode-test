package dev.drf.leetcode.number.of.good.pairs;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/number-of-good-pairs/
 * Solution tips are used
 */
public class NumberOfGoodPairsProblem implements Problem {
    public int numIdenticalPairs(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        int result = 0;
        for (int c : count) {
            if (c > 1) {
                result += (c * (c - 1)) / 2;
            }
        }

        return result;
    }
}
