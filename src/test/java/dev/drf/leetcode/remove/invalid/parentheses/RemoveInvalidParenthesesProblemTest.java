package dev.drf.leetcode.remove.invalid.parentheses;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class RemoveInvalidParenthesesProblemTest {
    private final RemoveInvalidParenthesesProblem problem = new RemoveInvalidParenthesesProblem();

    @Test
    void example1() {
        /*
        Input: s = "()())()"
        Output: ["(())()","()()()"]
         */
        var s = "()())()";

        var list = problem.removeInvalidParentheses(s);

        assertThat(list, containsInAnyOrder(
                "(())()", "()()()"
        ));
    }

    @Test
    void example2() {
        /*
        Input: s = "(a)())()"
        Output: ["(a())()","(a)()()"]
         */
        var s = "(a)())()";

        var list = problem.removeInvalidParentheses(s);

        assertThat(list, containsInAnyOrder(
                "(a())()", "(a)()()"
        ));
    }

    @Test
    void example3() {
        /*
        Input: s = ")("
        Output: [""]
         */
        var s = ")(";

        var list = problem.removeInvalidParentheses(s);

        assertThat(list, containsInAnyOrder(
                ""
        ));
    }
}
