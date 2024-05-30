package dev.drf.leetcode.count.triplets.that.can.form.two.arrays.of.equal.xor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTripletsThatCanFormTwoArraysOfEqualXorProblemTest {
    private final CountTripletsThatCanFormTwoArraysOfEqualXorProblem problem = new CountTripletsThatCanFormTwoArraysOfEqualXorProblem();

    @Test
    void example1() {
        /*
        Input: arr = [2,3,1,6,7]
        Output: 4
         */
        var arr = new int[]{
                2, 3, 1, 6, 7
        };

        var out = problem.countTriplets(arr);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        /*
        Input: arr = [1,1,1,1,1]
        Output: 10
         */
        var arr = new int[]{
                1, 1, 1, 1, 1
        };

        var out = problem.countTriplets(arr);

        assertEquals(10, out);
    }
}
