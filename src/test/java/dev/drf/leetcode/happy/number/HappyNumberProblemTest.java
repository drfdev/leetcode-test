package dev.drf.leetcode.happy.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumberProblemTest {
    private final HappyNumberProblem problem = new HappyNumberProblem();

    @Test
    void example1() {
        /*
        Input: n = 19
        Output: true
         */
        int n = 19;

        var happy = problem.isHappy(n);

        assertTrue(happy);
    }

    @Test
    void example2() {
        /*
        Input: n = 2
        Output: false
         */
        int n = 2;

        var happy = problem.isHappy(n);

        assertFalse(happy);
    }
}
