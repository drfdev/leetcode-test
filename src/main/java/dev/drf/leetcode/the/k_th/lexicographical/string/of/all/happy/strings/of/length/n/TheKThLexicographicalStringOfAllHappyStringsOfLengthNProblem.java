package dev.drf.leetcode.the.k_th.lexicographical.string.of.all.happy.strings.of.length.n;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/
 */
public class TheKThLexicographicalStringOfAllHappyStringsOfLengthNProblem implements Problem {
    private static final char[] CHARS = {'a', 'b', 'c'};

    public String getHappyString(int n, int k) {
        String result = "";

        char[] happyString = generateMinHappyString(n);
        int index = 1;

        while (index < k) {
            boolean incremented = incrementHappyString(happyString, n);
            if (!incremented) {
                break;
            }
            index++;
        }
        if (index == k) {
            result = new String(happyString);
        }

        return result;
    }

    private char[] generateMinHappyString(int n) {
        char[] buff = new char[n];
        updateMinHappySubSet(buff, 0, n);
        return buff;
    }

    private boolean incrementHappyString(char[] string,
                                         int n) {
        int index = n - 1;
        int updateIndex = -1;
        while (index >= 0) {
            char current = string[index];
            int nextIndex = (current - 'a') + 1;

            if (nextIndex > 2) {
                updateIndex = index;
                index--;
                continue;
            }

            if (index > 0) {
                char prChar = string[index - 1];
                int prIndex = (prChar - 'a');

                if (prIndex == nextIndex) {
                    nextIndex++;
                }
            }

            if (nextIndex > 2) {
                updateIndex = index;
                index--;
                continue;
            }

            string[index] = CHARS[nextIndex];
            break;
        }
        if (updateIndex == 0) {
            return false;
        }
        if (updateIndex > 0) {
            updateMinHappySubSet(string, updateIndex, n);
        }
        return true;
    }

    private void updateMinHappySubSet(char[] buff,
                                      int index,
                                      int n) {
        char ch = index == 0 ? 'b' : buff[index - 1];
        for (int i = index; i < n; i++) {
            if (ch == 'a') {
                ch = 'b';
            } else {
                ch = 'a';
            }
            buff[i] = ch;
        }
    }
}
