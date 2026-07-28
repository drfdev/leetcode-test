package dev.drf.leetcode.number.of.strings.that.appear.as.substrings.in.word;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
 */
public class NumberOfStringsThatAppearAsSubstringsInWordProblem implements Problem {
    public int numOfStrings(String[] patterns, String word) {
        var patternsMap = new HashMap<String, Boolean>();
        int counter = 0;

        for (String pattern : patterns) {
            if (patternsMap.containsKey(pattern)) {
                var result = patternsMap.get(pattern);
                if (result) {
                    counter++;
                }
            } else {
                boolean result = checkPatter(word, pattern);
                if (result) {
                    counter++;
                }
                patternsMap.put(pattern, result);
            }
        }

        return counter;
    }

    private boolean checkPatter(String word,
                                String pattern) {
        final int size = word.length();
        final int patternSize = pattern.length();
        final int iterateSize = (size - patternSize) + 1;

        boolean check = false;
        for (int i = 0; i < iterateSize; i++) {
            check = true;
            for (int j = 0; j < patternSize; j++) {
                final int index = j + i;
                if (word.charAt(index) != pattern.charAt(j)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                return true;
            }
        }

        return false;
    }
}
