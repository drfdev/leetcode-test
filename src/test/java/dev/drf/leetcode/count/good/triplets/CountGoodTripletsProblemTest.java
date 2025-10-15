package dev.drf.leetcode.count.good.triplets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountGoodTripletsProblemTest {
    private final CountGoodTripletsProblem problem = new CountGoodTripletsProblem();

    @Test
    void example1() {
        // Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
        // Output: 4
        int[] arr = {3, 0, 1, 1, 9, 7};
        int a = 7, b = 2, c = 3;

        int out = problem.countGoodTriplets(arr, a, b, c);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        // Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
        // Output: 0
        int[] arr = {1, 1, 2, 2, 3};
        int a = 0, b = 0, c = 1;

        int out = problem.countGoodTriplets(arr, a, b, c);

        assertEquals(0, out);
    }

    @Test
    void failure1() {
        // [4,9,9,8,9,5,3,7]
        // a = 1, b = 3, c = 0
        // Expected: 3
        int[] arr = {4, 9, 9, 8, 9, 5, 3, 7};
        int a = 1, b = 3, c = 0;

        int out = problem.countGoodTriplets(arr, a, b, c);

        assertEquals(3, out);
    }
}
