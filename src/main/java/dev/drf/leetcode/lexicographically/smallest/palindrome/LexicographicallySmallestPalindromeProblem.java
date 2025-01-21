package dev.drf.leetcode.lexicographically.smallest.palindrome;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/lexicographically-smallest-palindrome/
 */
public class LexicographicallySmallestPalindromeProblem implements Problem {
    public String makeSmallestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        final int len = s.length();
        final char[] chars = s.toCharArray();
        final char[] polys = new char[len];

        int leftIndex = 0;
        int rightIndex = len - 1;

        while (leftIndex <= rightIndex) {
            char left = chars[leftIndex];
            char right = chars[rightIndex];

            if (left != right) {
                final int diff = left - right;
                // IF left > right THEN diff > 0
                final char minChar = diff > 0 ? right : left;
                polys[leftIndex] = minChar;
                polys[rightIndex] = minChar;
            } else {
                polys[leftIndex] = left;
                polys[rightIndex] = left;
            }

            leftIndex++;
            rightIndex--;
        }

        return new String(polys);
    }
}
