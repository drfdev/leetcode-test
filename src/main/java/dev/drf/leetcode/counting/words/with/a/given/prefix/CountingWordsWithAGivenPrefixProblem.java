package dev.drf.leetcode.counting.words.with.a.given.prefix;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/counting-words-with-a-given-prefix/
 */
public class CountingWordsWithAGivenPrefixProblem implements Problem {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
