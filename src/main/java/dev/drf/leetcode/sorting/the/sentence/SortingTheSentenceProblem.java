package dev.drf.leetcode.sorting.the.sentence;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sorting-the-sentence/
 */
public class SortingTheSentenceProblem implements Problem {
    public String sortSentence(String s) {
        final String[] words = s.split(" ");
        final String[] wordsArray = new String[words.length];
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int index = (word.charAt(word.length() - 1) - '1');
            wordsArray[index] = word;
        }

        boolean first = true;
        for (String word : wordsArray) {
            if (!first) {
                sb.append(" ");
            }
            sb.append(word);
            sb.deleteCharAt(sb.length() - 1);
            first = false;
        }
        return sb.toString();
    }
}
