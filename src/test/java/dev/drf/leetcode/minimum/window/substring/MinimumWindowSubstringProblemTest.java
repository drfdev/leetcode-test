package dev.drf.leetcode.minimum.window.substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumWindowSubstringProblemTest {
    private final MinimumWindowSubstringProblem problem = new MinimumWindowSubstringProblem();

    @Test
    void example1() {
        /*
        Input: s = "ADOBECODEBANC", t = "ABC"
        Output: "BANC"
         */
        String s = "ADOBECODEBANC", t = "ABC";

        var result = problem.minWindow(s, t);

        assertEquals("BANC", result);
    }

    @Test
    void example2() {
        /*
        Input: s = "a", t = "a"
        Output: "a"
         */
        String s = "a", t = "a";

        var result = problem.minWindow(s, t);

        assertEquals("a", result);
    }

    @Test
    void example3() {
        /*
        Input: s = "a", t = "aa"
        Output: ""
         */
        String s = "a", t = "aa";

        var result = problem.minWindow(s, t);

        assertEquals("", result);
    }
}
