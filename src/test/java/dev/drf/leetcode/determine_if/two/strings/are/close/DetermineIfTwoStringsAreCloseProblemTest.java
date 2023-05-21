package dev.drf.leetcode.determine_if.two.strings.are.close;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetermineIfTwoStringsAreCloseProblemTest {
    private final DetermineIfTwoStringsAreCloseProblem problem = new DetermineIfTwoStringsAreCloseProblem();

    @Test
    void example1() {
        /*
        Input: word1 = "abc", word2 = "bca"
        Output: true
         */
        String word1 = "abc", word2 = "bca";

        var correct = problem.closeStrings(word1, word2);

        assertTrue(correct);
    }

    @Test
    void example2() {
        /*
        Input: word1 = "a", word2 = "aa"
        Output: false
         */
        String word1 = "a", word2 = "aa";

        var correct = problem.closeStrings(word1, word2);

        assertFalse(correct);
    }

    @Test
    void example3() {
        /*
        Input: word1 = "cabbba", word2 = "abbccc"
        Output: true
         */
        String word1 = "cabbba", word2 = "abbccc";

        var correct = problem.closeStrings(word1, word2);

        assertTrue(correct);
    }

    @Test
    void moreExample1() {
        // For example, abcde -> aecdb
        String word1 = "abcde", word2 = "aecdb";

        var correct = problem.closeStrings(word1, word2);

        assertTrue(correct);
    }

    @Test
    void moreExample2() {
        // aacabb -> bbcbaa
        String word1 = "aacabb", word2 = "bbcbaa";

        var correct = problem.closeStrings(word1, word2);

        assertTrue(correct);
    }
}
