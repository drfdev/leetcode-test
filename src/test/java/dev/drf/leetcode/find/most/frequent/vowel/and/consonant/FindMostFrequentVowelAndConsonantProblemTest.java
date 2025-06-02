package dev.drf.leetcode.find.most.frequent.vowel.and.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMostFrequentVowelAndConsonantProblemTest {
    private final FindMostFrequentVowelAndConsonantProblem problem = new FindMostFrequentVowelAndConsonantProblem();

    @Test
    void example1() {
        // Input: s = "successes"
        // Output: 6
        String s = "successes";

        int out = problem.maxFreqSum(s);

        assertEquals(6, out);
    }

    @Test
    void example2() {
        // Input: s = "aeiaeia"
        // Output: 3
        String s = "aeiaeia";

        int out = problem.maxFreqSum(s);

        assertEquals(3, out);
    }
}
