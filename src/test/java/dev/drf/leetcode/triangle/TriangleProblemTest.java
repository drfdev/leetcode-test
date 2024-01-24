package dev.drf.leetcode.triangle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleProblemTest {
    private final TriangleProblem problem = new TriangleProblem();

    @Test
    void example1() {
        /*
        Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
        Output: 11
         */
        var triangle = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );

        var path = problem.minimumTotal(triangle);

        assertEquals(11, path);
    }

    @Test
    void example2() {
        /*
        Input: triangle = [[-10]]
        Output: -10
         */
        var triangle = List.of(
                List.of(-10)
        );

        var path = problem.minimumTotal(triangle);

        assertEquals(-10, path);
    }
}
