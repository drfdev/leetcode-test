package dev.drf.leetcode.maximum.score.words.formed.by.letters;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-score-words-formed-by-letters/
 * Used solution:
 * https://www.youtube.com/watch?v=1cV8Hq9IAk4
 */
public class MaximumScoreWordsFormedByLettersProblem implements Problem {
    public int maxScoreWords(String[] words,
                             char[] letters,
                             int[] score) {
        final int[] lettersCounter = new int[score.length];
        for (char ltr : letters) {
            lettersCounter[ltr - 'a']++;
        }

        return maxScoreByIteration(words, 0, lettersCounter, score, 0);
    }

    private int maxScoreByIteration(String[] words,
                                    int index,
                                    int[] lettersCounter,
                                    int[] score,
                                    int currentScore) {
        if (index >= words.length) {
            return currentScore;
        }

        final var currentWord = words[index];

        // take word
        int takeWordScore = -1;
        if (tackeWord(currentWord, lettersCounter)) {
            takeWordScore = currentScore + calculateScoreForWord(currentWord, score);
            takeWordScore = maxScoreByIteration(words, index + 1, lettersCounter, score, takeWordScore);
        }
        untackeWord(currentWord, lettersCounter);

        // not take word
        int notTaskWordScore = maxScoreByIteration(words, index + 1, lettersCounter, score, currentScore);

        return Math.max(takeWordScore, notTaskWordScore);
    }

    private int calculateScoreForWord(String word,
                                      int[] score) {
        int scoreValue = 0;
        var chars = word.toCharArray();

        for (char ch : chars) {
            scoreValue += score[ch - 'a'];
        }

        return scoreValue;
    }

    private boolean tackeWord(String currentWord,
                              int[] lettersCounter) {
        var chars = currentWord.toCharArray();
        var tacked = true;

        for (char ch : chars) {
            lettersCounter[ch - 'a']--;
            if (lettersCounter[ch - 'a'] < 0) {
                tacked = false;
            }
        }

        return tacked;
    }

    private void untackeWord(String currentWord,
                             int[] lettersCounter) {
        var chars = currentWord.toCharArray();

        for (char ch : chars) {
            lettersCounter[ch - 'a']++;
        }
    }
}
