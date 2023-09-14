package dev.drf.leetcode.decode.ways;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeWaysProblemTest {
    private final DecodeWaysProblem problem = new DecodeWaysProblem();

    @Test
    void example1() {
        /*
        Input: s = "12"
        Output: 2
         */
        String s = "12";

        var num = problem.numDecodings(s);

        assertEquals(2, num);
    }

    @Test
    void example2() {
        /*
        Input: s = "226"
        Output: 3
         */
        String s = "226";

        var num = problem.numDecodings(s);

        assertEquals(3, num);
    }

    @Test
    void example3() {
        /*
        Input: s = "06"
        Output: 0
         */
        String s = "06";

        var num = problem.numDecodings(s);

        assertEquals(0, num);
    }
}
