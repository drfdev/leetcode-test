package dev.drf.leetcode.power.of.four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerOfFourProblemTest {
    private final PowerOfFourProblem problem = new PowerOfFourProblem();

    @Test
    void example1() {
        /*
        Input: n = 16
        Output: true
         */
        int n = 16;

        var res = problem.isPowerOfFour(n);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: n = 5
        Output: false
         */
        int n = 5;

        var res = problem.isPowerOfFour(n);

        assertFalse(res);
    }

    @Test
    void example3() {
        /*
        Input: n = 1
        Output: true
         */
        int n = 1;

        var res = problem.isPowerOfFour(n);

        assertTrue(res);
    }
}
