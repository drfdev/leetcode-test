package dev.drf.leetcode.longest.common.subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequenceProblemTest {
    private final LongestCommonSubsequenceProblem2 problem = new LongestCommonSubsequenceProblem2();

    @Test
    void example1() {
        /*
        Input: text1 = "abcde", text2 = "ace"
        Output: 3
         */
        String text1 = "abcde", text2 = "ace";

        var count = problem.longestCommonSubsequence(text1, text2);

        assertEquals(3, count);
    }

    @Test
    void example2() {
        /*
        Input: text1 = "abc", text2 = "abc"
        Output: 3
         */
        String text1 = "abc", text2 = "abc";

        var count = problem.longestCommonSubsequence(text1, text2);

        assertEquals(3, count);
    }

    @Test
    void example3() {
        /*
        Input: text1 = "abc", text2 = "def"
        Output: 0
         */
        String text1 = "abc", text2 = "def";

        var count = problem.longestCommonSubsequence(text1, text2);

        assertEquals(0, count);
    }

    @Test
    void failed1() {
        // "bl"
        // "yby"
        String text1 = "bl", text2 = "yby";

        var count = problem.longestCommonSubsequence(text1, text2);

        assertEquals(1, count);
    }

    @Test
    void failed2() {
        // "psnw"
        // "vozsh"
        String text1 = "psnw", text2 = "vozsh";

        var count = problem.longestCommonSubsequence(text1, text2);

        assertEquals(1, count);
    }

    @Test
    void failed3() {
        // "oxcpqrsvwf"
        // "shmtulqrypy"
        String text1 = "oxcpqrsvwf", text2 = "shmtulqrypy";

        var count = problem.longestCommonSubsequence(text1, text2);

        assertEquals(2, count);
    }
}
