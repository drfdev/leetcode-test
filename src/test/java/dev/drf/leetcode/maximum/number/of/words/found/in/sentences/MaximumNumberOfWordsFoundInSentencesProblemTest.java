package dev.drf.leetcode.maximum.number.of.words.found.in.sentences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfWordsFoundInSentencesProblemTest {
    private final MaximumNumberOfWordsFoundInSentencesProblem problem = new MaximumNumberOfWordsFoundInSentencesProblem();

    @Test
    void example1() {
        // Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
        // Output: 6
        String[] sentences = {"alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"};

        var out = problem.mostWordsFound(sentences);

        assertEquals(6, out);
    }

    @Test
    void example2() {
        // Input: sentences = ["please wait", "continue to fight", "continue to win"]
        // Output: 3
        String[] sentences = {"please wait",
                "continue to fight",
                "continue to win"};

        var out = problem.mostWordsFound(sentences);

        assertEquals(3, out);
    }
}
