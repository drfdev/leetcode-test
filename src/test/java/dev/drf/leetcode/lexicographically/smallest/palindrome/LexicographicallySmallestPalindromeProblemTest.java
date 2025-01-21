package dev.drf.leetcode.lexicographically.smallest.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LexicographicallySmallestPalindromeProblemTest {
    private final LexicographicallySmallestPalindromeProblem problem = new LexicographicallySmallestPalindromeProblem();

    @Test
    void example1() {
        /*
        Input: s = "egcfe"
        Output: "efcfe"
         */
        var s = "egcfe";

        var p = problem.makeSmallestPalindrome(s);

        assertEquals("efcfe", p);
    }

    @Test
    void example2() {
        /*
        Input: s = "abcd"
        Output: "abba"
         */
        var s = "abcd";

        var p = problem.makeSmallestPalindrome(s);

        assertEquals("abba", p);
    }

    @Test
    void example3() {
        /*
        Input: s = "seven"
        Output: "neven"
         */
        var s = "seven";

        var p = problem.makeSmallestPalindrome(s);

        assertEquals("neven", p);
    }
}
