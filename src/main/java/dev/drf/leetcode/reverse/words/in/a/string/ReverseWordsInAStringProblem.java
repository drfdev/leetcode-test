package dev.drf.leetcode.reverse.words.in.a.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class ReverseWordsInAStringProblem implements Problem {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }

        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];

        final int length = chars.length - 1;
        final char space = ' ';

        int cursor = length, start = 0;
        for (int i = length; i >= 0; i--) {
            char chi = chars[i];

            if (chi == space) {
                if (cursor - i > 0) {
                    if (start != 0) {
                        result[start] = space;
                        start++;
                    }
                    int len = cursor - i;
                    System.arraycopy(chars, i + 1, result, start, len);

                    start = start + len;
                }

                cursor = i - 1;
            }
        }

        if (cursor > -1) {
            if (start != 0) {
                result[start] = space;
                start++;
            }
            int len = cursor + 1;
            System.arraycopy(chars, 0, result, start, len);
            start = start + len;
        }

        if (start < result.length) {
            char[] reduced = new char[start];
            System.arraycopy(result, 0, reduced, 0, start);

            return new String(reduced);
        }

        return new String(result);
    }
}
