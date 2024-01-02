package dev.drf.leetcode.ugly.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UglyNumberProblemTest {
    private final UglyNumberProblem problem = new UglyNumberProblem();

    @Test
    void example1() {
        /*
        Input: n = 6
        Output: true
         */
        int n = 6;

        var ugly = problem.isUgly(n);

        assertTrue(ugly);
    }

    @Test
    void example2() {
        /*
        Input: n = 1
        Output: true
         */
        int n = 1;

        var ugly = problem.isUgly(n);

        assertTrue(ugly);
    }

    @Test
    void example3() {
        /*
        Input: n = 14
        Output: false
         */
        int n = 14;

        var ugly = problem.isUgly(n);

        assertFalse(ugly);
    }

    @Test
    void failed1() {
        // n = 0
        int n = 0;

        var ugly = problem.isUgly(n);

        assertFalse(ugly);
    }
}
