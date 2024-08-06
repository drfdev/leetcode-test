package dev.drf.leetcode.reverse.prefix.of.word;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-prefix-of-word/
 */
public class ReversePrefixOfWordProblem implements Problem {

    public String reversePrefix(String word, char ch) {
        final var chars = word.toCharArray();
        final int len = chars.length;
        final int index = word.indexOf(ch);

        if (index < 0) {
            return word;
        }

        var sb = new StringBuilder();

        for (int i = index; i >= 0; i--) {
            char value = chars[i];
            sb.append(value);
        }

        for (int i = index + 1; i < len; i++) {
            char value = chars[i];
            sb.append(value);
        }

        return sb.toString();
    }
}
