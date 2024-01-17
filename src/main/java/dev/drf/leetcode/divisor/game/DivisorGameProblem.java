package dev.drf.leetcode.divisor.game;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/divisor-game/
 */
public class DivisorGameProblem implements Problem {
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}
