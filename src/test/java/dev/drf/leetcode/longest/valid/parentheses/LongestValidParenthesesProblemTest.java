package dev.drf.leetcode.longest.valid.parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestValidParenthesesProblemTest {
    private final LongestValidParenthesesProblem problem = new LongestValidParenthesesProblem();

    @Test
    void example1() {
        /*
        Input: s = "(()"
        Output: 2
         */
        String s = "(()";

        var count = problem.longestValidParentheses(s);

        assertEquals(2, count);
    }

    @Test
    void example2() {
        /*
        Input: s = ")()())"
        Output: 4
         */
        String s = ")()())";

        var count = problem.longestValidParentheses(s);

        assertEquals(4, count);
    }

    @Test
    void example3() {
        /*
        Input: s = ""
        Output: 0
         */
        String s = "";

        var count = problem.longestValidParentheses(s);

        assertEquals(0, count);
    }
}
