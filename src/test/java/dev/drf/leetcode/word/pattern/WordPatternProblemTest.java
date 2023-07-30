package dev.drf.leetcode.word.pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordPatternProblemTest {
    private final WordPatternProblem problem = new WordPatternProblem();

    @Test
    void example1() {
        /*
        Input: pattern = "abba", s = "dog cat cat dog"
        Output: true
         */
        var pattern = "abba";
        var s = "dog cat cat dog";

        var match = problem.wordPattern(pattern, s);

        assertTrue(match);
    }

    @Test
    void example2() {
        /*
        Input: pattern = "abba", s = "dog cat cat fish"
        Output: false
         */
        var pattern = "abba";
        var s = "dog cat cat fish";

        var match = problem.wordPattern(pattern, s);

        assertFalse(match);
    }

    @Test
    void example3() {
        /*
        Input: pattern = "aaaa", s = "dog cat cat dog"
        Output: false
         */
        var pattern = "aaaa";
        var s = "dog cat cat dog";

        var match = problem.wordPattern(pattern, s);

        assertFalse(match);
    }

    @Test
    void failed1() {
        // pattern = "abba"
        // s = "dog dog dog dog"
        var pattern = "abba";
        var s = "dog dog dog dog";

        var match = problem.wordPattern(pattern, s);

        assertFalse(match);
    }

    @Test
    void failed2() {
        // pattern = "aaa"
        //s = "aa aa aa aa"
        var pattern = "aaa";
        var s = "aa aa aa aa";

        var match = problem.wordPattern(pattern, s);

        assertFalse(match);
    }
}
