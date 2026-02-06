package dev.drf.leetcode.gcd.of.odd.and.even.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdOfOddAndEvenSumsProblemTest {
    private final GcdOfOddAndEvenSumsProblem problem = new GcdOfOddAndEvenSumsProblem();

    @Test
    void example1() {
        // Input: n = 4
        // Output: 4
        int n = 4;

        int out = problem.gcdOfOddEvenSums(n);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        // Input: n = 5
        // Output: 5
        int n = 5;

        int out = problem.gcdOfOddEvenSums(n);

        assertEquals(5, out);
    }
}
