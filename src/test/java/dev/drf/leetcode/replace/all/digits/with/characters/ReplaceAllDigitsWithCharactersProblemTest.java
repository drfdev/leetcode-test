package dev.drf.leetcode.replace.all.digits.with.characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceAllDigitsWithCharactersProblemTest {
    private final ReplaceAllDigitsWithCharactersProblem problem = new ReplaceAllDigitsWithCharactersProblem();

    @Test
    void example1() {
        // Input: s = "a1c1e1"
        // Output: "abcdef"
        String s = "a1c1e1";

        var out = problem.replaceDigits(s);

        assertEquals("abcdef", out);
    }

    @Test
    void example2() {
        // Input: s = "a1b2c3d4e"
        // Output: "abbdcfdhe"
        String s = "a1b2c3d4e";

        var out = problem.replaceDigits(s);

        assertEquals("abbdcfdhe", out);
    }
}
