package dev.drf.leetcode.search.in.rotated.sorted.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedSortedArrayProblemTest {
    private final SearchInRotatedSortedArrayProblem problem = new SearchInRotatedSortedArrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [4,5,6,7,0,1,2], target = 0
        Output: 4
         */
        var nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        var target = 0;

        var result = problem.search(nums, target);

        assertEquals(4, result);
    }

    @Test
    void example2() {
        /*
        Input: nums = [4,5,6,7,0,1,2], target = 3
        Output: -1
         */
        var nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        var target = 3;

        var result = problem.search(nums, target);

        assertEquals(-1, result);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1], target = 0
        Output: -1
         */
        var nums = new int[]{1};
        var target = 0;

        var result = problem.search(nums, target);

        assertEquals(-1, result);
    }

    @Test
    void rotate1() {
        var nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        var target = 4;

        var result = problem.search(nums, target);

        assertEquals(3, result);
    }

    @Test
    void rotate2() {
        var nums = new int[]{2, 3, 4, 5, 6, 7, 1};
        var target = 4;

        var result = problem.search(nums, target);

        assertEquals(2, result);
    }

    @Test
    void rotate3() {
        var nums = new int[]{3, 4, 5, 6, 7, 1, 2};
        var target = 4;

        var result = problem.search(nums, target);

        assertEquals(1, result);
    }

    @Test
    void rotate4() {
        var nums = new int[]{4, 5, 6, 7, 1, 2, 3};
        var target = 4;

        var result = problem.search(nums, target);

        assertEquals(0, result);
    }

    @Test
    void rotate5() {
        var nums = new int[]{5, 6, 7, 1, 2, 3, 4};
        var target = 4;

        var result = problem.search(nums, target);

        assertEquals(6, result);
    }

    @Test
    void rotate6() {
        var nums = new int[]{6, 7, 1, 2, 3, 4, 5};
        var target = 4;

        var result = problem.search(nums, target);

        assertEquals(5, result);
    }

    @Test
    void rotate7() {
        var nums = new int[]{7, 1, 2, 3, 4, 5, 6};
        var target = 4;

        var result = problem.search(nums, target);

        assertEquals(4, result);
    }

    @Test
    void rotate1_by1() {
        var nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        var target = 1;

        var result = problem.search(nums, target);

        assertEquals(0, result);
    }

    @Test
    void rotate2_by1() {
        var nums = new int[]{2, 3, 4, 5, 6, 7, 1};
        var target = 1;

        var result = problem.search(nums, target);

        assertEquals(6, result);
    }

    @Test
    void rotate3_by1() {
        var nums = new int[]{3, 4, 5, 6, 7, 1, 2};
        var target = 1;

        var result = problem.search(nums, target);

        assertEquals(5, result);
    }

    @Test
    void rotate4_by1() {
        var nums = new int[]{4, 5, 6, 7, 1, 2, 3};
        var target = 1;

        var result = problem.search(nums, target);

        assertEquals(4, result);
    }

    @Test
    void rotate5_by1() {
        var nums = new int[]{5, 6, 7, 1, 2, 3, 4};
        var target = 1;

        var result = problem.search(nums, target);

        assertEquals(3, result);
    }

    @Test
    void rotate6_by1() {
        var nums = new int[]{6, 7, 1, 2, 3, 4, 5};
        var target = 1;

        var result = problem.search(nums, target);

        assertEquals(2, result);
    }

    @Test
    void rotate7_by1() {
        var nums = new int[]{7, 1, 2, 3, 4, 5, 6};
        var target = 1;

        var result = problem.search(nums, target);

        assertEquals(1, result);
    }

    @Test
    void fail1() {
        // nums = [5,1,3]
        // target = 5
        var nums = new int[]{5, 1, 3};
        var target = 5;

        var result = problem.search(nums, target);

        assertEquals(0, result);
    }
}
