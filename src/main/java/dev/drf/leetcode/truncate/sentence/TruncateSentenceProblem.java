package dev.drf.leetcode.truncate.sentence;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/truncate-sentence
 */
public class TruncateSentenceProblem implements Problem {
    public String truncateSentence(String s, int k) {
        if (k <= 0 || s.isEmpty()) {
            return "";
        }

        final char SPACE = ' ';
        final char[] chars = s.toCharArray();

        int len = 0;
        int wordCount = 0;
        boolean breaked = false;

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (ch == SPACE) {
                wordCount++;
                len = i;
                if (wordCount == k) {
                    breaked = true;
                    break;
                }
            }
        }

        if (!breaked) {
            return s;
        }
        return s.substring(0, len);
    }
}
