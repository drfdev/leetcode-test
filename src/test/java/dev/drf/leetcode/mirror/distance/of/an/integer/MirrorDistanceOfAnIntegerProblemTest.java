package dev.drf.leetcode.mirror.distance.of.an.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorDistanceOfAnIntegerProblemTest {
    private final MirrorDistanceOfAnIntegerProblem problem = new MirrorDistanceOfAnIntegerProblem();

    @Test
    void example1() {
        // Input: n = 25
        // Output: 27
        int n = 25;

        var out = problem.mirrorDistance(n);

        assertEquals(27, out);
    }

    @Test
    void example2() {
        // Input: n = 10
        // Output: 9
        int n = 10;

        var out = problem.mirrorDistance(n);

        assertEquals(9, out);
    }

    @Test
    void example3() {
        // Input: n = 7
        // Output: 0
        int n = 7;

        var out = problem.mirrorDistance(n);

        assertEquals(0, out);
    }
}
