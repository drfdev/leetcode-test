package dev.drf.leetcode.find.first.and.last.position.of.element.in.sorted.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFirstAndLastPositionOfElementInSortedArrayProblemTest {
    private final FindFirstAndLastPositionOfElementInSortedArrayProblem problem = new FindFirstAndLastPositionOfElementInSortedArrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [5,7,7,8,8,10], target = 8
        Output: [3,4]
         */
        int[] nums = new int[]{
                5, 7, 7, 8, 8, 10
        };
        int target = 8;

        var res = problem.searchRange(nums, target);

        assertEquals(3, res[0]);
        assertEquals(4, res[1]);
    }

    @Test
    void example2() {
        /*
        Input: nums = [5,7,7,8,8,10], target = 6
        Output: [-1,-1]
         */
        int[] nums = new int[]{
                5, 7, 7, 8, 8, 10
        };
        int target = 6;

        var res = problem.searchRange(nums, target);

        assertEquals(-1, res[0]);
        assertEquals(-1, res[1]);
    }

    @Test
    void example3() {
        /*
        Input: nums = [], target = 0
        Output: [-1,-1]
         */
        int[] nums = new int[]{};
        int target = 0;

        var res = problem.searchRange(nums, target);

        assertEquals(-1, res[0]);
        assertEquals(-1, res[1]);
    }

    @Test
    void failed1() {
        // nums = [2,2]
        //target = 2
        int[] nums = new int[]{
                2, 2
        };
        int target = 2;

        var res = problem.searchRange(nums, target);

        assertEquals(0, res[0]);
        assertEquals(1, res[1]);
    }

    @Test
    void failed2() {
        // nums = [1,4]
        // target = 4
        int[] nums = new int[]{
                1, 4
        };
        int target = 4;

        var res = problem.searchRange(nums, target);

        assertEquals(1, res[0]);
        assertEquals(1, res[1]);
    }
}
