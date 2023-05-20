package dev.drf.leetcode.maximum.number.of.vowels.in.a.substring.of.given.length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfVowelsInASubstringOfGivenLengthProblemTest {
    private final MaximumNumberOfVowelsInASubstringOfGivenLengthProblem problem = new MaximumNumberOfVowelsInASubstringOfGivenLengthProblem();

    @Test
    void example1() {
        /*
        Input: s = "abciiidef", k = 3
        Output: 3
         */
        String s = "abciiidef";
        int k = 3;

        var result = problem.maxVowels(s, k);

        assertEquals(3, result);
    }

    @Test
    void example2() {
        /*
        Input: s = "aeiou", k = 2
        Output: 2
         */
        String s = "aeiou";
        int k = 2;

        var result = problem.maxVowels(s, k);

        assertEquals(2, result);
    }

    @Test
    void example3() {
        /*
        Input: s = "leetcode", k = 3
        Output: 2
         */
        String s = "leetcode";
        int k = 3;

        var result = problem.maxVowels(s, k);

        assertEquals(2, result);
    }
}
