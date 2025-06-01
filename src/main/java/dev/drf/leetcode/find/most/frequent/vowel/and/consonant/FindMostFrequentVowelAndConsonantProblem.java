package dev.drf.leetcode.find.most.frequent.vowel.and.consonant;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/
 */
public class FindMostFrequentVowelAndConsonantProblem implements Problem {
    public int maxFreqSum(String s) {
        final int aIdx = 0;
        final int eIdx = 4;
        final int iIdx = 8;
        final int oIdx = 14;
        final int uIdx = 20;

        final int[] sum = new int[26];

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int index = ch - 'a';
            sum[index]++;
        }

        int vowelMax = 0;
        int consonantMax = 0;

        for (int i = 0; i < 26; i++) {
            int value = sum[i];
            if (i == aIdx || i == eIdx
                    || i == iIdx || i == oIdx
                    || i == uIdx) {
                vowelMax = Math.max(vowelMax, value);
            } else {
                consonantMax = Math.max(consonantMax, value);
            }
        }

        return vowelMax + consonantMax;
    }
}
