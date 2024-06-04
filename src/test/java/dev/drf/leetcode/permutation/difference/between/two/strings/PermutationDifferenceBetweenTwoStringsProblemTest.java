package dev.drf.leetcode.permutation.difference.between.two.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationDifferenceBetweenTwoStringsProblemTest {
    private final PermutationDifferenceBetweenTwoStringsProblem problem = new PermutationDifferenceBetweenTwoStringsProblem();

    @Test
    void example1() {
        /*
        Input: s = "abc", t = "bac"
        Output: 2
         */
        String s = "abc", t = "bac";

        var res = problem.findPermutationDifference(s, t);

        assertEquals(2, res);
    }

    @Test
    void example2() {
        /*
        Input: s = "abcde", t = "edbac"
        Output: 12
         */
        String s = "abcde", t = "edbac";

        var res = problem.findPermutationDifference(s, t);

        assertEquals(12, res);
    }
}
