package dev.drf.leetcode.hand.of.straights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HandOfStraightsProblemTest {
    private final HandOfStraightsProblem problem = new HandOfStraightsProblem();

    @Test
    void example1() {
        /*
        Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
        Output: true
         */
        int[] hand = new int[]{
                1, 2, 3, 6, 2, 3, 4, 7, 8
        };
        int groupSize = 3;

        var correct = problem.isNStraightHand(hand, groupSize);

        assertTrue(correct);
    }

    @Test
    void example2() {
        /*
        Input: hand = [1,2,3,4,5], groupSize = 4
        Output: false
         */
        int[] hand = new int[]{
                1, 2, 3, 4, 5
        };
        int groupSize = 4;

        var correct = problem.isNStraightHand(hand, groupSize);

        assertFalse(correct);
    }
}
