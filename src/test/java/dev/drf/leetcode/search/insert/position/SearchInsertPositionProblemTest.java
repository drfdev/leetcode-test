package dev.drf.leetcode.search.insert.position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionProblemTest {
    private final SearchInsertPositionProblem problem = new SearchInsertPositionProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,3,5,6], target = 5
        Output: 2
         */
        int[] nums = new int[]{
                1, 3, 5, 6
        };
        int target = 5;

        var index = problem.searchInsert(nums, target);

        assertEquals(2, index);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,3,5,6], target = 2
        Output: 1
         */
        int[] nums = new int[]{
                1, 3, 5, 6
        };
        int target = 2;

        var index = problem.searchInsert(nums, target);

        assertEquals(1, index);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,3,5,6], target = 7
        Output: 4
         */
        int[] nums = new int[]{
                1, 3, 5, 6
        };
        int target = 7;

        var index = problem.searchInsert(nums, target);

        assertEquals(4, index);
    }
}
