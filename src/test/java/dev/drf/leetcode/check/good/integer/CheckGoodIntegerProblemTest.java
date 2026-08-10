package dev.drf.leetcode.check.good.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckGoodIntegerProblemTest {
    private final CheckGoodIntegerProblem problem = new CheckGoodIntegerProblem();

    @Test
    void example1() {
        // Input: n = 1000
        // Output: false
        int n = 1000;

        boolean out = problem.checkGoodInteger(n);

        assertFalse(out);
    }

    @Test
    void example2() {
        // Input: n = 19
        // Output: true
        int n = 19;

        boolean out = problem.checkGoodInteger(n);

        assertTrue(out);
    }
}
