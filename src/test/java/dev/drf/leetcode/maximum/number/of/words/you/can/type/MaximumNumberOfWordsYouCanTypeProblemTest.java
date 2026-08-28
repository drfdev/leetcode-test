package dev.drf.leetcode.maximum.number.of.words.you.can.type;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfWordsYouCanTypeProblemTest {
    private final MaximumNumberOfWordsYouCanTypeProblem problem = new MaximumNumberOfWordsYouCanTypeProblem();

    @Test
    void example1() {
        // Input: text = "hello world", brokenLetters = "ad"
        // Output: 1
        String text = "hello world";
        String brokenLetters = "ad";

        var out = problem.canBeTypedWords(text, brokenLetters);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        // Input: text = "leet code", brokenLetters = "lt"
        // Output: 1
        String text = "leet code";
        String brokenLetters = "lt";

        var out = problem.canBeTypedWords(text, brokenLetters);

        assertEquals(1, out);
    }

    @Test
    void example3() {
        // Input: text = "leet code", brokenLetters = "e"
        // Output: 0
        String text = "leet code";
        String brokenLetters = "e";

        var out = problem.canBeTypedWords(text, brokenLetters);

        assertEquals(0, out);
    }
}
