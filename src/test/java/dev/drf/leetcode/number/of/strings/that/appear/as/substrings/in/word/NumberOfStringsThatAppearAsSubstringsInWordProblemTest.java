package dev.drf.leetcode.number.of.strings.that.appear.as.substrings.in.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfStringsThatAppearAsSubstringsInWordProblemTest {
    private final NumberOfStringsThatAppearAsSubstringsInWordProblem problem = new NumberOfStringsThatAppearAsSubstringsInWordProblem();

    @Test
    void example1() {
        // Input: patterns = ["a","abc","bc","d"], word = "abc"
        // Output: 3
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";

        int cnt = problem.numOfStrings(patterns, word);

        assertEquals(3, cnt);
    }

    @Test
    void example2() {
        // Input: patterns = ["a","b","c"], word = "aaaaabbbbb"
        // Output: 2
        String[] patterns = {"a", "b", "c"};
        String word = "aaaaabbbbb";

        int cnt = problem.numOfStrings(patterns, word);

        assertEquals(2, cnt);
    }

    @Test
    void example3() {
        // Input: patterns = ["a","a","a"], word = "ab"
        // Output: 3
        String[] patterns = {"a", "a", "a"};
        String word = "ab";

        int cnt = problem.numOfStrings(patterns, word);

        assertEquals(3, cnt);
    }
}
