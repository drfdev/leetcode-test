package dev.drf.leetcode.integer.to.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanProblemTest {
    private final IntegerToRomanProblem problem = new IntegerToRomanProblem();

    @Test
    void example1() {
        /*
        Input: num = 3
        Output: "III"
         */
        int num = 3;

        var roman = problem.intToRoman(num);

        assertEquals("III", roman);
    }

    @Test
    void example2() {
        /*
        Input: num = 58
        Output: "LVIII"
         */
        int num = 58;

        var roman = problem.intToRoman(num);

        assertEquals("LVIII", roman);
    }

    @Test
    void example3() {
        /*
        Input: num = 1994
        Output: "MCMXCIV"
         */
        int num = 1994;

        var roman = problem.intToRoman(num);

        assertEquals("MCMXCIV", roman);
    }
}
