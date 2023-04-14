package dev.drf.leetcode.guess.number.higher.or.lower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberHigherOrLowerProblemTest {
    private final GuessNumberHigherOrLowerProblem problem = new GuessNumberHigherOrLowerProblem();

    @Test
    void example1() {
        /*
        Input: n = 10, pick = 6
        Output: 6
         */
        int n = 10;
        int pick = 6;

        problem.setPick(pick);

        var result = problem.guessNumber(n);

        assertEquals(pick, result);
    }

    @Test
    void example2() {
        /*
        Input: n = 1, pick = 1
        Output: 1
         */
        int n = 1;
        int pick = 1;

        problem.setPick(pick);

        var result = problem.guessNumber(n);

        assertEquals(pick, result);
    }

    @Test
    void example3() {
        /*
        Input: n = 2, pick = 1
        Output: 1
         */
        int n = 2;
        int pick = 1;

        problem.setPick(pick);

        var result = problem.guessNumber(n);

        assertEquals(pick, result);
    }

    @Test
    void myTest1() {
        int n = 10;
        int pick = 13;

        problem.setPick(pick);

        var result = problem.guessNumber(n);

        assertEquals(-1, result);
    }

    @Test
    void myTest2() {
        int n = 10;
        int pick = -4;

        problem.setPick(pick);

        var result = problem.guessNumber(n);

        assertEquals(-1, result);
    }

    @Test
    void fail1() {
        int n = 2126753390;
        int pick = 1702766719;

        problem.setPick(pick);

        var result = problem.guessNumber(n);

        assertEquals(pick, result);
    }
}
