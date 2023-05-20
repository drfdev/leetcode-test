package dev.drf.leetcode.is.subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsSubsequenceProblemTest {
    private final IsSubsequenceProblem problem = new IsSubsequenceProblem();

    @Test
    void example1() {
        /*
        Input: s = "abc", t = "ahbgdc"
        Output: true
         */
        String s = "abc", t = "ahbgdc";

        var flag = problem.isSubsequence(s, t);

        assertTrue(flag);
    }

    @Test
    void example2() {
        /*
        Input: s = "axc", t = "ahbgdc"
        Output: false
         */
        String s = "axc", t = "ahbgdc";

        var flag = problem.isSubsequence(s, t);

        assertFalse(flag);
    }

    @Test
    void myTest1() {
        String s = "ace", t = "abcde";

        var flag = problem.isSubsequence(s, t);

        assertTrue(flag);
    }

    @Test
    void myTest2() {
        String s = "aec", t = "abcde";

        var flag = problem.isSubsequence(s, t);

        assertFalse(flag);
    }
}
