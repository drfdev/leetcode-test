package dev.drf.leetcode.different.ways.to.add.parentheses;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class DifferentWaysToAddParenthesesProblemTest {
    private final DifferentWaysToAddParenthesesProblem problem = new DifferentWaysToAddParenthesesProblem();

    @Test
    void example1() {
        // Input: expression = "2-1-1"
        // Output: [0,2]
        var expression = "2-1-1";

        var out = problem.diffWaysToCompute(expression);

        assertThat(out, containsInAnyOrder(
                0, 2
        ));
    }

    @Test
    void example2() {
        // Input: expression = "2*3-4*5"
        // Output: [-34,-14,-10,-10,10]
        var expression = "2*3-4*5";

        var out = problem.diffWaysToCompute(expression);

        assertThat(out, containsInAnyOrder(
                -34, -14, -10, -10, 10
        ));
    }
}
