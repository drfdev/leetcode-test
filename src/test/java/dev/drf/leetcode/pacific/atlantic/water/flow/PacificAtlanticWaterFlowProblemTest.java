package dev.drf.leetcode.pacific.atlantic.water.flow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class PacificAtlanticWaterFlowProblemTest {
    private final PacificAtlanticWaterFlowProblem problem = new PacificAtlanticWaterFlowProblem();

    @Test
    void example1() {
        /*
        Input: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
        Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
         */
        int[][] heights = new int[][]{
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };

        var result = problem.pacificAtlantic(heights);

        assertThat(result, containsInAnyOrder(
                contains(0, 4),
                contains(1, 3),
                contains(1, 4),
                contains(2, 2),
                contains(3, 0),
                contains(3, 1),
                contains(4, 0)
        ));
    }

    @Test
    void example2() {
        /*
        Input: heights = [[1]]
        Output: [[0,0]]
         */
        int[][] heights = new int[][]{
                {1}
        };

        var result = problem.pacificAtlantic(heights);

        assertThat(result, containsInAnyOrder(
                contains(0, 0)
        ));
    }
}
