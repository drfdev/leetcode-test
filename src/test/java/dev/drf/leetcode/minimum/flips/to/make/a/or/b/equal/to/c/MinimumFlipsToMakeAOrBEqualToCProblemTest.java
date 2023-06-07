package dev.drf.leetcode.minimum.flips.to.make.a.or.b.equal.to.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumFlipsToMakeAOrBEqualToCProblemTest {
    private final MinimumFlipsToMakeAOrBEqualToCProblem problem = new MinimumFlipsToMakeAOrBEqualToCProblem();

    @Test
    void example1() {
        /*
        Input: a = 2, b = 6, c = 5
        Output: 3
         */
        int a = 2, b = 6, c = 5;

        var res = problem.minFlips(a, b, c);

        assertEquals(3, res);
    }

    @Test
    void example2() {
        /*
        Input: a = 4, b = 2, c = 7
        Output: 1
         */
        int a = 4, b = 2, c = 7;

        var res = problem.minFlips(a, b, c);

        assertEquals(1, res);
    }

    @Test
    void example3() {
        /*
        Input: a = 1, b = 2, c = 3
        Output: 0
         */
        int a = 1, b = 2, c = 3;

        var res = problem.minFlips(a, b, c);

        assertEquals(0, res);
    }
}
