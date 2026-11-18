package dev.drf.leetcode.minimum.moves.to.equal.array.elements.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumMovesToEqualArrayElementsIIProblemTest {
    private final MinimumMovesToEqualArrayElementsIIProblem problem = new MinimumMovesToEqualArrayElementsIIProblem();

    @Test
    void example1() {
        // Input: nums = [1,2,3]
        // Output: 2
        int[] nums = {1, 2, 3};

        var out = problem.minMoves2(nums);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,10,2,9]
        // Output: 16
        int[] nums = {1, 10, 2, 9};

        var out = problem.minMoves2(nums);

        assertEquals(16, out);
    }
}
