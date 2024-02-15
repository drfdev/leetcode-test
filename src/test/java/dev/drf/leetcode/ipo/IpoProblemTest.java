package dev.drf.leetcode.ipo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IpoProblemTest {
    private final IpoProblem problem = new IpoProblem();

    @Test
    void example1() {
        /*
        Input: k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
        Output: 4
         */
        int k = 2;
        int w = 0;
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 1};

        var out = problem.findMaximizedCapital(k, w, profits, capital);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        /*
        Input: k = 3, w = 0, profits = [1,2,3], capital = [0,1,2]
        Output: 6
         */
        int k = 3;
        int w = 0;
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 2};

        var out = problem.findMaximizedCapital(k, w, profits, capital);

        assertEquals(6, out);
    }
}
