package dev.drf.leetcode.bag.of.tokens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BagOfTokensProblemTest {
    private final BagOfTokensProblem problem = new BagOfTokensProblem();

    @Test
    void example1() {
        /*
        Input: tokens = [100], power = 50
        Output: 0
         */
        int[] tokens = {100};
        int power = 50;

        var score = problem.bagOfTokensScore(tokens, power);

        assertEquals(0, score);
    }

    @Test
    void example2() {
        /*
        Input: tokens = [200,100], power = 150
        Output: 1
         */
        int[] tokens = {200, 100};
        int power = 150;

        var score = problem.bagOfTokensScore(tokens, power);

        assertEquals(1, score);
    }

    @Test
    void example3() {
        /*
        Input: tokens = [100,200,300,400], power = 200
        Output: 2
         */
        int[] tokens = {100, 200, 300, 400};
        int power = 200;

        var score = problem.bagOfTokensScore(tokens, power);

        assertEquals(2, score);
    }

    @Test
    void failed1() {
        // [71,55,82]
        // 54
        // 0
        int[] tokens = {71, 55, 82};
        int power = 54;

        var score = problem.bagOfTokensScore(tokens, power);

        assertEquals(0, score);
    }
}
