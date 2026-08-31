package dev.drf.leetcode.count.substrings.that.differ.by.one.character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSubstringsThatDifferByOneCharacterProblemTest {
    private final CountSubstringsThatDifferByOneCharacterProblem problem = new CountSubstringsThatDifferByOneCharacterProblem();

    @Test
    void example1() {
        // Input: s = "aba", t = "baba"
        // Output: 6
        var s = "aba";
        var t = "baba";

        var count = problem.countSubstrings(s, t);

        assertEquals(6, count);
    }

    @Test
    void example2() {
        // Input: s = "ab", t = "bb"
        // Output: 3
        var s = "ab";
        var t = "bb";

        var count = problem.countSubstrings(s, t);

        assertEquals(3, count);
    }
}
