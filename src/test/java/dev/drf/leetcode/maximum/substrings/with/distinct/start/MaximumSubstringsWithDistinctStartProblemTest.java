package dev.drf.leetcode.maximum.substrings.with.distinct.start;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubstringsWithDistinctStartProblemTest {
    private final MaximumSubstringsWithDistinctStartProblem problem = new MaximumSubstringsWithDistinctStartProblem();

    @Test
    void example1() {
        // Input: s = "abab"
        // Output: 2
        String s = "abab";

        var out = problem.maxDistinct(s);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        // Input: s = "abcd"
        // Output: 4
        String s = "abcd";

        var out = problem.maxDistinct(s);

        assertEquals(4, out);
    }

    @Test
    void example3() {
        // Input: s = "aaaa"
        // Output: 1
        String s = "aaaa";

        var out = problem.maxDistinct(s);

        assertEquals(1, out);
    }
}
