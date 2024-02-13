package dev.drf.leetcode.find.first.palindromic.string.in.the.array;

/**
 * https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
 */
public class FindFirstPalindromicStringInTheArrayProblem {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        final int n = word.length();
        final int len = n / 2;
        for (int i = 0; i < len; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
