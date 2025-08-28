package dev.drf.leetcode.truncate.sentence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruncateSentenceProblemTest {
    private final TruncateSentenceProblem problem = new TruncateSentenceProblem();

    @Test
    void example1() {
        // Input: s = "Hello how are you Contestant", k = 4
        // Output: "Hello how are you"
        String s = "Hello how are you Contestant";
        int k = 4;

        var out = problem.truncateSentence(s, k);

        assertEquals("Hello how are you", out);
    }

    @Test
    void example2() {
        // Input: s = "What is the solution to this problem", k = 4
        // Output: "What is the solution"
        String s = "What is the solution to this problem";
        int k = 4;

        var out = problem.truncateSentence(s, k);

        assertEquals("What is the solution", out);
    }

    @Test
    void example3() {
        // Input: s = "chopper is not a tanuki", k = 5
        // Output: "chopper is not a tanuki"
        String s = "chopper is not a tanuki";
        int k = 5;

        var out = problem.truncateSentence(s, k);

        assertEquals("chopper is not a tanuki", out);
    }
}
