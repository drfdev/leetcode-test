package dev.drf.leetcode.determine_if.two.strings.are.close;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/determine-if-two-strings-are-close/
 * Used solution:
 * https://leetcode.com/problems/determine-if-two-strings-are-close/solutions/935917/java-o-n-solution/
 */
public class DetermineIfTwoStringsAreCloseProblem implements Problem {
    private static final int ENGLISH_LETTERS_COUNT = 26;
    private static final char FIRST_ENGLISH_LETTER = 'a';

    public boolean closeStrings(String word1, String word2) {
        int[] arr1 = new int[ENGLISH_LETTERS_COUNT];
        int[] arr2 = new int[ENGLISH_LETTERS_COUNT];

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        for (char ch : chars1) {
            int index = ch - FIRST_ENGLISH_LETTER;
            arr1[index]++;
        }
        for (char ch : chars2) {
            int index = ch - FIRST_ENGLISH_LETTER;
            arr2[index]++;
        }

        for (int i = 0; i < ENGLISH_LETTERS_COUNT; i++) {
            if (arr1[i] == arr2[i]) {
                continue;
            }
            if (arr1[i] == 0 || arr2[i] == 0) {
                return false;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < ENGLISH_LETTERS_COUNT; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
