package dev.drf.leetcode.letter.tile.possibilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterTilePossibilitiesProblemTest {
    private final LetterTilePossibilitiesProblem problem = new LetterTilePossibilitiesProblem();

    @Test
    void example1() {
        // Input: tiles = "AAB"
        // Output: 8
        String tiles = "AAB";

        var sum = problem.numTilePossibilities(tiles);

        assertEquals(8, sum);
    }

    @Test
    void example2() {
        // Input: tiles = "AAABBC"
        // Output: 188
        String tiles = "AAABBC";

        var sum = problem.numTilePossibilities(tiles);

        assertEquals(188, sum);
    }

    @Test
    void example3() {
        // Input: tiles = "V"
        // Output: 1
        String tiles = "V";

        var sum = problem.numTilePossibilities(tiles);

        assertEquals(1, sum);
    }
}
