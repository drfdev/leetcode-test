package dev.drf.leetcode.search.in.rotated.sorted.array.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchInRotatedSortedArrayIiProblemTest {
    private final SearchInRotatedSortedArrayIiProblem problem = new SearchInRotatedSortedArrayIiProblem();

    @Test
    void example1() {
        /*
        Input: nums = [2,5,6,0,0,1,2], target = 0
        Output: true
         */
        var nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        var target = 0;

        var result = problem.search(nums, target);

        assertTrue(result);
    }

    @Test
    void example2() {
        /*
        Input: nums = [2,5,6,0,0,1,2], target = 3
        Output: false
         */
        var nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        var target = 3;

        var result = problem.search(nums, target);

        assertFalse(result);
    }

    @Test
    void myTest1() {
        var nums = new int[]{1, 1, 1, 1, 1, 1};
        var target = 2;

        var result = problem.search(nums, target);

        assertFalse(result);
    }

    @Test
    void fail1() {
        /*
        nums = [1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1]
        target = 13
         */
        var nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        var target = 13;

        var result = problem.search(nums, target);

        assertTrue(result);
    }

    @Test
    void myTest2() {
        /*
        Input: nums = [2,5,6,0,0,1,2], target = 0
        Output: true
         */
        var nums = new int[]{5, 6, 0, 0, 1, 2, 2, 2, 2};
        var target = 0;

        var result = problem.search(nums, target);

        assertTrue(result);
    }

    @Test
    void fail2() {
        /*
        nums = [2,2,2,0,0,1]
        target = 0
         */
        var nums = new int[]{2, 2, 2, 0, 0, 1};
        var target = 0;

        var result = problem.search(nums, target);

        assertTrue(result);
    }
}
