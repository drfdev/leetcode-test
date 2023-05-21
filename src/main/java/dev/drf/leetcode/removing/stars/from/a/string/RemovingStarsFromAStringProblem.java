package dev.drf.leetcode.removing.stars.from.a.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/removing-stars-from-a-string/
 */
public class RemovingStarsFromAStringProblem implements Problem {
    private static final char STAR = '*';

    public String removeStars(String s) {
        if (s == null) {
            return null;
        }

        char[] chars = s.toCharArray();
        char[] buff = new char[chars.length];

        int cursor = 0;

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (ch == STAR) {
                if (cursor > 0) {
                    cursor--;
                }
            } else {
                buff[cursor] = ch;
                cursor++;
            }
        }

        if (cursor < buff.length) {
            char[] fixedLengthBuff = new char[cursor];
            System.arraycopy(buff, 0, fixedLengthBuff, 0, cursor);
            buff = fixedLengthBuff;
        }

        return new String(buff);
    }
}
