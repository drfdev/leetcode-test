package dev.drf.leetcode.create.target.array.in.the.given.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CreateTargetArrayInTheGivenOrderProblemTest {
    private final CreateTargetArrayInTheGivenOrderProblem problem = new CreateTargetArrayInTheGivenOrderProblem();

    @Test
    void example1() {
        // Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        // Output: [0,4,1,3,2]
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        var result = problem.createTargetArray(nums, index);

        int[] expected = {0, 4, 1, 3, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    void example2() {
        // Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
        // Output: [0,1,2,3,4]
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};

        var result = problem.createTargetArray(nums, index);

        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    void example3() {
        // Input: nums = [1], index = [0]
        // Output: [1]
        int[] nums = {1};
        int[] index = {0};

        var result = problem.createTargetArray(nums, index);

        int[] expected = {1};
        assertArrayEquals(expected, result);
    }
}
