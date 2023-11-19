package dev.drf.leetcode.reverse.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseStringProblem implements Problem {
    public void reverseString(char[] s) {
        if (s == null) {
            return;
        }
        if (s.length < 2) {
            return;
        }

        final int max = s.length - 1;
        final int stepCount = s.length / 2;

        for (int i = 0; i < stepCount; i++) {
            int j = max - i;
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
        }
    }
}
