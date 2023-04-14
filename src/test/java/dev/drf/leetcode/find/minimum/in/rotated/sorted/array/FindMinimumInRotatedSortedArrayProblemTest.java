package dev.drf.leetcode.find.minimum.in.rotated.sorted.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumInRotatedSortedArrayProblemTest {
    private final FindMinimumInRotatedSortedArrayProblem problem = new FindMinimumInRotatedSortedArrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [3,4,5,1,2]
        Output: 1
         */
        var nums = new int[]{3, 4, 5, 1, 2};

        var result = problem.findMin(nums);

        assertEquals(1, result);
    }

    @Test
    void example2() {
        /*
        Input: nums = [4,5,6,7,0,1,2]
        Output: 0
         */
        var nums = new int[]{4, 5, 6, 7, 0, 1, 2};

        var result = problem.findMin(nums);

        assertEquals(0, result);
    }

    @Test
    void example3() {
        /*
        Input: nums = [11,13,15,17]
        Output: 11
         */
        var nums = new int[]{11, 13, 15, 17};

        var result = problem.findMin(nums);

        assertEquals(11, result);
    }

    @Test
    void myTest1() {
        var nums = new int[]{1, 3, 5, 7, 9, 10, 17};

        var result = problem.findMin(nums);

        assertEquals(1, result);
    }

    @Test
    void myTest2() {
        var nums = new int[]{3, 5, 7, 9, 10, 17, 1};

        var result = problem.findMin(nums);

        assertEquals(1, result);
    }

    @Test
    void myTest3() {
        var nums = new int[]{5, 7, 9, 10, 17, 1, 3};

        var result = problem.findMin(nums);

        assertEquals(1, result);
    }

    @Test
    void myTest4() {
        var nums = new int[]{7, 9, 10, 17, 1, 3, 5};

        var result = problem.findMin(nums);

        assertEquals(1, result);
    }

    @Test
    void myTest5() {
        var nums = new int[]{9, 10, 17, 1, 3, 5, 7};

        var result = problem.findMin(nums);

        assertEquals(1, result);
    }

    @Test
    void myTest6() {
        var nums = new int[]{10, 17, 1, 3, 5, 7, 9};

        var result = problem.findMin(nums);

        assertEquals(1, result);
    }

    @Test
    void myTest7() {
        var nums = new int[]{17, 1, 3, 5, 7, 9, 10};

        var result = problem.findMin(nums);

        assertEquals(1, result);
    }

    @Test
    void fail1() {
        // nums = [1,2]
        // Output 1
        var nums = new int[]{1, 2};

        var result = problem.findMin(nums);

        assertEquals(1, result);
    }
}
