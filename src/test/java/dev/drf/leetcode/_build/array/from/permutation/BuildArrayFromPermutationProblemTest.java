package dev.drf.leetcode._build.array.from.permutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BuildArrayFromPermutationProblemTest {
    private final BuildArrayFromPermutationProblem problem = new BuildArrayFromPermutationProblem();

    @Test
    void example1() {
        // Input: nums = [0,2,1,5,3,4]
        // Output: [0,1,2,4,5,3]
        int[] nums = {0, 2, 1, 5, 3, 4};

        var out = problem.buildArray(nums);

        int[] expected = {0, 1, 2, 4, 5, 3};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: nums = [5,0,1,2,3,4]
        // Output: [4,5,0,1,2,3]
        int[] nums = {5, 0, 1, 2, 3, 4};

        var out = problem.buildArray(nums);

        int[] expected = {4, 5, 0, 1, 2, 3};
        assertArrayEquals(expected, out);
    }
}
