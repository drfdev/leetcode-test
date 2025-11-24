package dev.drf.leetcode.counting.words.with.a.given.prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingWordsWithAGivenPrefixProblemTest {
    private final CountingWordsWithAGivenPrefixProblem problem = new CountingWordsWithAGivenPrefixProblem();

    @Test
    void example1() {
        // Input: words = ["pay","attention","practice","attend"], pref = "at"
        // Output: 2
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";

        int count = problem.prefixCount(words, pref);

        assertEquals(2, count);
    }

    @Test
    void example2() {
        // Input: words = ["leetcode","win","loops","success"], pref = "code"
        // Output: 0
        String[] words = {"leetcode", "win", "loops", "success"};
        String pref = "code";

        int count = problem.prefixCount(words, pref);

        assertEquals(0, count);
    }
}
