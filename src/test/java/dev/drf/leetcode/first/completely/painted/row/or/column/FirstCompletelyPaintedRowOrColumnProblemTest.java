package dev.drf.leetcode.first.completely.painted.row.or.column;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstCompletelyPaintedRowOrColumnProblemTest {
    private final FirstCompletelyPaintedRowOrColumnProblem problem = new FirstCompletelyPaintedRowOrColumnProblem();

    @Test
    void example1() {
        /*
        Input: arr = [1,3,4,2], mat = [[1,4],[2,3]]
        Output: 2
         */
        int[] arr = {1, 3, 4, 2};
        int[][] mat = {{1, 4}, {2, 3}};

        var res = problem.firstCompleteIndex(arr, mat);

        assertEquals(2, res);
    }

    @Test
    void example2() {
        /*
        Input: arr = [2,8,7,4,1,3,5,6,9], mat = [[3,2,5],[1,4,6],[8,7,9]]
        Output: 3
         */
        int[] arr = {2, 8, 7, 4, 1, 3, 5, 6, 9};
        int[][] mat = {{3, 2, 5}, {1, 4, 6}, {8, 7, 9}};

        var res = problem.firstCompleteIndex(arr, mat);

        assertEquals(3, res);
    }

    @Test
    void failed1() {
        /*
        arr = [6,2,3,1,4,5]
        mat = [[5,1],[2,4],[6,3]]
         */
        int[] arr = {6, 2, 3, 1, 4, 5};
        int[][] mat = {{5, 1}, {2, 4}, {6, 3}};

        var res = problem.firstCompleteIndex(arr, mat);

        assertEquals(2, res);
    }
}
