package dev.drf.leetcode.find.if_path.exists.in.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindIfPathExistsInGraphProblemTest {
    private final FindIfPathExistsInGraphProblem problem = new FindIfPathExistsInGraphProblem();

    @Test
    void example1() {
        /*
        Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
        Output: true
         */
        int n = 3;
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 0}
        };
        int source = 0;
        int destination = 2;

        var out = problem.validPath(n, edges, source, destination);

        assertTrue(out);
    }

    @Test
    void example2() {
        /*
        Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
        Output: false
         */
        int n = 6;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {3, 5},
                {5, 4},
                {4, 3}
        };
        int source = 0;
        int destination = 5;

        var out = problem.validPath(n, edges, source, destination);

        assertFalse(out);
    }
}
