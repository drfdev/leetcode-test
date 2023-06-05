package dev.drf.leetcode.koko.eating.bananas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KokoEatingBananasProblemTest {
    private final KokoEatingBananasProblem problem = new KokoEatingBananasProblem();

    @Test
    void example1() {
        /*
        Input: piles = [3,6,7,11], h = 8
        Output: 4
         */
        int[] piles = new int[]{
                3, 6, 7, 11
        };
        int h = 8;

        var bananas = problem.minEatingSpeed(piles, h);

        assertEquals(4, bananas);
    }

    @Test
    void example2() {
        /*
        Input: piles = [30,11,23,4,20], h = 5
        Output: 30
         */
        int[] piles = new int[]{
                30, 11, 23, 4, 20
        };
        int h = 5;

        var bananas = problem.minEatingSpeed(piles, h);

        assertEquals(30, bananas);
    }

    @Test
    void example3() {
        /*
        Input: piles = [30,11,23,4,20], h = 6
        Output: 23
         */
        int[] piles = new int[]{
                30, 11, 23, 4, 20
        };
        int h = 6;

        var bananas = problem.minEatingSpeed(piles, h);

        assertEquals(23, bananas);
    }

    @Test
    void failed1() {
        /*
        [805306368,805306368,805306368]
        1000000000
        3
         */
        int[] piles = new int[]{
                805306368, 805306368, 805306368
        };
        int h = 1000000000;

        var bananas = problem.minEatingSpeed(piles, h);

        assertEquals(3, bananas);
    }
}
