package dev.drf.leetcode.dota2.senate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dota2SenateProblemTest {
    private final Dota2SenateProblem2 problem = new Dota2SenateProblem2();

    @Test
    void example1() {
        /*
        Input: senate = "RD"
        Output: "Radiant"
         */
        String senate = "RD";

        var result = problem.predictPartyVictory(senate);

        assertEquals("Radiant", result);
    }

    @Test
    void example2() {
        /*
        Input: senate = "RDD"
        Output: "Dire"
         */
        String senate = "RDD";

        var result = problem.predictPartyVictory(senate);

        assertEquals("Dire", result);
    }

    @Test
    void failed1() {
        // "DDRRR"
        // "Dire"
        String senate = "DDRRR";

        var result = problem.predictPartyVictory(senate);

        assertEquals("Dire", result);
    }
}
