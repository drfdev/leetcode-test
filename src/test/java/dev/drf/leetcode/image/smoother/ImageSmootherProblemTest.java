package dev.drf.leetcode.image.smoother;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ImageSmootherProblemTest {
    private final ImageSmootherProblem problem = new ImageSmootherProblem();

    @Test
    void example1() {
        /*
        Input: img = [[1,1,1],[1,0,1],[1,1,1]]
        Output: [[0,0,0],[0,0,0],[0,0,0]]
         */
        int[][] img = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        var res = problem.imageSmoother(img);

        int[][] expected = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        assertArrayEquals(expected, res);
    }

    @Test
    void example2() {
        /*
        Input: img = [[100,200,100],[200,50,200],[100,200,100]]
        Output: [[137,141,137],[141,138,141],[137,141,137]]
         */
        int[][] img = new int[][]{
                {100, 200, 100},
                {200, 50, 200},
                {100, 200, 100}
        };

        var res = problem.imageSmoother(img);

        int[][] expected = new int[][]{
                {137, 141, 137},
                {141, 138, 141},
                {137, 141, 137}
        };
        assertArrayEquals(expected, res);
    }
}
