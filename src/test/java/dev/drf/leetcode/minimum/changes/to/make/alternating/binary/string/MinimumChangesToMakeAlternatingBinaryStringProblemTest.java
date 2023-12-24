package dev.drf.leetcode.minimum.changes.to.make.alternating.binary.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumChangesToMakeAlternatingBinaryStringProblemTest {
    private final MinimumChangesToMakeAlternatingBinaryStringProblem problem = new MinimumChangesToMakeAlternatingBinaryStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "0100"
        Output: 1
         */
        var s = "0100";

        var count = problem.minOperations(s);

        assertEquals(1, count);
    }

    @Test
    void example2() {
        /*
        Input: s = "10"
        Output: 0
         */
        var s = "10";

        var count = problem.minOperations(s);

        assertEquals(0, count);
    }

    @Test
    void example3() {
        /*
        Input: s = "1111"
        Output: 2
         */
        var s = "1111";

        var count = problem.minOperations(s);

        assertEquals(2, count);
    }
}
