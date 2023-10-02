package dev.drf.leetcode.remove.colored.pieces.if_both.neighbors.are.the.same.color;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColorProblemTest {
    private final RemoveColoredPiecesIfBothNeighborsAreTheSameColorProblem problem = new RemoveColoredPiecesIfBothNeighborsAreTheSameColorProblem();

    @Test
    void example1() {
        /*
        Input: colors = "AAABABB"
        Output: true
         */
        String colors = "AAABABB";

        var res = problem.winnerOfGame(colors);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: colors = "AA"
        Output: false
         */
        String colors = "AA";

        var res = problem.winnerOfGame(colors);

        assertFalse(res);
    }

    @Test
    void example3() {
        /*
        Input: colors = "ABBBBBBBAAA"
        Output: false
         */
        String colors = "ABBBBBBBAAA";

        var res = problem.winnerOfGame(colors);

        assertFalse(res);
    }

    @Test
    void failed1() {
        // colors = "AAAAABBBBBBAAAAA"
        // true
        String colors = "AAAAABBBBBBAAAAA";

        var res = problem.winnerOfGame(colors);

        assertTrue(res);
    }

    @Test
    void failed2() {
        // "AAA"
        String colors = "AAA";

        var res = problem.winnerOfGame(colors);

        assertTrue(res);
    }

    @Test
    void failed3() {
        // "ABAAA"
        String colors = "ABAAA";

        var res = problem.winnerOfGame(colors);

        assertTrue(res);
    }
}
