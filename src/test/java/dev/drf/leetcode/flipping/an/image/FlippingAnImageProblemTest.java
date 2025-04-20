package dev.drf.leetcode.flipping.an.image;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FlippingAnImageProblemTest {
    private final FlippingAnImageProblem problem = new FlippingAnImageProblem();

    @Test
    void example1() {
        // Input: image = [[1,1,0],[1,0,1],[0,0,0]]
        // Output: [[1,0,0],[0,1,0],[1,1,1]]
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        var res = problem.flipAndInvertImage(image);

        int[][] expected = {
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        assertArrayEquals(expected, res);
    }

    @Test
    void example2() {
        // Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
        // Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
        int[][] image = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };

        var res = problem.flipAndInvertImage(image);

        int[][] expected = {
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 1},
                {1, 0, 1, 0}
        };
        assertArrayEquals(expected, res);
    }
}
