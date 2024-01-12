package dev.drf.leetcode.determine_if.string.halves.are.alike;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/
 */
public class DetermineIfStringHalvesAreAlikeProblem implements Problem {
    public boolean halvesAreAlike(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }

        final int size = s.length();
        final int halfSize = size / 2;

        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0; i < halfSize; i++) {
            char left = s.charAt(i);
            char right = s.charAt(halfSize + i);

            if (isVowel(left)) {
                leftCount++;
            }
            if (isVowel(right)) {
                rightCount++;
            }
        }

        return leftCount == rightCount;
    }

    private boolean isVowel(char ch) {
        return ch == 'a'
                || ch == 'e'
                || ch == 'i'
                || ch == 'o'
                || ch == 'u'
                || ch == 'A'
                || ch == 'E'
                || ch == 'I'
                || ch == 'O'
                || ch == 'U';
    }
}
