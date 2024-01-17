package dev.drf.leetcode.divisor.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DivisorGameProblemTest {
    private final DivisorGameProblem problem = new DivisorGameProblem();

    @Test
    void example1() {
        /*
        Input: n = 2
        Output: true
         */
        int n = 2;

        var out = problem.divisorGame(n);

        assertTrue(out);
    }

    @Test
    void example2() {
        /*
        Input: n = 3
        Output: false
         */
        int n = 3;

        var out = problem.divisorGame(n);

        assertFalse(out);
    }
}
