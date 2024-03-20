package dev.drf.leetcode.stone.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoneGameProblemTest {
    private final StoneGameProblem problem = new StoneGameProblem();

    @Test
    void example1() {
        /*
        Input: piles = [5,3,4,5]
        Output: true
         */
        int[] piles = {5, 3, 4, 5};

        var out = problem.stoneGame(piles);

        assertTrue(out);
    }

    @Test
    void example2() {
        /*
        Input: piles = [3,7,2,3]
        Output: true
         */
        int[] piles = {3, 7, 2, 3};

        var out = problem.stoneGame(piles);

        assertTrue(out);
    }
}
