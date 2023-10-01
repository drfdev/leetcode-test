package dev.drf.leetcode.reverse.words.in.a.string.iii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInAStringIIIProblem implements Problem {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            var reversed = reverse(word);
            sb.append(reversed);
        }

        return sb.toString();
    }

    private char[] reverse(String word) {
        final int size = word.length();
        char[] buff = new char[size];

        for (int i = 0; i < size; i++) {
            char ch = word.charAt(i);
            buff[size - i - 1] = ch;
        }

        return buff;
    }
}
