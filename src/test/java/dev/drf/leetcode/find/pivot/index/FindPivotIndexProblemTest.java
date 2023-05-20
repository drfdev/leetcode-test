package dev.drf.leetcode.find.pivot.index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPivotIndexProblemTest {
    private final FindPivotIndexProblem problem = new FindPivotIndexProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,7,3,6,5,6]
        Output: 3
         */
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};

        var index = problem.pivotIndex(nums);

        assertEquals(3, index);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,3]
        Output: -1
         */
        int[] nums = new int[]{1, 2, 3};

        var index = problem.pivotIndex(nums);

        assertEquals(-1, index);
    }

    @Test
    void example3() {
        /*
        Input: nums = [2,1,-1]
        Output: 0
         */
        int[] nums = new int[]{2, 1, -1};

        var index = problem.pivotIndex(nums);

        assertEquals(0, index);
    }

    @Test
    void example4() {
        /*
        Input: nums = [2,3,-1,8,4]
        Output: 3
         */
        int[] nums = new int[]{2, 3, -1, 8, 4};

        var index = problem.pivotIndex(nums);

        assertEquals(3, index);
    }

    @Test
    void example5() {
        /*
        Input: nums = [1,-1,4]
        Output: 2
         */
        int[] nums = new int[]{1, -1, 4};

        var index = problem.pivotIndex(nums);

        assertEquals(2, index);
    }

    @Test
    void example6() {
        /*
        Input: nums = [2,5]
        Output: -1
         */
        int[] nums = new int[]{2, 5};

        var index = problem.pivotIndex(nums);

        assertEquals(-1, index);
    }
}
