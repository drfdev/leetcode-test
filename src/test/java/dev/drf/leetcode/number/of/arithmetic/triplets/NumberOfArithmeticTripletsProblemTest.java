package dev.drf.leetcode.number.of.arithmetic.triplets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfArithmeticTripletsProblemTest {
    private final NumberOfArithmeticTripletsProblem problem = new NumberOfArithmeticTripletsProblem();

    @Test
    void example1() {
        /*
        Input: nums = [0,1,4,6,7,10], diff = 3
        Output: 2
         */
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;

        var out = problem.arithmeticTriplets(nums, diff);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [4,5,6,7,8,9], diff = 2
        Output: 2
         */
        int[] nums = {4, 5, 6, 7, 8, 9};
        int diff = 2;

        var out = problem.arithmeticTriplets(nums, diff);

        assertEquals(2, out);
    }
}
