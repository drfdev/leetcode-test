package dev.drf.leetcode.find.the.town.judge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheTownJudgeProblemTest {
    private final FindTheTownJudgeProblem problem = new FindTheTownJudgeProblem();

    @Test
    void example1() {
        /*
        Input: n = 2, trust = [[1,2]]
        Output: 2
         */
        int n = 2;
        int[][] trust = {
                {1, 2}
        };

        var out = problem.findJudge(n, trust);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        /*
        Input: n = 3, trust = [[1,3],[2,3]]
        Output: 3
         */
        int n = 3;
        int[][] trust = {
                {1, 3},
                {2, 3}
        };

        var out = problem.findJudge(n, trust);

        assertEquals(3, out);
    }

    @Test
    void example3() {
        /*
        Input: n = 3, trust = [[1,3],[2,3],[3,1]]
        Output: -1
         */
        int n = 3;
        int[][] trust = {
                {1, 3},
                {2, 3},
                {3, 1}
        };

        var out = problem.findJudge(n, trust);

        assertEquals(-1, out);
    }
}
