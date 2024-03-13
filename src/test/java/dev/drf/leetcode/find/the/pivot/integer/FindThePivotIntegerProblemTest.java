package dev.drf.leetcode.find.the.pivot.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindThePivotIntegerProblemTest {
    private final FindThePivotIntegerProblem problem = new FindThePivotIntegerProblem();

    @Test
    void example1() {
        /*
        Input: n = 8
        Output: 6
         */
        int n = 8;

        int out = problem.pivotInteger(n);

        assertEquals(6, out);
    }

    @Test
    void example2() {
        /*
        Input: n = 1
        Output: 1
         */
        int n = 1;

        int out = problem.pivotInteger(n);

        assertEquals(1, out);
    }

    @Test
    void example3() {
        /*
        Input: n = 4
        Output: -1
         */
        int n = 4;

        int out = problem.pivotInteger(n);

        assertEquals(-1, out);
    }
}
