package dev.drf.leetcode._2.keys.keyboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2KeysKeyboardProblemTest {
    private final P2KeysKeyboardProblem problem = new P2KeysKeyboardProblem();

    @Test
    void example1() {
        /*
        Input: n = 3
        Output: 3
         */
        int n = 3;

        var out = problem.minSteps(n);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        /*
        Input: n = 1
        Output: 0
         */
        int n = 1;

        var out = problem.minSteps(n);

        assertEquals(0, out);
    }
}
