package dev.drf.leetcode.remove.all.occurrences.of.a.substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveAllOccurrencesOfASubstringProblemTest {
    private final RemoveAllOccurrencesOfASubstringProblem problem = new RemoveAllOccurrencesOfASubstringProblem();

    @Test
    void example1() {
        // Input: s = "daabcbaabcbc", part = "abc"
        // Output: "dab"
        var s = "daabcbaabcbc";
        var part = "abc";

        var output = problem.removeOccurrences(s, part);

        assertEquals("dab", output);
    }

    @Test
    void example2() {
        // Input: s = "axxxxyyyyb", part = "xy"
        // Output: "ab"
        var s = "axxxxyyyyb";
        var part = "xy";

        var output = problem.removeOccurrences(s, part);

        assertEquals("ab", output);
    }

    @Test
    void failed1() {
        // "eemckxmckx"
        // "emckx"
        var s = "eemckxmckx";
        var part = "emckx";

        var output = problem.removeOccurrences(s, part);

        assertEquals("", output);
    }
}
