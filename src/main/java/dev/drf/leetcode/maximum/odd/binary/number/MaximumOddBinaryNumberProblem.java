package dev.drf.leetcode.maximum.odd.binary.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-odd-binary-number/
 */
public class MaximumOddBinaryNumberProblem implements Problem {
    public String maximumOddBinaryNumber(String s) {
        int one = 0;

        final char[] chars = s.toCharArray();
        final int length = s.length();

        for (char ch : chars) {
            if (ch == '1') {
                one++;
            }
        }

        StringBuilder sb = new StringBuilder();
        one--;
        for (int i = 0; i < length - 1; i++) {
            if (one > 0) {
                sb.append('1');
                one--;
            } else {
                sb.append('0');
            }
        }
        sb.append('1');

        return sb.toString();
    }
}
