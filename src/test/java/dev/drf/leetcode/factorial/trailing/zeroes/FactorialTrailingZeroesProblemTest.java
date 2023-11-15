package dev.drf.leetcode.factorial.trailing.zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTrailingZeroesProblemTest {
    private final FactorialTrailingZeroesProblem problem = new FactorialTrailingZeroesProblem();

    @Test
    void example1() {
        /*
        Input: n = 3
        Output: 0
         */
        int n = 3;

        var count = problem.trailingZeroes(n);

        assertEquals(0, count);
    }

    @Test
    void example2() {
        /*
        Input: n = 5
        Output: 1
         */
        int n = 5;

        var count = problem.trailingZeroes(n);

        assertEquals(1, count);
    }

    @Test
    void example3() {
        /*
        Input: n = 0
        Output: 0
         */
        int n = 0;

        var count = problem.trailingZeroes(n);

        assertEquals(0, count);
    }
}
