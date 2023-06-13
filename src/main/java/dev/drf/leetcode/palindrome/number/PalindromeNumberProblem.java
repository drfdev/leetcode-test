package dev.drf.leetcode.palindrome.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumberProblem implements Problem {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }

        String value = String.valueOf(x);

        return isStringPalindrome(value);
    }

    private boolean isStringPalindrome(String value) {
        final int size = value.length();
        final int halfSize = size / 2;

        for (int i = 0; i <= halfSize; i++) {
            int leftIndex = i;
            int rightIndex = size - i - 1;

            if (leftIndex != rightIndex
                    && value.charAt(leftIndex) != value.charAt(rightIndex)) {
                return false;
            }
        }
        return true;
    }
}
