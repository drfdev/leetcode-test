package dev.drf.leetcode.ugly.number.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UglyNumberIIProblemTest {
    private final UglyNumberIIProblem problem = new UglyNumberIIProblem();

    @Test
    void example1() {
        /*
        Input: n = 10
        Output: 12
         */
        int n = 10;

        var out = problem.nthUglyNumber(n);

        assertEquals(12, out);
    }

    @Test
    void example2() {
        /*
        Input: n = 1
        Output: 1
         */
        int n = 1;

        var out = problem.nthUglyNumber(n);

        assertEquals(1, out);
    }
}
