package dev.drf.leetcode.minimum.number.of.steps.to.make.two.strings.anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfStepsToMakeTwoStringsAnagramProblemTest {
    private final MinimumNumberOfStepsToMakeTwoStringsAnagramProblem problem = new MinimumNumberOfStepsToMakeTwoStringsAnagramProblem();

    @Test
    void example1() {
        /*
        Input: s = "bab", t = "aba"
        Output: 1
         */
        String s = "bab", t = "aba";

        var out = problem.minSteps(s, t);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        /*
        Input: s = "leetcode", t = "practice"
        Output: 5
         */
        String s = "leetcode", t = "practice";

        var out = problem.minSteps(s, t);

        assertEquals(5, out);
    }

    @Test
    void example3() {
        /*
        Input: s = "anagram", t = "mangaar"
        Output: 0
         */
        String s = "anagram", t = "mangaar";

        var out = problem.minSteps(s, t);

        assertEquals(0, out);
    }
}
