package dev.drf.leetcode.bitwise.and.of.numbers.range;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitwiseAndOfNumbersRangeProblemTest {
    private final BitwiseAndOfNumbersRangeProblem problem = new BitwiseAndOfNumbersRangeProblem();

    @Test
    void example1() {
        /*
        Input: left = 5, right = 7
        Output: 4
         */
        int left = 5;
        int right = 7;

        var res = problem.rangeBitwiseAnd(left, right);

        assertEquals(4, res);
    }

    @Test
    void example2() {
        /*
        Input: left = 0, right = 0
        Output: 0
         */
        int left = 0;
        int right = 0;

        var res = problem.rangeBitwiseAnd(left, right);

        assertEquals(0, res);
    }

    @Test
    void example3() {
        /*
        Input: left = 1, right = 2147483647
        Output: 0
         */
        int left = 1;
        int right = 2147483647;

        var res = problem.rangeBitwiseAnd(left, right);

        assertEquals(0, res);
    }
}
