package dev.drf.leetcode.maximum.nesting.depth.of.the.parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNestingDepthOfTheParenthesesProblemTest {
    private final MaximumNestingDepthOfTheParenthesesProblem problem = new MaximumNestingDepthOfTheParenthesesProblem();

    @Test
    void example1() {
        /*
        Input: s = "(1+(2*3)+((8)/4))+1"
        Output: 3
         */
        var s = "(1+(2*3)+((8)/4))+1";

        var out = problem.maxDepth(s);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        /*
        Input: s = "(1)+((2))+(((3)))"
        Output: 3
         */
        var s = "(1)+((2))+(((3)))";

        var out = problem.maxDepth(s);

        assertEquals(3, out);
    }

    @Test
    void example3() {
        /*
        Input: s = "()(())((()()))"
        Output: 3
         */
        var s = "()(())((()()))";

        var out = problem.maxDepth(s);

        assertEquals(3, out);
    }
}
