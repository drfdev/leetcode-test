package dev.drf.leetcode.assign.cookies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignCookiesProblemTest {
    private final AssignCookiesProblem problem = new AssignCookiesProblem();

    @Test
    void example1() {
        /*
        Input: g = [1,2,3], s = [1,1]
        Output: 1
         */
        var g = new int[]{
                1, 2, 3
        };
        var s = new int[]{
                1, 1
        };

        var count = problem.findContentChildren(g, s);

        assertEquals(1, count);
    }

    @Test
    void example2() {
        /*
        Input: g = [1,2], s = [1,2,3]
        Output: 2
         */
        var g = new int[]{
                1, 2
        };
        var s = new int[]{
                1, 2, 3
        };

        var count = problem.findContentChildren(g, s);

        assertEquals(2, count);
    }
}
