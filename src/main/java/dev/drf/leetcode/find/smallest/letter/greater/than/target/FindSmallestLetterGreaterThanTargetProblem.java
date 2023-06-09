package dev.drf.leetcode.find.smallest.letter.greater.than.target;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
public class FindSmallestLetterGreaterThanTargetProblem implements Problem {
    public char nextGreatestLetter(char[] letters, char target) {
        char result = letters[0];
        int index = Integer.MAX_VALUE;

        for (int i = 0; i < letters.length; i++) {
            char ichar = letters[i];

            int calculated = calculateIndex(ichar, target);
            if (calculated > 0) {
                if (index > calculated) {
                    index = calculated;
                    result = ichar;
                }
            }
        }

        return result;
    }

    private int calculateIndex(char current, char target) {
        return current - target;
    }
}
