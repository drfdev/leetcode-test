package dev.drf.leetcode.squares.of.a.sorted.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaresOfASortedArrayProblemTest {
    private final SquaresOfASortedArrayProblem problem = new SquaresOfASortedArrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
         */
        int[] nums = {-4, -1, 0, 3, 10};

        var out = problem.sortedSquares(nums);

        int[] expected = {0, 1, 9, 16, 100};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [-7,-3,2,3,11]
        Output: [4,9,9,49,121]
         */
        int[] nums = {-7, -3, 2, 3, 11};

        var out = problem.sortedSquares(nums);

        int[] expected = {4, 9, 9, 49, 121};
        assertArrayEquals(expected, out);
    }

    @Test
    void failed1() {
        // [-10000,-9999,-7,-5,0,0,10000]
        // [0,0,25,49,99980001,100000000,100000000]
        int[] nums = {-10000, -9999, -7, -5, 0, 0, 10000};

        var out = problem.sortedSquares(nums);

        int[] expected = {0, 0, 25, 49, 99980001, 100000000, 100000000};
        assertArrayEquals(expected, out);
    }

    @Test
    void failed2() {
        // [-5,-3,-2,-1]
        // [1,4,9,25]
        int[] nums = {-5, -3, -2, -1};

        var out = problem.sortedSquares(nums);

        int[] expected = {1, 4, 9, 25};
        assertArrayEquals(expected, out);
    }

    @Test
    void failed3() {
        // [-4,-4,-3]
        // [9,16,16]
        int[] nums = {-4, -4, -3};

        var out = problem.sortedSquares(nums);

        int[] expected = {9, 16, 16};
        assertArrayEquals(expected, out);
    }
}
