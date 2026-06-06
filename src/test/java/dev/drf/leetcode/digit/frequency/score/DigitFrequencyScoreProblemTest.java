package dev.drf.leetcode.digit.frequency.score;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitFrequencyScoreProblemTest {
    private final DigitFrequencyScoreProblem problem = new DigitFrequencyScoreProblem();

    @Test
    void example1() {
        // Input: n = 122
        // Output: 5
        int n = 122;

        int out = problem.digitFrequencyScore(n);

        assertEquals(5, out);
    }

    @Test
    void example2() {
        // Input: n = 101
        // Output: 2
        int n = 101;

        int out = problem.digitFrequencyScore(n);

        assertEquals(2, out);
    }
}
