package dev.drf.leetcode.unique.morse.code.words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueMorseCodeWordsProblemTest {
    private final UniqueMorseCodeWordsProblem problem = new UniqueMorseCodeWordsProblem();

    @Test
    void example1() {
        // Input: words = ["gin","zen","gig","msg"]
        // Output: 2
        String[] words = {"gin", "zen", "gig", "msg"};

        int count = problem.uniqueMorseRepresentations(words);

        assertEquals(2, count);
    }

    @Test
    void example2() {
        // Input: words = ["a"]
        // Output: 1
        String[] words = {"a"};

        int count = problem.uniqueMorseRepresentations(words);

        assertEquals(1, count);
    }
}
