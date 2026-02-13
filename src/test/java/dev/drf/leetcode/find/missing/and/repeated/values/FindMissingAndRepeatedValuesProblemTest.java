package dev.drf.leetcode.find.missing.and.repeated.values;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindMissingAndRepeatedValuesProblemTest {
    private final FindMissingAndRepeatedValuesProblem problem = new FindMissingAndRepeatedValuesProblem();

    @Test
    void example1() {
        // Input: grid = [[1,3],[2,2]]
        // Output: [2,4]
        int[][] grid = {
                {1, 3},
                {2, 2}
        };

        var answer = problem.findMissingAndRepeatedValues(grid);

        int[] expected = {2, 4};
        assertArrayEquals(expected, answer);
    }

    @Test
    void example2() {
        // Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
        // Output: [9,5]
        int[][] grid = {
                {9, 1, 7},
                {8, 9, 2},
                {3, 4, 6}
        };

        var answer = problem.findMissingAndRepeatedValues(grid);

        int[] expected = {9, 5};
        assertArrayEquals(expected, answer);
    }
}
