package dev.drf.leetcode.to.lower._case;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToLowerCaseProblemTest {
    private final ToLowerCaseProblem problem = new ToLowerCaseProblem();

    @Test
    void example1() {
        // Input: s = "Hello"
        // Output: "hello"
        String s = "Hello";

        var result = problem.toLowerCase(s);

        assertEquals("hello", result);
    }

    @Test
    void example2() {
        // Input: s = "here"
        // Output: "here"
        String s = "here";

        var result = problem.toLowerCase(s);

        assertEquals("here", result);
    }

    @Test
    void example3() {
        // Input: s = "LOVELY"
        // Output: "lovely"
        String s = "LOVELY";

        var result = problem.toLowerCase(s);

        assertEquals("lovely", result);
    }
}
