package dev.drf.leetcode.string.to.integer.atoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerAtoiProblemTest {
    private final StringToIntegerAtoiProblem problem = new StringToIntegerAtoiProblem();

    @Test
    void example1() {
        // Input: s = "42"
        // Output: 42
        var s = "42";

        var out = problem.myAtoi(s);

        assertEquals(42, out);
    }

    @Test
    void example2() {
        // Input: s = " -042"
        // Output: -42
        var s = " -042";

        var out = problem.myAtoi(s);

        assertEquals(-42, out);
    }

    @Test
    void example3() {
        // Input: s = "1337c0d3"
        // Output: 1337
        var s = "1337c0d3";

        var out = problem.myAtoi(s);

        assertEquals(1337, out);
    }

    @Test
    void example4() {
        // Input: s = "0-1"
        // Output: 0
        var s = "0-1";

        var out = problem.myAtoi(s);

        assertEquals(0, out);
    }

    @Test
    void example5() {
        // Input: s = "words and 987"
        // Output: 0
        var s = "words and 987";

        var out = problem.myAtoi(s);

        assertEquals(0, out);
    }

    @Test
    void failed1() {
        // s = "-91283472332"
        // -2147483648
        var s = "-91283472332";

        var out = problem.myAtoi(s);

        assertEquals(-2147483648, out);
    }

    @Test
    void failed2() {
        // s = "9223372036854775808"
        // 2147483647
        var s = "9223372036854775808";

        var out = problem.myAtoi(s);

        assertEquals(2147483647, out);
    }

    @Test
    void myCheck() {
        // s = "-9223372036854775808"
        // -2147483648
        var s = "-9223372036854775808";

        var out = problem.myAtoi(s);

        assertEquals(-2147483648, out);
    }
}
