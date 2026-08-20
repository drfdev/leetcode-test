package dev.drf.leetcode.check.balanced.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/check-balanced-string/
 */
public class CheckBalancedStringProblem implements Problem {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;

        final char[] chars = num.toCharArray();
        boolean even = false;
        for (int i = 0; i < chars.length; i++) {
            int ch = chars[i] - '0';
            if (even) {
                evenSum += ch;
            } else {
                oddSum += ch;
            }

            even = !even;
        }

        return evenSum == oddSum;
    }
}
