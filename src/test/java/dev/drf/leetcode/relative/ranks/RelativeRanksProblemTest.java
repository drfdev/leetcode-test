package dev.drf.leetcode.relative.ranks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RelativeRanksProblemTest {
    private final RelativeRanksProblem problem = new RelativeRanksProblem();

    @Test
    void example1() {
        /*
        Input: score = [5,4,3,2,1]
        Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
         */
        int[] score = {5, 4, 3, 2, 1};

        var output = problem.findRelativeRanks(score);

        String[] expected = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        assertArrayEquals(expected, output);
    }

    @Test
    void example2() {
        /*
        Input: score = [10,3,8,9,4]
        Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
         */
        int[] score = {10, 3, 8, 9, 4};

        var output = problem.findRelativeRanks(score);

        String[] expected = {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        assertArrayEquals(expected, output);
    }
}
