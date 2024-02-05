package dev.drf.leetcode.decode.the.message;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeTheMessageProblemTest {
    private final DecodeTheMessageProblem problem = new DecodeTheMessageProblem();

    @Test
    void example1() {
        /*
        Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
        Output: "this is a secret"
         */
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";

        var out = problem.decodeMessage(key, message);

        assertEquals("this is a secret", out);
    }

    @Test
    void example2() {
        /*
        Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
        Output: "the five boxing wizards jump quickly"
         */
        String key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";

        var out = problem.decodeMessage(key, message);

        assertEquals("the five boxing wizards jump quickly", out);
    }
}
