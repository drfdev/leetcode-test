package dev.drf.leetcode.maximum.distance.in.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDistanceInArraysProblemTest {
    private final MaximumDistanceInArraysProblem problem = new MaximumDistanceInArraysProblem();

    @Test
    void example1() {
        /*
        Input: arrays = [[1,2,3],[4,5],[1,2,3]]
        Output: 4
         */
        List<List<Integer>> arrays = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(1, 2, 3)
        );

        var value = problem.maxDistance(arrays);

        assertEquals(4, value);
    }

    @Test
    void example2() {
        /*
        Input: arrays = [[1],[1]]
        Output: 0
         */
        List<List<Integer>> arrays = List.of(
                List.of(1),
                List.of(1)
        );

        var value = problem.maxDistance(arrays);

        assertEquals(0, value);
    }
}
