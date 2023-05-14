package dev.drf.leetcode.powx.n;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowxNProblemTest {
    private final PowxNProblem problem = new PowxNProblem();

    @Test
    void example1() {
        /*
        Input: x = 2.00000, n = 10
        Output: 1024.00000
         */
        double x = 2.00000;
        int n = 10;

        var result = problem.myPow(x, n);

        assertEquals(1024d, result);
    }

    @Test
    void example2() {
        /*
        Input: x = 2.10000, n = 3
        Output: 9.26100
         */
        double x = 2.10000;
        int n = 3;

        var result = problem.myPow(x, n);

        var round = Math.round(result * 10_000d) / 10_000d;
        assertEquals(9.26100d, round);
    }

    @Test
    void example3() {
        /*
        Input: x = 2.00000, n = -2
        Output: 0.25000
         */
        double x = 2.00000;
        int n = -2;

        var result = problem.myPow(x, n);

        assertEquals(0.25000d, result);
    }

    @Test
    void myTest1() {
        double x = 2.0;
        int n = -3;

        var result = problem.myPow(x, n);

        assertEquals(0.125d, result);
    }

    @Test
    void failed1() {
        double x = 1.00000;
        int n = 2147483647;

        var result = problem.myPow(x, n);

        assertEquals(1d, result);
    }

    @Test
    void myTest2() {
        double x = -1.0;
        int n = 4;

        var result = problem.myPow(x, n);

        assertEquals(1d, result);
    }

    @Test
    void myTest3() {
        double x = -1.0;
        int n = 5;

        var result = problem.myPow(x, n);

        assertEquals(-1d, result);
    }

    @Test
    void failed2() {
        double x = 2.00000;
        int n = -2147483648;

        var result = problem.myPow(x, n);

        var round = Math.round(result * 10_000d) / 10_000d;
        assertEquals(0d, round);
    }
}
