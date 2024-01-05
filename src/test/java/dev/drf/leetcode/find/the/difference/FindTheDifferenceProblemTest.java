package dev.drf.leetcode.find.the.difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDifferenceProblemTest {
    private final FindTheDifferenceProblem problem = new FindTheDifferenceProblem();

    @Test
    void example1() {
        /*
        Input: s = "abcd", t = "abcde"
        Output: "e"
         */
        String s = "abcd", t = "abcde";

        var out = problem.findTheDifference(s, t);

        assertEquals('e', out);
    }

    @Test
    void example2() {
        /*
        Input: s = "", t = "y"
        Output: "y"
         */
        String s = "", t = "y";

        var out = problem.findTheDifference(s, t);

        assertEquals('y', out);
    }
}
