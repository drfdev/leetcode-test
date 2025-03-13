package dev.drf.leetcode.number.of.substrings.containing.all.three.characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfSubstringsContainingAllThreeCharactersProblemTest {
    private final NumberOfSubstringsContainingAllThreeCharactersProblem problem = new NumberOfSubstringsContainingAllThreeCharactersProblem();

    @Test
    void example1() {
        // Input: s = "abcabc"
        // Output: 10
        var s = "abcabc";

        var out = problem.numberOfSubstrings(s);

        assertEquals(10, out);
    }

    @Test
    void example2() {
        // Input: s = "aaacb"
        // Output: 3
        var s = "aaacb";

        var out = problem.numberOfSubstrings(s);

        assertEquals(3, out);
    }

    @Test
    void example3() {
        // Input: s = "abc"
        // Output: 1
        var s = "abc";

        var out = problem.numberOfSubstrings(s);

        assertEquals(1, out);
    }
}
