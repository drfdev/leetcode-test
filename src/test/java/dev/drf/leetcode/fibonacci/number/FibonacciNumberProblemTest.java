package dev.drf.leetcode.fibonacci.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumberProblemTest {
    private final FibonacciNumberProblem problem = new FibonacciNumberProblem();

    @Test
    void example1() {
        /*
        Input: n = 2
        Output: 1
         */
        int n = 2;

        int out = problem.fib(n);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        /*
        Input: n = 3
        Output: 2
         */
        int n = 3;

        int out = problem.fib(n);

        assertEquals(2, out);
    }

    @Test
    void example3() {
        /*
        Input: n = 4
        Output: 3
         */
        int n = 4;

        int out = problem.fib(n);

        assertEquals(3, out);
    }
}
