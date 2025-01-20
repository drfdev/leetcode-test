package dev.drf.leetcode.find.target.indices.after.sorting.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTargetIndicesAfterSortingArrayProblemTest {
    private final FindTargetIndicesAfterSortingArrayProblem problem = new FindTargetIndicesAfterSortingArrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,5,2,3], target = 2
        Output: [1,2]
         */
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        var res = problem.targetIndices(nums, target);

        assertEquals(List.of(1, 2), res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,5,2,3], target = 3
        Output: [3]
         */
        int[] nums = {1, 2, 5, 2, 3};
        int target = 3;

        var res = problem.targetIndices(nums, target);

        assertEquals(List.of(3), res);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,2,5,2,3], target = 5
        Output: [4]
         */
        int[] nums = {1, 2, 5, 2, 3};
        int target = 5;

        var res = problem.targetIndices(nums, target);

        assertEquals(List.of(4), res);
    }
}
