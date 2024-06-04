package dev.drf.leetcode.score.of.a.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreOfAStringProblemTest {
    private final ScoreOfAStringProblem problem = new ScoreOfAStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "hello"
        Output: 13
         */
        var s = "hello";

        var out = problem.scoreOfString(s);

        assertEquals(13, out);
    }

    @Test
    void example2() {
        /*
        Input: s = "zaz"
        Output: 50
         */
        var s = "zaz";

        var out = problem.scoreOfString(s);

        assertEquals(50, out);
    }
}
