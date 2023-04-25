package dev.drf.leetcode.valid.parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesProblemTest {
    private final ValidParenthesesProblem problem = new ValidParenthesesProblem();

    @Test
    void example1() {
        /*
        Input: s = "()"
        Output: true
         */
        String s = "()";

        var result = problem.isValid(s);

        assertTrue(result);
    }

    @Test
    void example2() {
        /*
        Input: s = "()[]{}"
        Output: true
         */
        String s = "()[]{}";

        var result = problem.isValid(s);

        assertTrue(result);
    }

    @Test
    void example3() {
        /*
        Input: s = "(]"
        Output: false
         */
        String s = "(]";

        var result = problem.isValid(s);

        assertFalse(result);
    }

    @Test
    void failed1() {
        String s = "([)]";

        var result = problem.isValid(s);

        assertFalse(result);
    }
}
