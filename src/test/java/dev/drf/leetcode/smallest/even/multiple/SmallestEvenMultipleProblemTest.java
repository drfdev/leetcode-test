package dev.drf.leetcode.smallest.even.multiple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestEvenMultipleProblemTest {
    private final SmallestEvenMultipleProblem problem = new SmallestEvenMultipleProblem();

    @Test
    void example1() {
        /*
        Input: n = 5
        Output: 10
         */
        int n = 5;

        var out = problem.smallestEvenMultiple(n);

        assertEquals(10, out);
    }

    @Test
    void example2() {
        /*
        Input: n = 6
        Output: 6
         */
        int n = 6;

        var out = problem.smallestEvenMultiple(n);

        assertEquals(6, out);
    }
}
