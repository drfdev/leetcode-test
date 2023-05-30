package dev.drf.leetcode.generate.parentheses;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class GenerateParenthesesProblemTest {
    private final GenerateParenthesesProblem problem = new GenerateParenthesesProblem();

    @Test
    void example1() {
        /*
        Input: n = 3
        Output: ["((()))","(()())","(())()","()(())","()()()"]
         */
        int n = 3;

        var list = problem.generateParenthesis(n);

        assertThat(list, containsInAnyOrder(
                "((()))", "(()())", "(())()", "()(())", "()()()"
        ));
    }

    @Test
    void example2() {
        /*
        Input: n = 1
        Output: ["()"]
         */
        int n = 1;

        var list = problem.generateParenthesis(n);

        assertThat(list, containsInAnyOrder(
                "()"
        ));
    }

    @Test
    void myTest1() {
        /*
        Input: n = 2
         */
        int n = 2;

        var list = problem.generateParenthesis(n);

        assertThat(list, containsInAnyOrder(
                "()()", "(())"
        ));
    }
}
