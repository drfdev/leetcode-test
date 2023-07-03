package dev.drf.leetcode.k.closest.points.to.origin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KClosestPointsToOriginProblemTest {
    private final KClosestPointsToOriginProblem problem = new KClosestPointsToOriginProblem();

    @Test
    void example1() {
        /*
        Input: points = [[1,3],[-2,2]], k = 1
        Output: [[-2,2]]
         */
        int[][] points = new int[][]{
                {1, 3}, {-2, 2}
        };
        int k = 1;

        var result = problem.kClosest(points, k);

        assertEquals(1, result.length);
        assertEquals(-2, result[0][0]);
        assertEquals(2, result[0][1]);
    }

    @Test
    void example2() {
        /*
        Input: points = [[3,3],[5,-1],[-2,4]], k = 2
        Output: [[3,3],[-2,4]]
         */
        int[][] points = new int[][]{
                {3, 3}, {5, -1}, {-2, 4}
        };
        int k = 2;

        var result = problem.kClosest(points, k);

        assertEquals(2, result.length);
        assertThat(Arrays.asList(result), containsInAnyOrder(
                new int[]{3, 3},
                new int[]{-2, 4}
        ));
    }
}
