package dev.drf.leetcode.number.of1bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsProblemTest {
    private final NumberOf1BitsProblem problem = new NumberOf1BitsProblem();

    @Test
    void example1() {
        /*
        Input: n = 00000000000000000000000000001011
        Output: 3
         */
        int n = Integer.parseInt("00000000000000000000000000001011", 2);

        var res = problem.hammingWeight(n);

        assertEquals(3, res);
    }

    @Test
    void example2() {
        /*
        Input: n = 00000000000000000000000010000000
        Output: 1
         */
        int n = Integer.parseInt("00000000000000000000000010000000", 2);

        var res = problem.hammingWeight(n);

        assertEquals(1, res);
    }

    @Test
    void example3() {
        /*
        Input: n = 11111111111111111111111111111101
        Output: 31
         */
//        int n = Integer.parseInt("11111111111111111111111111111101", 2);
        int n = -3;

        var res = problem.hammingWeight(n);

        assertEquals(31, res);
    }
}
