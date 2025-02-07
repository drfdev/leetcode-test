package dev.drf.leetcode.maximum.score.words.formed.by.letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumScoreWordsFormedByLettersProblemTest {
    private final MaximumScoreWordsFormedByLettersProblem problem = new MaximumScoreWordsFormedByLettersProblem();

    @Test
    void example1() {
        // Input: words = ["dog","cat","dad","good"],
        // letters = ["a","a","c","d","d","d","g","o","o"],
        // score = [1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]
        // Output: 23
        String[] words = {"dog", "cat", "dad", "good"};
        char[] letters = {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] score = {1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        var result = problem.maxScoreWords(words, letters, score);

        assertEquals(23, result);
    }

    @Test
    void example2() {
        // Input: words = ["xxxz","ax","bx","cx"],
        // letters = ["z","a","b","c","x","x","x"],
        // score = [4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10]
        // Output: 27
        String[] words = {"xxxz", "ax", "bx", "cx"};
        char[] letters = {'z', 'a', 'b', 'c', 'x', 'x', 'x'};
        int[] score = {4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10};

        var result = problem.maxScoreWords(words, letters, score);

        assertEquals(27, result);
    }

    @Test
    void example3() {
        // Input: words = ["leetcode"],
        // letters = ["l","e","t","c","o","d"],
        // score = [0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0]
        // Output: 0
        String[] words = {"leetcode"};
        char[] letters = {'l', 'e', 't', 'c', 'o', 'd'};
        int[] score = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};

        var result = problem.maxScoreWords(words, letters, score);

        assertEquals(0, result);
    }
}
