package dev.drf.leetcode.find.the.maximum.achievable.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheMaximumAchievableNumberProblemTest {
    private final FindTheMaximumAchievableNumberProblem problem = new FindTheMaximumAchievableNumberProblem();

    @Test
    void example1() {
        /*
        Input: num = 4, t = 1
        Output: 6
         */
        int num = 4, t = 1;

        var out = problem.theMaximumAchievableX(num, t);

        assertEquals(6, out);
    }

    @Test
    void example2() {
        /*
        Input: num = 3, t = 2
        Output: 7
         */
        int num = 3, t = 2;

        var out = problem.theMaximumAchievableX(num, t);

        assertEquals(7, out);
    }
}
