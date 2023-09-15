package dev.drf.leetcode.word.break_1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordBreakProblemTest {
    private final WordBreakProblem problem = new WordBreakProblem();

    @Test
    void example1() {
        /*
        Input: s = "leetcode", wordDict = ["leet","code"]
        Output: true
         */
        String s = "leetcode";
        var wordDict = List.of("leet", "code");

        var correct = problem.wordBreak(s, wordDict);

        assertTrue(correct);
    }

    @Test
    void example2() {
        /*
        Input: s = "applepenapple", wordDict = ["apple","pen"]
        Output: true
         */
        String s = "applepenapple";
        var wordDict = List.of("apple", "pen");

        var correct = problem.wordBreak(s, wordDict);

        assertTrue(correct);
    }

    @Test
    void example3() {
        /*
        Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
        Output: false
         */
        String s = "catsandog";
        var wordDict = List.of("cats", "dog", "sand", "and", "cat");

        var correct = problem.wordBreak(s, wordDict);

        assertFalse(correct);
    }
}
