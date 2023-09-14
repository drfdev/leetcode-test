package dev.drf.leetcode.palindromic.substrings;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/palindromic-substrings/
 * Used solution:
 * https://www.youtube.com/watch?v=4RACzI5-du8
 */
public class PalindromicSubstringsProblem implements Problem {
    public int countSubstrings(String s) {
        if (s == null) {
            return 0;
        }

        final int len = s.length();
        if (len < 2) {
            return len;
        }

        int result = 0;
        for (int i = 0; i < len; i++) {
            // Odd Length
            int left = i;
            int right = i;
            while (left >= 0
                    && right < len
                    && s.charAt(left) == s.charAt(right)) {
                result++;
                left--;
                right++;
            }

            // Even Length
            left = i;
            right = i + 1;
            while (left >= 0
                    && right < len
                    && s.charAt(left) == s.charAt(right)) {
                result++;
                left--;
                right++;
            }
        }

        return result;
    }
}
