package dev.drf.leetcode.longest.repeating.character.replacement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestRepeatingCharacterReplacementProblemTest {
    private final LongestRepeatingCharacterReplacementProblem problem = new LongestRepeatingCharacterReplacementProblem();

    @Test
    void example1() {
        /*
        Input: s = "ABAB", k = 2
        Output: 4
         */
        String s = "ABAB";
        int k = 2;

        var size = problem.characterReplacement(s, k);

        assertEquals(4, size);
    }

    @Test
    void example2() {
        /*
        Input: s = "AABABBA", k = 1
        Output: 4
         */
        String s = "AABABBA";
        int k = 1;

        var size = problem.characterReplacement(s, k);

        assertEquals(4, size);
    }
}
