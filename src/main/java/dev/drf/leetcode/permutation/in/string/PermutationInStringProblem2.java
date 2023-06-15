package dev.drf.leetcode.permutation.in.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/permutation-in-string/
 * Used solution:
 * https://leetcode.com/problems/permutation-in-string/solutions/102588/java-solution-sliding-window/
 */
public class PermutationInStringProblem2 implements Problem {
    private static final int ENGLISH_ABC_COUNT = 26;

    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return false;
        }

        int[] count = new int[ENGLISH_ABC_COUNT];

        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        if (allZero(count)) {
            return true;
        }

        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count)) {
                return true;
            }
        }

        return false;
    }

    private boolean allZero(int[] count) {
        for (int i = 0; i < ENGLISH_ABC_COUNT; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
