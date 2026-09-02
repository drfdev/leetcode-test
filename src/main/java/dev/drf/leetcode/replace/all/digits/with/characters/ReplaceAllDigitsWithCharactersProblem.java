package dev.drf.leetcode.replace.all.digits.with.characters;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/replace-all-digits-with-characters/
 */
public class ReplaceAllDigitsWithCharactersProblem implements Problem {
    public String replaceDigits(String s) {
        final char[] chars = s.toCharArray();
        final char[] replaced = new char[chars.length];

        char prev = chars[0];
        for (int i = 0; i < chars.length; i++) {
            final boolean even = i % 2 == 0;
            final char ch = chars[i];
            if (even) {
                prev = ch;
                replaced[i] = ch;
            } else {
                int offset = ch - '0';
                replaced[i] = (char) (prev + offset);
            }
        }

        return new String(replaced);
    }
}
