package dev.drf.leetcode.maximum.odd.binary.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumOddBinaryNumberProblemTest {
    private final MaximumOddBinaryNumberProblem problem = new MaximumOddBinaryNumberProblem();

    @Test
    void example1() {
        /*
        Input: s = "010"
        Output: "001"
         */
        var s = "010";

        var out = problem.maximumOddBinaryNumber(s);

        assertEquals("001", out);
    }

    @Test
    void example2() {
        /*
        Input: s = "0101"
        Output: "1001"
         */
        var s = "0101";

        var out = problem.maximumOddBinaryNumber(s);

        assertEquals("1001", out);
    }
}
