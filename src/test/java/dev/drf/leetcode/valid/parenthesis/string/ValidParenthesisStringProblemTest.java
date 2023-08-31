package dev.drf.leetcode.valid.parenthesis.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesisStringProblemTest {
    private final ValidParenthesisStringProblem problem = new ValidParenthesisStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "()"
        Output: true
         */
        String s = "()";

        var valid = problem.checkValidString(s);

        assertTrue(valid);
    }

    @Test
    void example2() {
        /*
        Input: s = "(*)"
        Output: true
         */
        String s = "(*)";

        var valid = problem.checkValidString(s);

        assertTrue(valid);
    }

    @Test
    void example3() {
        /*
        Input: s = "(*))"
        Output: true
         */
        String s = "(*))";

        var valid = problem.checkValidString(s);

        assertTrue(valid);
    }

    @Test
    void failed1() {
        // "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"
        String s = "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()";

        var valid = problem.checkValidString(s);

        assertTrue(valid);
    }
}
