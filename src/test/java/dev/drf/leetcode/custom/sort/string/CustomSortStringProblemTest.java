package dev.drf.leetcode.custom.sort.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomSortStringProblemTest {
    private final CustomSortStringProblem problem = new CustomSortStringProblem();

    @Test
    void example1() {
        /*
        Input: order = "cba", s = "abcd"
        Output: "cbad"
         */
        String order = "cba", s = "abcd";

        var out = problem.customSortString(order, s);

        assertEquals("cbad", out);
    }

    @Test
    void example2() {
        /*
        Input: order = "cbafg", s = "abcd"
        Output: "cbad"
         */
        String order = "cbafg", s = "abcd";

        var out = problem.customSortString(order, s);

        assertEquals("cbad", out);
    }
}
