package dev.drf.leetcode.word.pattern;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/word-pattern/
 */
public class WordPatternProblem implements Problem {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> keep = new HashMap<>();

        int pIndex = 0;
        char[] sChars = s.toCharArray();

        int wordStart = 0;
        int wordEnd = 0;
        boolean waitForNextWord = true;

        for (int i = 0; i < sChars.length; i++) {
            char ch = sChars[i];

            if (ch == ' ') {
                if (waitForNextWord) {
                    continue;
                } else {
                    if (pIndex >= pattern.length()) {
                        return false;
                    }
                    char pChar = pattern.charAt(pIndex);
                    String str = keep.get(pChar);

                    String word = s.substring(wordStart, wordEnd);
                    if (str == null) {
                        if (keep.containsValue(word)) {
                            return false;
                        }
                        keep.put(pChar, word);
                    } else {
                        if (!str.equals(word)) {
                            return false;
                        }
                    }
                    waitForNextWord = true;
                    pIndex++;
                }
            } else {
                if (waitForNextWord) {
                    waitForNextWord = false;
                    wordStart = i;
                    wordEnd = i;
                }
                wordEnd++;
            }
        }

        // last step:
        if (pIndex >= pattern.length()) {
            return false;
        }
        char pChar = pattern.charAt(pIndex);
        String str = keep.get(pChar);

        String word = s.substring(wordStart, wordEnd);
        if (str != null) {
            if (!str.equals(word)) {
                return false;
            }
        } else {
            if (keep.containsValue(word)) {
                return false;
            }
        }

        pIndex++;

        return pIndex == pattern.length();
    }
}
