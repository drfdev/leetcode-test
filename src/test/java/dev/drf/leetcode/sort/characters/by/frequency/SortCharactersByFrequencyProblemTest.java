package dev.drf.leetcode.sort.characters.by.frequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortCharactersByFrequencyProblemTest {
    private final SortCharactersByFrequencyProblem problem = new SortCharactersByFrequencyProblem();

    @Test
    void example1() {
        /*
        Input: s = "tree"
        Output: "eert"
        Therefore "eetr" is also a valid answer.
         */
        var s = "tree";

        var res = problem.frequencySort(s);

        assertEquals("eert", res);
    }

    @Test
    void example2() {
        /*
        Input: s = "cccaaa"
        Output: "aaaccc"
        "cccaaa" and "aaaccc" are valid answers.
         */
        var s = "cccaaa";

        var res = problem.frequencySort(s);

        assertEquals("aaaccc", res);
    }

    @Test
    void example3() {
        /*
        Input: s = "Aabb"
        Output: "bbAa"
        "bbaA" is also a valid answer
         */
        var s = "Aabb";

        var res = problem.frequencySort(s);

        assertEquals("bbAa", res);
    }

    @Test
    void failed1() {
        // "eeeee"
        var s = "eeeee";

        var res = problem.frequencySort(s);

        assertEquals("eeeee", res);
    }
}
