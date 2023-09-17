package dev.drf.leetcode.interleaving.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterleavingStringProblemTest {
    private final InterleavingStringProblem problem = new InterleavingStringProblem();

    @Test
    void example1() {
        /*
        Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
        Output: true
         */
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";

        var correct = problem.isInterleave(s1, s2, s3);

        assertTrue(correct);
    }

    @Test
    void example2() {
        /*
        Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
        Output: false
         */
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";

        var correct = problem.isInterleave(s1, s2, s3);

        assertFalse(correct);
    }

    @Test
    void example3() {
        /*
        Input: s1 = "", s2 = "", s3 = ""
        Output: true
         */
        String s1 = "", s2 = "", s3 = "";

        var correct = problem.isInterleave(s1, s2, s3);

        assertTrue(correct);
    }
}
