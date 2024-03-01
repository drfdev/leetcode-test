package dev.drf.leetcode.minimum.sum.of.four.digit.number.after.splitting.digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSumOfFourDigitNumberAfterSplittingDigitsProblemTest {
    private final MinimumSumOfFourDigitNumberAfterSplittingDigitsProblem problem = new MinimumSumOfFourDigitNumberAfterSplittingDigitsProblem();

    @Test
    void example1() {
        /*
        Input: num = 2932
        Output: 52
         */
        int num = 2932;

        var out = problem.minimumSum(num);

        assertEquals(52, out);
    }

    @Test
    void example2() {
        /*
        Input: num = 4009
        Output: 13
         */
        int num = 4009;

        var out = problem.minimumSum(num);

        assertEquals(13, out);
    }
}
