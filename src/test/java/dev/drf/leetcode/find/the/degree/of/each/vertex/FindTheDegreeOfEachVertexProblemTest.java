package dev.drf.leetcode.find.the.degree.of.each.vertex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindTheDegreeOfEachVertexProblemTest {
    private final FindTheDegreeOfEachVertexProblem problem = new FindTheDegreeOfEachVertexProblem();

    @Test
    void example1() {
        // Input: matrix = [[0,1,1],[1,0,1],[1,1,0]]
        // Output: [2,2,2]
        int[][] matrix = {
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0}
        };

        var result = problem.findDegrees(matrix);

        int[] expected = {2, 2, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    void example2() {
        // Input: matrix = [[0,1,0],[1,0,0],[0,0,0]]
        // Output: [1,1,0]
        int[][] matrix = {
                {0, 1, 0},
                {1, 0, 0},
                {0, 0, 0}
        };

        var result = problem.findDegrees(matrix);

        int[] expected = {1, 1, 0};
        assertArrayEquals(expected, result);
    }
}
