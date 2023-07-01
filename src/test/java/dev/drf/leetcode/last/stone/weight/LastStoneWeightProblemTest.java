package dev.drf.leetcode.last.stone.weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastStoneWeightProblemTest {
    private final LastStoneWeightProblem problem = new LastStoneWeightProblem();

    @Test
    void example1() {
        /*
        Input: stones = [2,7,4,1,8,1]
        Output: 1
         */
        int[] stones = new int[]{
                2, 7, 4, 1, 8, 1
        };

        int val = problem.lastStoneWeight(stones);

        assertEquals(1, val);
    }

    @Test
    void example2() {
        /*
        Input: stones = [1]
        Output: 1
         */
        int[] stones = new int[]{
                1
        };

        int val = problem.lastStoneWeight(stones);

        assertEquals(1, val);
    }
}
