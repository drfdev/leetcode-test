package dev.drf.leetcode.search.a2d.matrix.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchA2dMatrixIIProblemTest {
    private final SearchA2dMatrixIIProblem problem = new SearchA2dMatrixIIProblem();

    @Test
    void example1() {
        /*
        Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
        Output: true
         */
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;

        var bool = problem.searchMatrix(matrix, target);

        assertTrue(bool);
    }

    @Test
    void example2() {
        /*
        Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
        Output: false
         */
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 20;

        var bool = problem.searchMatrix(matrix, target);

        assertFalse(bool);
    }

    @Test
    void failed1() {
        // [[1,1]]
        // 2
        int[][] matrix = new int[][]{
                {1, 1}
        };
        int target = 2;

        var bool = problem.searchMatrix(matrix, target);

        assertFalse(bool);
    }

    @Test
    void failed2() {
        // [[-1,3]]
        // -1
        int[][] matrix = new int[][]{
                {-1, 3}
        };
        int target = -1;

        var bool = problem.searchMatrix(matrix, target);

        assertTrue(bool);
    }

    @Test
    void failed3() {
        // [[1,3,5]]
        // 1
        int[][] matrix = new int[][]{
                {1, 3, 5}
        };
        int target = 1;

        var bool = problem.searchMatrix(matrix, target);

        assertTrue(bool);
    }

    @Test
    void failed4() {
        // [[1,3,5]]
        // 4
        int[][] matrix = new int[][]{
                {1, 3, 5}
        };
        int target = 4;

        var bool = problem.searchMatrix(matrix, target);

        assertFalse(bool);
    }

    @Test
    void failed5() {
        // [[1,3,5]]
        // 5
        int[][] matrix = new int[][]{
                {1, 3, 5}
        };
        int target = 5;

        var bool = problem.searchMatrix(matrix, target);

        assertTrue(bool);
    }

    @Test
    void failed6() {
        // [[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]
        // 15
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int target = 15;

        var bool = problem.searchMatrix(matrix, target);

        assertTrue(bool);
    }
}
