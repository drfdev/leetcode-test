package dev.drf.leetcode.string.to.integer.atoi;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
public class StringToIntegerAtoiProblem implements Problem {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        final char[] chars = s.toCharArray();
        long result = 0;
        boolean positive = true;

        boolean startState = true;

        for (char ch : chars) {
            if (ch == ' ') {
                if (!startState) {
                    break;
                }
            } else if (ch == '-') {
                if (startState) {
                    positive = false;
                    startState = false;
                } else {
                    break;
                }
            } else if (ch == '+') {
                if (startState) {
                    positive = true;
                    startState = false;
                } else {
                    break;
                }
            } else if (isNumber(ch)) {
                startState = false;
                int value = ch - '0';
                if (positive) {
                    result = (result * 10) + value;
                } else {
                    result = (result * 10) - value;
                }

                if (result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                } else if (result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            } else {
                break;
            }
        }

        return (int) result;
    }

    private boolean isNumber(char ch) {
        final int index = ch - '0';
        return index >= 0 && index < 10;
    }
}
