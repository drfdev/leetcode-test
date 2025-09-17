package dev.drf.leetcode.check.if_two.string.arrays.are.equivalent;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 */
public class CheckIfTwoStringArraysAreEquivalentProblem implements Problem {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        final int word1Size = word1.length;
        final int word2Size = word2.length;

        int wordIndex1 = 0;
        int index1 = 0;
        int wordIndex2 = 0;
        int index2 = 0;

        while (wordIndex1 < word1Size
                && wordIndex2 < word2Size) {
            String w1 = word1[wordIndex1];
            String w2 = word2[wordIndex2];

            final int w1len = w1.length();
            final int w2len = w2.length();

            final char ch1 = w1.charAt(index1);
            final char ch2 = w2.charAt(index2);

            if (ch1 != ch2) {
                return false;
            }

            index1++;
            index2++;

            if (index1 >= w1len) {
                index1 = 0;
                wordIndex1++;
            }

            if (index2 >= w2len) {
                index2 = 0;
                wordIndex2++;
            }
        }

        return (wordIndex1 == word1Size)
                && (wordIndex2 == word2Size);
    }
}
