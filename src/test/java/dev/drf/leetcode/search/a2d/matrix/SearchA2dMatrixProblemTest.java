package dev.drf.leetcode.search.a2d.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchA2dMatrixProblemTest {
    private final SearchA2dMatrixProblem problem = new SearchA2dMatrixProblem();

    @Test
    void example1() {
        /*
        Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
        Output: true
         */
        var matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        var target = 3;

        var result = problem.searchMatrix(matrix, target);

        assertTrue(result);
    }

    @Test
    void example2() {
        /*
        Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
        Output: false
         */
        var matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        var target = 13;

        var result = problem.searchMatrix(matrix, target);

        assertFalse(result);
    }

    @Test
    void myTest1() {
        var matrix = new int[][]{
                {1, 3, 5},
                {7, 10, 11},
                {16, 20, 23},
                {30, 34, 60}
        };
        var target = 3;

        var result = problem.searchMatrix(matrix, target);

        assertTrue(result);
    }

    @Test
    void myTest2() {
        var matrix = new int[][]{
                {1, 3, 5}
        };
        var target = 3;

        var result = problem.searchMatrix(matrix, target);

        assertTrue(result);
    }

    @Test
    void myTest3() {
        var matrix = new int[][]{
                {2, 3, 5}
        };
        var target = 1;

        var result = problem.searchMatrix(matrix, target);

        assertFalse(result);
    }

    @Test
    void myTest4() {
        var matrix = new int[][]{
                {1},
                {3},
                {5}
        };
        var target = 5;

        var result = problem.searchMatrix(matrix, target);

        assertTrue(result);
    }

    @Test
    void myTest5() {
        var matrix = new int[][]{
                {1},
                {3},
                {5}
        };
        var target = 2;

        var result = problem.searchMatrix(matrix, target);

        assertFalse(result);
    }

    @Test
    void fail1() {
        var matrix = new int[][]{
                {1}
        };
        var target = 0;

        var result = problem.searchMatrix(matrix, target);

        assertFalse(result);
    }

    @Test
    void fail2() {
        var matrix = new int[][]{
                {1, 1}
        };
        var target = 2;

        var result = problem.searchMatrix(matrix, target);

        assertFalse(result);
    }
}
