package dev.drf.leetcode.check.if_the.sentence.is.pangram;

import dev.drf.leetcode.Problem;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */
public class CheckIfTheSentenceIsPangramProblem implements Problem {
    private static final int ENGLISH_LETTERS = 26;

    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < ENGLISH_LETTERS) {
            return false;
        }

        final var charSet = new HashSet<Character>(32);
        final var chars = sentence.toCharArray();

        for (char ch : chars) {
            if (!charSet.contains(ch)) {
                charSet.add(ch);
                if (charSet.size() == ENGLISH_LETTERS) {
                    return true;
                }
            }
        }

        return false;
    }
}
