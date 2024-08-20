package dev.drf.leetcode.remove.outermost.parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveOutermostParenthesesProblemTest {
    private final RemoveOutermostParenthesesProblem problem = new RemoveOutermostParenthesesProblem();

    @Test
    void example1() {
        /*
        Input: s = "(()())(())"
        Output: "()()()"
         */
        var s = "(()())(())";

        var o = problem.removeOuterParentheses(s);

        assertEquals("()()()", o);
    }

    @Test
    void example2() {
        /*
        Input: s = "(()())(())(()(()))"
        Output: "()()()()(())"
         */
        var s = "(()())(())(()(()))";

        var o = problem.removeOuterParentheses(s);

        assertEquals("()()()()(())", o);
    }

    @Test
    void example3() {
        /*
        Input: s = "()()"
        Output: ""
         */
        var s = "()()";

        var o = problem.removeOuterParentheses(s);

        assertEquals("", o);
    }
}
