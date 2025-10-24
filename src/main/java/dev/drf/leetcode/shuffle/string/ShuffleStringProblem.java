package dev.drf.leetcode.shuffle.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/shuffle-string/
 */
public class ShuffleStringProblem implements Problem {
    public String restoreString(String s, int[] indices) {
        final int len = indices.length;
        final char[] restored = new char[len];

        for (int i = 0; i < len; i++) {
            final int index = indices[i];
            final char ch = s.charAt(i);
            restored[index] = ch;
        }

        return new String(restored);
    }
}
