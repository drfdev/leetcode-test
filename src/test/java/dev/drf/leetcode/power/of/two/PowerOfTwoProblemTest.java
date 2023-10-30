package dev.drf.leetcode.power.of.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerOfTwoProblemTest {
    private final PowerOfTwoProblem problem = new PowerOfTwoProblem();

    @Test
    void example1() {
        /*
        Input: n = 1
        Output: true
         */
        int n = 1;

        var res = problem.isPowerOfTwo(n);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: n = 16
        Output: true
         */
        int n = 16;

        var res = problem.isPowerOfTwo(n);

        assertTrue(res);
    }

    @Test
    void example3() {
        /*
        Input: n = 3
        Output: false
         */
        int n = 3;

        var res = problem.isPowerOfTwo(n);

        assertFalse(res);
    }

    @Test
    void failure1() {
        // n = 8
        int n = 8;

        var res = problem.isPowerOfTwo(n);

        assertTrue(res);
    }

    @Test
    void failure2() {
        // 1073741825
        int n = 1073741825;

        var res = problem.isPowerOfTwo(n);

        assertFalse(res);
    }
}
