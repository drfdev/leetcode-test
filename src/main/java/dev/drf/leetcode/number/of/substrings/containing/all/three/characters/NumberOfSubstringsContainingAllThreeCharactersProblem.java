package dev.drf.leetcode.number.of.substrings.containing.all.three.characters;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
 * Used solution:
 * https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/solutions/516977/java-c-python-easy-and-concise/
 */
public class NumberOfSubstringsContainingAllThreeCharactersProblem implements Problem {
    public int numberOfSubstrings(String s) {
        if (s == null || s.length() < 3) {
            return 0;
        }
        final char[] chars = s.toCharArray();
        final int[] checker = new int[3];

        int subStringCount = 0;
        final int size = chars.length;

        int index = 0;
        for (int i = 0; i < size; i++) {
            addChar(checker, chars[i]);
            while (isCorrect(checker)) {
                removeChar(checker, chars[index++]);
            }
            subStringCount += index;
        }

        return subStringCount;
    }

    private void addChar(int[] checker, char ch) {
        final int index = (ch - 'a');
        checker[index]++;
    }

    private void removeChar(int[] checker, char ch) {
        final int index = (ch - 'a');
        checker[index]--;
    }

    private boolean isCorrect(int[] checker) {
        return checker[0] > 0
                && checker[1] > 0
                && checker[2] > 0;
    }
}
