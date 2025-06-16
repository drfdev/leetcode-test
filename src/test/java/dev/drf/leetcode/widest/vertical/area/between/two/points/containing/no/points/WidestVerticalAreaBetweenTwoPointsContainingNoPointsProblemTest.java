package dev.drf.leetcode.widest.vertical.area.between.two.points.containing.no.points;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPointsProblemTest {
    private final WidestVerticalAreaBetweenTwoPointsContainingNoPointsProblem problem
            = new WidestVerticalAreaBetweenTwoPointsContainingNoPointsProblem();

    @Test
    void example1() {
        // Input: points = [[8,7],[9,9],[7,4],[9,7]]
        // Output: 1
        int[][] points = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};

        var out = problem.maxWidthOfVerticalArea(points);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        // Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
        // Output: 3
        int[][] points = {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};

        var out = problem.maxWidthOfVerticalArea(points);

        assertEquals(3, out);
    }
}
