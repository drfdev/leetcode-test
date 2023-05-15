package dev.drf.leetcode.valid.palindrome;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindromeProblem implements Problem {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String clearString = s.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
        if (s.length() == 0) {
            return true;
        }

        char[] chars = clearString.toCharArray();

        int size = chars.length;
        int halfSize = size / 2;

        for (int i = 0; i < halfSize; i++) {
            int leftIndex = i;
            int rightIndex = size - i - 1;

            if (chars[leftIndex] != chars[rightIndex]) {
                return false;
            }
        }

        return true;
    }
}
