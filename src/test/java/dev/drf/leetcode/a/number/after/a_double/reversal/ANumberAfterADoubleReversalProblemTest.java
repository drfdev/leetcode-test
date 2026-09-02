package dev.drf.leetcode.a.number.after.a_double.reversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ANumberAfterADoubleReversalProblemTest {
    private final ANumberAfterADoubleReversalProblem problem = new ANumberAfterADoubleReversalProblem();

    @Test
    void example1() {
        // Input: num = 526
        // Output: true
        int num = 526;

        boolean out = problem.isSameAfterReversals(num);

        assertTrue(out);
    }

    @Test
    void example2() {
        // Input: num = 1800
        // Output: false
        int num = 1800;

        boolean out = problem.isSameAfterReversals(num);

        assertFalse(out);
    }

    @Test
    void example3() {
        // Input: num = 0
        // Output: true
        int num = 0;

        boolean out = problem.isSameAfterReversals(num);

        assertTrue(out);
    }
}
