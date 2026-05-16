package dev.drf.leetcode.count.digit.appearances;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-digit-appearances/
 */
public class CountDigitAppearancesProblem implements Problem {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;

        for (int num : nums) {
            while (num > 0 && num >= digit) {
                int val = num % 10;
                if (val == digit) {
                    count++;
                }
                num = num / 10;
            }
        }

        return count;
    }
}
