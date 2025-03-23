package dev.drf.leetcode.minimum.number.of.operations.to.move.all.balls.to.each.box;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBoxProblemTest {
    private final MinimumNumberOfOperationsToMoveAllBallsToEachBoxProblem problem = new MinimumNumberOfOperationsToMoveAllBallsToEachBoxProblem();

    @Test
    void example1() {
        // Input: boxes = "110"
        // Output: [1,1,3]
        String boxes = "110";

        var out = problem.minOperations(boxes);

        int[] expected = {1, 1, 3};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: boxes = "001011"
        // Output: [11,8,5,4,3,4]
        String boxes = "001011";

        var out = problem.minOperations(boxes);

        int[] expected = {11, 8, 5, 4, 3, 4};
        assertArrayEquals(expected, out);
    }
}
