package dev.drf.leetcode.reverse.string.prefix;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-string-prefix/
 */
public class ReverseStringPrefixProblem implements Problem {
    public String reversePrefix(String s, int k) {
        if (k < 2) {
            return s;
        }

        var chars = s.toCharArray();

        final int steps = k / 2;
        for (int i = 0; i < steps; i++) {
            int j = k - i - 1;
            char ch = chars[i];
            chars[i] = chars[j];
            chars[j] = ch;
        }

        return new String(chars);
    }
}
