package dev.drf.leetcode.check.if_a.string.is.an.acronym.of.words;

import dev.drf.leetcode.Problem;

import java.util.List;

/**
 * https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
 */
public class CheckIfAStringIsAnAcronymOfWordsProblem implements Problem {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }

        for (int i = 0; i < words.size(); i++) {
            final char ch = words.get(i).charAt(0);
            final char acronymChar = s.charAt(i);

            if (ch != acronymChar) {
                return false;
            }
        }

        return true;
    }
}
