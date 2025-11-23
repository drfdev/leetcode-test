package dev.drf.leetcode.to.lower._case;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/to-lower-case/
 */
public class ToLowerCaseProblem implements Problem {
    public String toLowerCase(String s) {
        // `s` consists of printable ASCII characters
        final int minCharCode = 'A';
        final int maxCharCode = 'Z';

        var chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int charIndex = ch;
            if (charIndex >= minCharCode && charIndex <= maxCharCode) {
                int diff = ch - 'A';
                char newChar = (char) ('a' + diff);
                chars[i] = newChar;
            }
        }

        return new String(chars);
    }

}
