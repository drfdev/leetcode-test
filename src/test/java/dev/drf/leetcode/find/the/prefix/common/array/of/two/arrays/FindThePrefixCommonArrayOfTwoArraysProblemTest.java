package dev.drf.leetcode.find.the.prefix.common.array.of.two.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindThePrefixCommonArrayOfTwoArraysProblemTest {
    private final FindThePrefixCommonArrayOfTwoArraysProblem problem = new FindThePrefixCommonArrayOfTwoArraysProblem();

    @Test
    void example1() {
        // Input: A = [1,3,2,4], B = [3,1,2,4]
        // Output: [0,2,3,4]
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};

        var C = problem.findThePrefixCommonArray(A, B);

        int[] expected = {0, 2, 3, 4};
        assertArrayEquals(expected, C);
    }

    @Test
    void example2() {
        // Input: A = [2,3,1], B = [3,1,2]
        // Output: [0,1,3]
        int[] A = {2, 3, 1};
        int[] B = {3, 1, 2};

        var C = problem.findThePrefixCommonArray(A, B);

        int[] expected = {0, 1, 3};
        assertArrayEquals(expected, C);
    }
}
