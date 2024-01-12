package dev.drf.leetcode.determine_if.string.halves.are.alike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetermineIfStringHalvesAreAlikeProblemTest {
    private final DetermineIfStringHalvesAreAlikeProblem problem = new DetermineIfStringHalvesAreAlikeProblem();

    @Test
    void example1() {
        /*
        Input: s = "book"
        Output: true
         */
        var s = "book";

        var out = problem.halvesAreAlike(s);

        assertTrue(out);
    }

    @Test
    void example2() {
        /*
        Input: s = "textbook"
        Output: false
         */
        var s = "textbook";

        var out = problem.halvesAreAlike(s);

        assertFalse(out);
    }
}
