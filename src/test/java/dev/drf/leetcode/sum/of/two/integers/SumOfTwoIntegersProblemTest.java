package dev.drf.leetcode.sum.of.two.integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTwoIntegersProblemTest {
    private final SumOfTwoIntegersProblem problem = new SumOfTwoIntegersProblem();

    @Test
    void example1() {
        /*
        Input: a = 1, b = 2
        Output: 3
         */
        int a = 1, b = 2;

        var out = problem.getSum(a, b);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        /*
        Input: a = 2, b = 3
        Output: 5
         */
        int a = 2, b = 3;

        var out = problem.getSum(a, b);

        assertEquals(5, out);
    }
}
