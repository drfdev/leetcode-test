package dev.drf.leetcode.longest.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeProblemTest {
    private final LongestPalindromeProblem problem = new LongestPalindromeProblem();

    @Test
    void example1() {
        /*
        Input: s = "abccccdd"
        Output: 7
         */
        var s = "abccccdd";

        var out = problem.longestPalindrome(s);

        assertEquals(7, out);
    }

    @Test
    void example2() {
        /*
        Input: s = "a"
        Output: 1
         */
        var s = "a";

        var out = problem.longestPalindrome(s);

        assertEquals(1, out);
    }
}
