package dev.drf.leetcode.permutation.in.string;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/permutation-in-string/
 */
@Deprecated
public class PermutationInStringProblem implements Problem {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() == 0 && s2.length() > 0) {
            return true;
        }

        final int size1 = s1.length();
        final int size2 = s2.length();

        if (size1 > size2) {
            return false;
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        int[] permutation = new int[26];

        for (int i = 0; i < size1; i++) {
            char ch = chars1[i];
            int index = ch - 'a';

            permutation[index]++;
        }

        int[] checker = new int[26];

        int first = 0;
        int count = 0;

        for (int i = 0; i < size2; i++) {
            char ch = chars2[i];
            int index = ch - 'a';

            int charCount = permutation[index];
            if (charCount == 0) {
                Arrays.fill(checker, 0);
                count = 0;
            } else {
                checker[index]++;
                count++;

                if (charCount < checker[index]) {
                    int startIndex = chars2[first] - 'a';
                    checker[startIndex]--;

                    first++;
                    int firstIndex = chars2[first] - 'a';
                    while (permutation[firstIndex] == 0) {
                        first++;
                        firstIndex = chars2[first] - 'a';
                    }
                    count--;
                }

                if (count == size1) {
                    return true;
                }
            }
        }

        return count == size1;
    }
}
