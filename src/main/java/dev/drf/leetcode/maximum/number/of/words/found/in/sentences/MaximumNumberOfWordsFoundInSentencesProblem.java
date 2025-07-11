package dev.drf.leetcode.maximum.number.of.words.found.in.sentences;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */
public class MaximumNumberOfWordsFoundInSentencesProblem implements Problem {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        int sentenceWords = 0;

        for (String sentence : sentences) {
            char[] chars = sentence.toCharArray();
            sentenceWords = 0;
            for (char ch : chars) {
                if (ch == ' ') {
                    sentenceWords++;
                }
            }
            sentenceWords++;

            maxWords = Math.max(sentenceWords, maxWords);
        }

        return maxWords;
    }
}
