package dev.drf.leetcode.egg.drop.with_2.eggs.and.n.floors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EggDropWith2EggsAndNFloorsProblemTest {
    private final EggDropWith2EggsAndNFloorsProblem problem = new EggDropWith2EggsAndNFloorsProblem();

    @Test
    void example1() {
        // Input: n = 2
        // Output: 2
        int n = 2;

        int out = problem.twoEggDrop(n);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        // Input: n = 100
        // Output: 14
        int n = 100;

        int out = problem.twoEggDrop(n);

        assertEquals(14, out);
    }
}
