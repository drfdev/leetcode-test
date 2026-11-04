package dev.drf.leetcode.minimum.moves.to.equal.array.elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumMovesToEqualArrayElementsProblemTest {
    private final MinimumMovesToEqualArrayElementsProblem problem = new MinimumMovesToEqualArrayElementsProblem();

    @Test
    void example1() {
        // Input: nums = [1,2,3]
        // Output: 3
        int[] nums = {1, 2, 3};

        int out = problem.minMoves(nums);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,1,1]
        // Output: 0
        int[] nums = {1, 1, 1};

        int out = problem.minMoves(nums);

        assertEquals(0, out);
    }

    @Test
    void failure1() {
        // nums = [0]
        int[] nums = {0};

        int out = problem.minMoves(nums);

        assertEquals(0, out);
    }

    @Test
    void failure2() {
        // nums = [0,0]
        int[] nums = {0, 0};

        int out = problem.minMoves(nums);

        assertEquals(0, out);
    }

    @Test
    void failure3() {
        // nums = [-1,1]
        int[] nums = {-1, 1};

        int out = problem.minMoves(nums);

        assertEquals(2, out);
    }
}
