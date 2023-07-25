package dev.drf.leetcode.length.of.last.word;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWordProblem implements Problem {
    public int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }

        char[] chars = s.toCharArray();
        int start = -1;
        int end = -1;
        for (int i = chars.length - 1; i >= 0; i--) {
            char ch = chars[i];
            if (ch == ' ') {
                if (start != -1) {
                    end = i;
                    break;
                }
            } else {
                if (start == -1) {
                    start = i;
                }
            }
        }

        if (end == -1) {
            return start + 1;
        }

        return Math.abs(end - start);
    }
}
