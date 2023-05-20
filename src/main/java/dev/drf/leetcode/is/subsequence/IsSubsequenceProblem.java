package dev.drf.leetcode.is.subsequence;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/is-subsequence/
 */
public class IsSubsequenceProblem implements Problem {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        if (s.isEmpty()) {
            return true;
        }

        int index = 0;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (int i = 0; i < tChars.length; i++) {
            char ch = tChars[i];

            if (sChars[index] == ch) {
                index++;
                if (index == sChars.length) {
                    return true;
                }
            }
        }

        return index == sChars.length;
    }
}
