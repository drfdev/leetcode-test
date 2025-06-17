package dev.drf.leetcode.reverse.degree.of.a.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseDegreeOfAStringProblemTest {
    private final ReverseDegreeOfAStringProblem problem = new ReverseDegreeOfAStringProblem();

    @Test
    void example1() {
        // Input: s = "abc"
        // Output: 148
        var s = "abc";

        var d = problem.reverseDegree(s);

        assertEquals(148, d);
    }

    @Test
    void example2() {
        // Input: s = "zaza"
        // Output: 160
        var s = "zaza";

        var d = problem.reverseDegree(s);

        assertEquals(160, d);
    }
}
