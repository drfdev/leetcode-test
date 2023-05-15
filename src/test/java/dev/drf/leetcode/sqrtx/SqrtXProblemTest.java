package dev.drf.leetcode.sqrtx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtXProblemTest {
    private final SqrtXProblem problem = new SqrtXProblem();

    @Test
    void example1() {
        /*
        Input: x = 4
        Output: 2
         */
        int x = 4;

        var out = problem.mySqrt(x);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        /*
        Input: x = 8
        Output: 2
         */
        int x = 8;

        var out = problem.mySqrt(x);

        assertEquals(2, out);
    }

    @Test
    void myTest1() {
        int x = 81;

        var out = problem.mySqrt(x);

        assertEquals(9, out);
    }

    @Test
    void myTest2() {
        int x = 30;

        var out = problem.mySqrt(x);

        assertEquals(5, out);
    }

    @Test
    void myTest3() {
        int x = 10_000_000;

        var out = problem.mySqrt(x);

        assertEquals(3162, out);
    }

    @Test
    void failed1() {
        int x = 1;

        var out = problem.mySqrt(x);

        assertEquals(1, out);
    }

    @Test
    void failed2() {
        int x = 36;

        var out = problem.mySqrt(x);

        assertEquals(6, out);
    }

    @Test
    void failed3() {
        int x = 2147395599;

        var out = problem.mySqrt(x);

        assertEquals(46339, out);
    }

    @Test
    void failed4() {
        int x = 2147395600;

        var out = problem.mySqrt(x);

        assertEquals(46340, out);
    }
}
