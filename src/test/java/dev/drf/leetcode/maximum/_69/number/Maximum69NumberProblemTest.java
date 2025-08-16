package dev.drf.leetcode.maximum._69.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Maximum69NumberProblemTest {
    private final Maximum69NumberProblem problem = new Maximum69NumberProblem();

    @Test
    void example1() {
        // Input: num = 9669
        // Output: 9969
        int num = 9669;

        var out = problem.maximum69Number(num);

        assertEquals(9969, out);
    }

    @Test
    void example2() {
        // Input: num = 9996
        // Output: 9999
        int num = 9996;

        var out = problem.maximum69Number(num);

        assertEquals(9999, out);
    }

    @Test
    void example3() {
        // Input: num = 9999
        // Output: 9999
        int num = 9999;

        var out = problem.maximum69Number(num);

        assertEquals(9999, out);
    }
}
