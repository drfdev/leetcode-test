package dev.drf.leetcode.regular.expression.matching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegularExpressionMatchingProblemTest {
    private final RegularExpressionMatchingProblem problem = new RegularExpressionMatchingProblem();

    @Test
    void example1() {
        /*
        Input: s = "aa", p = "a"
        Output: false
         */
        String s = "aa", p = "a";

        var match = problem.isMatch(s, p);

        assertFalse(match);
    }

    @Test
    void example2() {
        /*
        Input: s = "aa", p = "a*"
        Output: true
         */
        String s = "aa", p = "a*";

        var match = problem.isMatch(s, p);

        assertTrue(match);
    }

    @Test
    void example3() {
        /*
        Input: s = "ab", p = ".*"
        Output: true
         */
        String s = "ab", p = ".*";

        var match = problem.isMatch(s, p);

        assertTrue(match);
    }
}
