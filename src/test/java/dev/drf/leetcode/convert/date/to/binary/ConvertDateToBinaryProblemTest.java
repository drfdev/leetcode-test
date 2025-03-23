package dev.drf.leetcode.convert.date.to.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertDateToBinaryProblemTest {
    private final ConvertDateToBinaryProblem problem = new ConvertDateToBinaryProblem();

    @Test
    void example1() {
        // Input: date = "2080-02-29"
        // Output: "100000100000-10-11101"
        String date = "2080-02-29";

        var out = problem.convertDateToBinary(date);

        assertEquals("100000100000-10-11101", out);
    }

    @Test
    void example2() {
        // Input: date = "1900-01-01"
        // Output: "11101101100-1-1"
        String date = "1900-01-01";

        var out = problem.convertDateToBinary(date);

        assertEquals("11101101100-1-1", out);
    }
}
