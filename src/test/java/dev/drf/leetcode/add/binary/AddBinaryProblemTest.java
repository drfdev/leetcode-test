package dev.drf.leetcode.add.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryProblemTest {
    private final AddBinaryProblem problem = new AddBinaryProblem();

    @Test
    void example1() {
        /*
        Input: a = "11", b = "1"
        Output: "100"
         */
        String a = "11", b = "1";

        var result = problem.addBinary(a, b);

        assertEquals("100", result);
    }

    @Test
    void example2() {
        /*
        Input: a = "1010", b = "1011"
        Output: "10101"
         */
        String a = "1010", b = "1011";

        var result = problem.addBinary(a, b);

        assertEquals("10101", result);
    }
}
