package dev.drf.leetcode.merge.strings.alternately;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/merge-strings-alternately/
 */
public class MergeStringsAlternatelyProblem implements Problem {
    public String mergeAlternately(String word1, String word2) {
        if (word1 == null && word2 == null) {
            return null;
        } else if (word1 == null) {
            return word2;
        } else if (word2 == null) {
            return word1;
        }

        int size = word1.length() + word2.length();
        char[] result = new char[size];

        int index1 = 0;
        int index2 = 0;
        boolean left = true;

        while (index1 < word1.length() || index2 < word2.length()) {
            int index = index1 + index2;
            char value;

            if (index1 < word1.length() && index2 < word2.length()) {
                // word1 + word2
                if (left) {
                    value = word1.charAt(index1);
                    index1++;
                    left = false;
                } else {
                    value = word2.charAt(index2);
                    index2++;
                    left = true;
                }
            } else if (index1 < word1.length()) {
                // word1 only
                value = word1.charAt(index1);
                index1++;
            } else {
                // word2 only
                value = word2.charAt(index2);
                index2++;
            }

            result[index] = value;
        }

        return new String(result);
    }
}
