package dev.drf.leetcode.xor.queries.of.a.subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class XorQueriesOfASubarrayProblemTest {
    private final XorQueriesOfASubarrayProblem problem = new XorQueriesOfASubarrayProblem();

    @Test
    void example1() {
        /*
        Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
        Output: [2,7,14,8]
         */
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {
                {0, 1},
                {1, 2},
                {0, 3},
                {3, 3}
        };

        var answers = problem.xorQueries(arr, queries);

        int[] expected = {2, 7, 14, 8};
        assertArrayEquals(expected, answers);
    }

    @Test
    void example2() {
        /*
        Input: arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]
        Output: [8,0,4,4]
         */
        int[] arr = {4, 8, 2, 10};
        int[][] queries = {
                {2, 3},
                {1, 3},
                {0, 0},
                {0, 3}
        };

        var answers = problem.xorQueries(arr, queries);

        int[] expected = {8, 0, 4, 4};
        assertArrayEquals(expected, answers);
    }
}
