package dev.drf.leetcode.power.of.three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerOfThreeProblemTest {
    private final PowerOfThreeProblem problem = new PowerOfThreeProblem();

    @Test
    void example1() {
        /*
        Input: n = 27
        Output: true
         */
        int n = 27;

        var result = problem.isPowerOfThree(n);

        assertTrue(result);
    }

    @Test
    void example2() {
        /*
        Input: n = 0
        Output: false
         */
        int n = 0;

        var result = problem.isPowerOfThree(n);

        assertFalse(result);
    }

    @Test
    void example3() {
        /*
        Input: n = -1
        Output: false
         */
        int n = -1;

        var result = problem.isPowerOfThree(n);

        assertFalse(result);
    }
}
