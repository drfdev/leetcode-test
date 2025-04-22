package dev.drf.leetcode.strictly.palindromic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class StrictlyPalindromicNumberProblemTest {
    private final StrictlyPalindromicNumberProblem problem = new StrictlyPalindromicNumberProblem();

    @Test
    void example1() {
        // Input: n = 9
        // Output: false
        int n = 9;

        var out = problem.isStrictlyPalindromic(n);

        assertFalse(out);
    }

    @Test
    void example2() {
        // Input: n = 4
        // Output: false
        int n = 4;

        var out = problem.isStrictlyPalindromic(n);

        assertFalse(out);
    }
}
