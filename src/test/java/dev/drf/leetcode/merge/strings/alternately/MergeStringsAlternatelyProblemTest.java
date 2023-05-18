package dev.drf.leetcode.merge.strings.alternately;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternatelyProblemTest {
    private final MergeStringsAlternatelyProblem problem = new MergeStringsAlternatelyProblem();

    @Test
    void example1() {
        /*
        Input: word1 = "abc", word2 = "pqr"
        Output: "apbqcr"
         */
        String word1 = "abc", word2 = "pqr";

        var result = problem.mergeAlternately(word1, word2);

        assertEquals("apbqcr", result);
    }

    @Test
    void example2() {
        /*
        Input: word1 = "ab", word2 = "pqrs"
        Output: "apbqrs"
         */
        String word1 = "ab", word2 = "pqrs";

        var result = problem.mergeAlternately(word1, word2);

        assertEquals("apbqrs", result);
    }

    @Test
    void example3() {
        /*
        Input: word1 = "abcd", word2 = "pq"
        Output: "apbqcd"
         */
        String word1 = "abcd", word2 = "pq";

        var result = problem.mergeAlternately(word1, word2);

        assertEquals("apbqcd", result);
    }
}
