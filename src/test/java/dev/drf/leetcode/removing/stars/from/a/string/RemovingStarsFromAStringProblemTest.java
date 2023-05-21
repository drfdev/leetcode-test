package dev.drf.leetcode.removing.stars.from.a.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemovingStarsFromAStringProblemTest {
    private final RemovingStarsFromAStringProblem problem = new RemovingStarsFromAStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "leet**cod*e"
        Output: "lecoe"
         */
        String s = "leet**cod*e";

        var res = problem.removeStars(s);

        assertEquals("lecoe", res);
    }

    @Test
    void example2() {
        /*
        Input: s = "erase*****"
        Output: ""
         */
        String s = "erase*****";

        var res = problem.removeStars(s);

        assertEquals("", res);
    }
}
