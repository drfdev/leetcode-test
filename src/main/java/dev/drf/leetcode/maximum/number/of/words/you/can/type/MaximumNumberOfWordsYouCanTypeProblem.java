package dev.drf.leetcode.maximum.number.of.words.you.can.type;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-number-of-words-you-can-type/
 */
public class MaximumNumberOfWordsYouCanTypeProblem implements Problem {
    public int canBeTypedWords(String text, String brokenLetters) {
        final int[] dictionary = new int[26]; // 1 = broken

        for (char brok : brokenLetters.toCharArray()) {
            dictionary[brok - 'a'] = 1;
        }

        int counter = 0;
        boolean brokenWord = false;

        final var chars = text.toCharArray();
        for (char ch : chars) {
            if (ch == ' ') {
                if (!brokenWord) {
                    counter++;
                }
                brokenWord = false;
            } else {
                final int index = ch - 'a';
                if (dictionary[index] == 1) {
                    brokenWord = true;
                }
            }
        }

        if (!brokenWord) {
            counter++;
        }

        return counter;
    }
}
