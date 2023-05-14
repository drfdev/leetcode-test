package dev.drf.leetcode.roman.to.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerProblemTest {
    private final RomanToIntegerProblem problem = new RomanToIntegerProblem();

    @Test
    void example1() {
        var s = "III";

        var result = problem.romanToInt(s);

        assertEquals(3, result);
    }

    @Test
    void example2() {
        var s = "LVIII";

        var result = problem.romanToInt(s);

        assertEquals(58, result);
    }

    @Test
    void example3() {
        var s = "MCMXCIV";

        var result = problem.romanToInt(s);

        assertEquals(1994, result);
    }

    @Test
    void myTest1() {
        var s = "IV";

        var result = problem.romanToInt(s);

        assertEquals(4, result);
    }

    @Test
    void myTest2() {
        var s = "IX";

        var result = problem.romanToInt(s);

        assertEquals(9, result);
    }

    @Test
    void myTest3() {
        var s = "XL";

        var result = problem.romanToInt(s);

        assertEquals(40, result);
    }

    @Test
    void myTest4() {
        var s = "XC";

        var result = problem.romanToInt(s);

        assertEquals(90, result);
    }

    @Test
    void myTest5() {
        var s = "CD";

        var result = problem.romanToInt(s);

        assertEquals(400, result);
    }

    @Test
    void myTest6() {
        var s = "CM";

        var result = problem.romanToInt(s);

        assertEquals(900, result);
    }

    @Test
    void myTest7() {
        var s = "VIII";

        var result = problem.romanToInt(s);

        assertEquals(8, result);
    }
}
