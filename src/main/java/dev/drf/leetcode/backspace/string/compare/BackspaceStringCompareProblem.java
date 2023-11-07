package dev.drf.leetcode.backspace.string.compare;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 */
@Deprecated
public class BackspaceStringCompareProblem implements Problem {
    private static final char BACKSPACE_CHAR = '#';

    public boolean backspaceCompare(String s, String t) {
        final char[] sChars = s.toCharArray();
        final char[] tChars = t.toCharArray();

        int sIndex = sChars.length - 1;
        int tIndex = tChars.length - 1;

        while (sIndex > -1 && tIndex > -1) {
            char sChar = sChars[sIndex];
            char tChar = tChars[tIndex];
            boolean backspace = false;

            if (sChar == BACKSPACE_CHAR) {
                backspace = true;
                int count = 0;
                while (sChar == BACKSPACE_CHAR) {
                    sIndex--;
                    count++;
                    sChar = sChars[sIndex];
                }
                sIndex = sIndex - count;
            }
            if (tChar == BACKSPACE_CHAR) {
                backspace = true;
                int count = 0;
                while (tChar == BACKSPACE_CHAR) {
                    tIndex--;
                    count++;
                    tChar = tChars[tIndex];
                }
                tIndex = tIndex - count;
            }

            if (backspace) {
                continue;
            }

            if (sChar != tChar) {
                return false;
            }
            sIndex--;
            tIndex--;
        }

        while (sIndex > -1) {
            char sChar = sChars[sIndex];
            if (sChar == BACKSPACE_CHAR) {
                int count = 0;
                while (sIndex > -1 && sChar == BACKSPACE_CHAR) {
                    sIndex--;
                    count++;
                    sChar = sChars[sIndex];
                }
                sIndex = sIndex - count;
            } else {
                return false;
            }
        }
        while (tIndex > -1) {
            char tChar = tChars[tIndex];
            if (tChar == BACKSPACE_CHAR) {
                int count = 0;
                while (tIndex > -1 && tChar == BACKSPACE_CHAR) {
                    tIndex--;
                    count++;
                    tChar = tChars[tIndex];
                }
                tIndex = tIndex - count;
            }
        }

        return true;
    }
}
