package dev.drf.leetcode.greatest.common.divisor.of.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorOfStringsProblemTest {
    private final GreatestCommonDivisorOfStringsProblem problem = new GreatestCommonDivisorOfStringsProblem();

    @Test
    void example1() {
        /*
        Input: str1 = "ABCABC", str2 = "ABC"
        Output: "ABC"
         */
        String str1 = "ABCABC", str2 = "ABC";

        var result = problem.gcdOfStrings(str1, str2);

        assertEquals("ABC", result);
    }

    @Test
    void example2() {
        /*
        Input: str1 = "ABABAB", str2 = "ABAB"
        Output: "AB"
         */
        String str1 = "ABABAB", str2 = "ABAB";

        var result = problem.gcdOfStrings(str1, str2);

        assertEquals("AB", result);
    }

    @Test
    void example3() {
        /*
        Input: str1 = "LEET", str2 = "CODE"
        Output: ""
         */
        String str1 = "LEET", str2 = "CODE";

        var result = problem.gcdOfStrings(str1, str2);

        assertEquals("", result);
    }
}
