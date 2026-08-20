package dev.drf.leetcode.check.balanced.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckBalancedStringProblemTest {
    private final CheckBalancedStringProblem problem = new CheckBalancedStringProblem();

    @Test
    void example1() {
        // Input: num = "1234"
        // Output: false
        String num = "1234";

        boolean res = problem.isBalanced(num);

        assertFalse(res);
    }

    @Test
    void example2() {
        // Input: num = "24123"
        // Output: true
        String num = "24123";

        boolean res = problem.isBalanced(num);

        assertTrue(res);
    }
}
