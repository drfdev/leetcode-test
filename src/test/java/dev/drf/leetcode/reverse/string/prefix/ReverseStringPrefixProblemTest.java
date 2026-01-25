package dev.drf.leetcode.reverse.string.prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringPrefixProblemTest {
    private final ReverseStringPrefixProblem problem = new ReverseStringPrefixProblem();

    @Test
    void example1() {
        // Input: s = "abcd", k = 2
        // Output: "bacd"
        var s = "abcd";
        var k = 2;

        var out = problem.reversePrefix(s, k);

        assertEquals("bacd", out);
    }

    @Test
    void example2() {
        // Input: s = "xyz", k = 3
        // Output: "zyx"
        var s = "xyz";
        var k = 3;

        var out = problem.reversePrefix(s, k);

        assertEquals("zyx", out);
    }

    @Test
    void example3() {
        // Input: s = "hey", k = 1
        // Output: "hey"
        var s = "hey";
        var k = 1;

        var out = problem.reversePrefix(s, k);

        assertEquals("hey", out);
    }
}
