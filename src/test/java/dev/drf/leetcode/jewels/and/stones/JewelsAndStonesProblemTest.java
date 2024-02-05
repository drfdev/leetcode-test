package dev.drf.leetcode.jewels.and.stones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsAndStonesProblemTest {
    private final JewelsAndStonesProblem problem = new JewelsAndStonesProblem();

    @Test
    void example1() {
        /*
        Input: jewels = "aA", stones = "aAAbbbb"
        Output: 3
         */
        String jewels = "aA", stones = "aAAbbbb";

        var out = problem.numJewelsInStones(jewels, stones);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        /*
        Input: jewels = "z", stones = "ZZ"
        Output: 0
         */
        String jewels = "z", stones = "ZZ";

        var out = problem.numJewelsInStones(jewels, stones);

        assertEquals(0, out);
    }
}
