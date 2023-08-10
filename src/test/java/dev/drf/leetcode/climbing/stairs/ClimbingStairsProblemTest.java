package dev.drf.leetcode.climbing.stairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsProblemTest {
    private final ClimbingStairsProblem problem = new ClimbingStairsProblem();

    @Test
    void example1() {
        /*
        Input: n = 2
        Output: 2
         */
        int n = 2;

        var r = problem.climbStairs(n);

        assertEquals(2, r);
    }

    @Test
    void example2() {
        /*
        Input: n = 3
        Output: 3
         */
        int n = 3;

        var r = problem.climbStairs(n);

        assertEquals(3, r);
    }

    @Test
    void myTest1() {
        /*
        Input: n = 5
        Output: 8
         */
        int n = 5;

        var r = problem.climbStairs(n);

        assertEquals(8, r);
    }
}
