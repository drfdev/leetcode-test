package dev.drf.leetcode.find.triangular.sum.of.an.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTriangularSumOfAnArrayProblemTest {
    private final FindTriangularSumOfAnArrayProblem problem = new FindTriangularSumOfAnArrayProblem();

    @Test
    void example1() {
        // Input: nums = [1,2,3,4,5]
        // Output: 8
        int[] nums = {1, 2, 3, 4, 5};

        var out = problem.triangularSum(nums);

        assertEquals(8, out);
    }

    @Test
    void example2() {
        // Input: nums = [5]
        // Output: 5
        int[] nums = {5};

        var out = problem.triangularSum(nums);

        assertEquals(5, out);
    }

    @Test
    void failure1() {
        // nums = [2,6,6,5,5,3,3,8,6,4,3,3,5,1,0,1,3,6,9]
        // Expected: 0
        int[] nums = {2, 6, 6, 5, 5, 3, 3, 8, 6, 4, 3, 3, 5, 1, 0, 1, 3, 6, 9};

        var out = problem.triangularSum(nums);

        assertEquals(0, out);
    }
}
