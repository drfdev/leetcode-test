package dev.drf.leetcode.n.th.tribonacci.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthTribonacciNumberProblemTest {
    private final NthTribonacciNumberProblem problem = new NthTribonacciNumberProblem();

    @Test
    void example1() {
        /*
        Input: n = 4
        Output: 4
         */
        int n = 4;

        var res = problem.tribonacci(n);

        assertEquals(4, res);
    }

    @Test
    void example2() {
        /*
        Input: n = 25
        Output: 1389537
         */
        int n = 25;

        var res = problem.tribonacci(n);

        assertEquals(1389537, res);
    }
}
