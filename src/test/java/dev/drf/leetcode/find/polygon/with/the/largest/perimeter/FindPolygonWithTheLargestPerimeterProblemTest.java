package dev.drf.leetcode.find.polygon.with.the.largest.perimeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPolygonWithTheLargestPerimeterProblemTest {
    private final FindPolygonWithTheLargestPerimeterProblem problem = new FindPolygonWithTheLargestPerimeterProblem();

    @Test
    void example1() {
        /*
        Input: nums = [5,5,5]
        Output: 15
         */
        int[] nums = {5, 5, 5};

        var out = problem.largestPerimeter(nums);

        assertEquals(15, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,12,1,2,5,50,3]
        Output: 12
         */
        int[] nums = {1, 12, 1, 2, 5, 50, 3};

        var out = problem.largestPerimeter(nums);

        assertEquals(12, out);
    }

    @Test
    void example3() {
        /*
        Input: nums = [5,5,50]
        Output: -1
         */
        int[] nums = {5, 5, 50};

        var out = problem.largestPerimeter(nums);

        assertEquals(-1, out);
    }
}
