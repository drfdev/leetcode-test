package dev.drf.leetcode.reverse.bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBitsProblemTest {
    private final ReverseBitsProblem problem = new ReverseBitsProblem();

    @Test
    void example1() {
        /*
        Input: n = 00000010100101000001111010011100
        Output:    964176192 (00111001011110000010100101000000)
         */
        int n = Integer.parseInt("00000010100101000001111010011100", 2);

        var res = problem.reverseBits(n);

        int expected = Integer.parseInt("00111001011110000010100101000000", 2);
        assertEquals(expected, res);
    }

    @Test
    void example2() {
        /*
        Input: n = 11111111111111111111111111111101
        Output:   3221225471 (10111111111111111111111111111111)
         */
//        int n = Integer.parseInt("11111111111111111111111111111101", 2);
        int n = -3;

        var res = problem.reverseBits(n);

//        int expected = Integer.parseInt("10111111111111111111111111111111", 2);
        int expected = Integer.parseUnsignedInt("3221225471");
        assertEquals(expected, res);
    }
}
