package dev.drf.leetcode.unique.paths.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsIIProblemTest {
    private final UniquePathsIIProblem problem = new UniquePathsIIProblem();

    @Test
    void example1() {
        /*
        Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
        Output: 2
         */
        int[][] obstacleGrid = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        var paths = problem.uniquePathsWithObstacles(obstacleGrid);

        assertEquals(2, paths);
    }

    @Test
    void example2() {
        /*
        Input: obstacleGrid = [[0,1],[0,0]]
        Output: 1
         */
        int[][] obstacleGrid = new int[][]{
                {0, 1},
                {0, 0}
        };

        var paths = problem.uniquePathsWithObstacles(obstacleGrid);

        assertEquals(1, paths);
    }

    @Test
    void failed1() {
        // obstacleGrid = [[0,0],[0,1]]
        int[][] obstacleGrid = new int[][]{
                {0, 0},
                {0, 1}
        };

        var paths = problem.uniquePathsWithObstacles(obstacleGrid);

        assertEquals(0, paths);
    }

    @Test
    void failed2() {
        // obstacleGrid = [[1,0]]
        int[][] obstacleGrid = new int[][]{
                {1, 0}
        };

        var paths = problem.uniquePathsWithObstacles(obstacleGrid);

        assertEquals(0, paths);
    }

    @Test
    void failed3() {
        // obstacleGrid = [[0,0],[1,1],[0,0]]

        int[][] obstacleGrid = new int[][]{
                {0, 0},
                {1, 1},
                {0, 0}
        };

        var paths = problem.uniquePathsWithObstacles(obstacleGrid);

        assertEquals(0, paths);
    }
}
