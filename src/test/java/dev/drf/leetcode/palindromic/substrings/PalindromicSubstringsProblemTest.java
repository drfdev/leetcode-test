package dev.drf.leetcode.palindromic.substrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicSubstringsProblemTest {
    private final PalindromicSubstringsProblem problem = new PalindromicSubstringsProblem();

    @Test
    void example1() {
        /*
        Input: s = "abc"
        Output: 3
         */
        String s = "abc";

        var count = problem.countSubstrings(s);

        assertEquals(3, count);
    }

    @Test
    void example2() {
        /*
        Input: s = "aaa"
        Output: 6
         */
        String s = "aaa";

        var count = problem.countSubstrings(s);

        assertEquals(6, count);
    }
}
