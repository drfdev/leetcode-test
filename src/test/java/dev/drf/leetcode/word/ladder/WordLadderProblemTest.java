package dev.drf.leetcode.word.ladder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordLadderProblemTest {
    private final WordLadderProblem problem = new WordLadderProblem();

    @Test
    void example1() {
        /*
        Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
        Output: 5
         */
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");

        var count = problem.ladderLength(beginWord, endWord, wordList);

        assertEquals(5, count);
    }

    @Test
    void example2() {
        /*
        Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
        Output: 0
         */
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log");

        var count = problem.ladderLength(beginWord, endWord, wordList);

        assertEquals(0, count);
    }
}
