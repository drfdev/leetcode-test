package dev.drf.leetcode.stone.game.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoneGameIIProblemTest {
    private final StoneGameIIProblem problem = new StoneGameIIProblem();

    @Test
    void example1() {
        // Input: piles = [2,7,9,4,4]
        // Output: 10
        int[] piles = {2, 7, 9, 4, 4};

        int out = problem.stoneGameII(piles);

        assertEquals(10, out);
    }

    @Test
    void example2() {
        // Input: piles = [1,2,3,4,5,100]
        // Output: 104
        int[] piles = {1, 2, 3, 4, 5, 100};

        int out = problem.stoneGameII(piles);

        assertEquals(104, out);
    }
}
