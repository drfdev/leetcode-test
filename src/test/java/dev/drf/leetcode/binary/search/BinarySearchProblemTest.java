package dev.drf.leetcode.binary.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchProblemTest {
    private final BinarySearchProblem problem = new BinarySearchProblem();

    @Test
    void example1() {
        /*
        Input: nums = [-1,0,3,5,9,12], target = 9
        Output: 4
        Explanation: 9 exists in nums and its index is 4
         */
        var nums = new int[]{
                -1, 0, 3, 5, 9, 12
        };
        var target = 9;

        var result = problem.search(nums, target);

        assertEquals(4, result);
    }

    @Test
    void example2() {
        /*
        Input: nums = [-1,0,3,5,9,12], target = 2
        Output: -1
        Explanation: 2 does not exist in nums so return -1
         */

        var nums = new int[]{
                -1, 0, 3, 5, 9, 12
        };
        var target = 2;

        var result = problem.search(nums, target);

        assertEquals(-1, result);
    }

    @Test
    void myTest1() {
        var nums = new int[]{
                1, 2, 3, 4, 5, 6, 7
        };
        var target = 6;

        var result = problem.search(nums, target);

        assertEquals(5, result);
    }

    @Test
    void myTest2() {
        var nums = new int[]{3};
        var target = 3;

        var result = problem.search(nums, target);

        assertEquals(0, result);
    }

    @Test
    void fail1() {
        // sums = [-1,0,3,5,9,12]
        // target = 13

        var nums = new int[]{
                -1, 0, 3, 5, 9, 12
        };
        var target = 13;

        var result = problem.search(nums, target);

        assertEquals(-1, result);
    }

    @Test
    void myTest3() {
        var nums = new int[]{
                -1, 0, 3, 5, 9, 12
        };
        var target = -10;

        var result = problem.search(nums, target);

        assertEquals(-1, result);
    }

    @Test
    void fail2() {
        // nums = [2,5]
        // target = 5
        var nums = new int[]{
                2, 5
        };
        var target = 5;

        var result = problem.search(nums, target);

        assertEquals(1, result);
    }
}
