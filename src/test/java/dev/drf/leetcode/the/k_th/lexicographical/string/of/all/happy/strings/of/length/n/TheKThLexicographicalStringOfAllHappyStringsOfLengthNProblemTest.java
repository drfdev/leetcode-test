package dev.drf.leetcode.the.k_th.lexicographical.string.of.all.happy.strings.of.length.n;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheKThLexicographicalStringOfAllHappyStringsOfLengthNProblemTest {
    private final TheKThLexicographicalStringOfAllHappyStringsOfLengthNProblem problem = new TheKThLexicographicalStringOfAllHappyStringsOfLengthNProblem();

    @Test
    void example1() {
        // Input: n = 1, k = 3
        // Output: "c"
        int n = 1;
        int k = 3;

        var output = problem.getHappyString(n, k);

        assertEquals("c", output);
    }

    @Test
    void example2() {
        // Input: n = 1, k = 4
        // Output: ""
        int n = 1;
        int k = 4;

        var output = problem.getHappyString(n, k);

        assertEquals("", output);
    }

    @Test
    void example3() {
        // Input: n = 3, k = 9
        // Output: "cab"
        int n = 3;
        int k = 9;

        var output = problem.getHappyString(n, k);

        assertEquals("cab", output);
    }
}
