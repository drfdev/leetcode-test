package dev.drf.leetcode.maximum.score.after.splitting.a.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumScoreAfterSplittingAStringProblemTest {
    private final MaximumScoreAfterSplittingAStringProblem problem = new MaximumScoreAfterSplittingAStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "011101"
        Output: 5
        Explanation:
        All possible ways of splitting s into two non-empty substrings are:
        left = "0" and right = "11101", score = 1 + 4 = 5
        left = "01" and right = "1101", score = 1 + 3 = 4
        left = "011" and right = "101", score = 1 + 2 = 3
        left = "0111" and right = "01", score = 1 + 1 = 2
        left = "01110" and right = "1", score = 2 + 1 = 3
         */
        var s = "011101";

        var count = problem.maxScore(s);

        assertEquals(5, count);
    }

    @Test
    void example2() {
        /*
        Input: s = "00111"
        Output: 5
         */
        var s = "00111";

        var count = problem.maxScore(s);

        assertEquals(5, count);
    }

    @Test
    void example3() {
        /*
        Input: s = "1111"
        Output: 3
         */
        var s = "1111";

        var count = problem.maxScore(s);

        assertEquals(3, count);
    }
}
