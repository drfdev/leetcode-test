package dev.drf.leetcode.maximum.number.of.vowels.in.a.substring.of.given.length;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLengthProblem implements Problem {
    public int maxVowels(String s, int k) {
        if (s == null || s.isEmpty() || k == 0) {
            return 0;
        }

        int vowels = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < k; i++) {
            char ch = chars[i];
            if (isVowel(ch)) {
                vowels++;
            }
        }

        int maxVowels = vowels;

        for (int i = k; i < chars.length; i++) {
            char pr = chars[i - k];
            char next = chars[i];

            if (isVowel(pr)) {
                vowels--;
            }
            if (isVowel(next)) {
                vowels++;
            }

            if (vowels > maxVowels) {
                maxVowels = vowels;
            }

            if (maxVowels == k) {
                return maxVowels;
            }
        }

        return maxVowels;
    }

    private boolean isVowel(char ch) {
        // Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
