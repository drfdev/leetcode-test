package dev.drf.leetcode.find.the.number.of.good.pairs.i;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-the-number-of-good-pairs-i/
 */
public class FindTheNumberOfGoodPairsIProblem implements Problem {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;

        for (int num1 : nums1) {
            for (int num2 : nums2) {
                int div = num2 * k;
                if (num1 % div == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
