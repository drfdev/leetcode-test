package dev.drf.leetcode.minimum.bit.flips.to.convert.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumBitFlipsToConvertNumberProblemTest {
    private final MinimumBitFlipsToConvertNumberProblem problem = new MinimumBitFlipsToConvertNumberProblem();

    @Test
    void example1() {
        // Input: start = 10, goal = 7
        // Output: 3
        int start = 10, goal = 7;

        var res = problem.minBitFlips(start, goal);

        assertEquals(3, res);
    }

    @Test
    void example2() {
        // Input: start = 3, goal = 4
        // Output: 3
        int start = 3, goal = 4;

        var res = problem.minBitFlips(start, goal);

        assertEquals(3, res);
    }
}
