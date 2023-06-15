package dev.drf.leetcode.permutation.in.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationInStringProblemTest {
    private final PermutationInStringProblem2 problem = new PermutationInStringProblem2();

    @Test
    void example1() {
        /*
        Input: s1 = "ab", s2 = "eidbaooo"
        Output: true
         */
        String s1 = "ab", s2 = "eidbaooo";

        var correct = problem.checkInclusion(s1, s2);

        assertTrue(correct);
    }

    @Test
    void example2() {
        /*
        Input: s1 = "ab", s2 = "eidboaoo"
        Output: false
         */
        String s1 = "ab", s2 = "eidboaoo";

        var correct = problem.checkInclusion(s1, s2);

        assertFalse(correct);
    }

    @Test
    void failed1() {
        /*
        "hello"
        "ooolleoooleh"
        false
         */
        String s1 = "hello", s2 = "ooolleoooleh";

        var correct = problem.checkInclusion(s1, s2);

        assertFalse(correct);
    }
}
