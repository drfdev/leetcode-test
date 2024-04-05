package dev.drf.leetcode.make.the.string.great;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeTheStringGreatProblemTest {
    private final MakeTheStringGreatProblem problem = new MakeTheStringGreatProblem();

    @Test
    void example1() {
        /*
        Input: s = "leEeetcode"
        Output: "leetcode"
         */
        String s = "leEeetcode";

        var good = problem.makeGood(s);

        assertEquals("leetcode", good);
    }

    @Test
    void example2() {
        /*
        Input: s = "abBAcC"
        Output: ""
         */
        String s = "abBAcC";

        var good = problem.makeGood(s);

        assertEquals("", good);
    }

    @Test
    void example3() {
        /*
        Input: s = "s"
        Output: "s"
         */
        String s = "s";

        var good = problem.makeGood(s);

        assertEquals("s", good);
    }
}
