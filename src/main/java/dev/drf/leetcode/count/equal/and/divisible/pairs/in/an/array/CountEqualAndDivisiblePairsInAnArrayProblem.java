package dev.drf.leetcode.count.equal.and.divisible.pairs.in.an.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
 */
public class CountEqualAndDivisiblePairsInAnArrayProblem implements Problem {
    public int countPairs(int[] nums, int k) {
        /*
        return the number of pairs (i, j)
        where 0 <= i < j < n, such that nums[i] == nums[j]
        and (i * j) is divisible by k
         */
        final int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            final int value1 = nums[i];
            for (int j = (i + 1); j < n; j++) {
                final int value2 = nums[j];
                if (value1 == value2) {
                    int val = i * j;
                    if (val % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
