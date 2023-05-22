package dev.drf.leetcode.decode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeStringProblemTest {
    private final DecodeStringProblem problem = new DecodeStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "3[a]2[bc]"
        Output: "aaabcbc"
         */
        String s = "3[a]2[bc]";

        var r = problem.decodeString(s);

        assertEquals("aaabcbc", r);
    }

    @Test
    void example2() {
        /*
        Input: s = "3[a2[c]]"
        Output: "accaccacc"
         */
        String s = "3[a2[c]]";

        var r = problem.decodeString(s);

        assertEquals("accaccacc", r);
    }

    @Test
    void example3() {
        /*
        Input: s = "2[abc]3[cd]ef"
        Output: "abcabccdcdcdef"
         */
        String s = "2[abc]3[cd]ef";

        var r = problem.decodeString(s);

        assertEquals("abcabccdcdcdef", r);
    }
}
