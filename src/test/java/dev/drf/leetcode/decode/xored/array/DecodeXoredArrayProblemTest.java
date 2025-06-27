package dev.drf.leetcode.decode.xored.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DecodeXoredArrayProblemTest {
    private final DecodeXoredArrayProblem problem = new DecodeXoredArrayProblem();

    @Test
    void example1() {
        // Input: encoded = [1,2,3], first = 1
        // Output: [1,0,2,1]
        int[] encoded = {1, 2, 3};
        int first = 1;

        var res = problem.decode(encoded, first);

        int[] expected = {1, 0, 2, 1};
        assertArrayEquals(expected, res);
    }

    @Test
    void example2() {
        // Input: encoded = [6,2,7,3], first = 4
        // Output: [4,2,0,7,4]
        int[] encoded = {6, 2, 7, 3};
        int first = 4;

        var res = problem.decode(encoded, first);

        int[] expected = {4, 2, 0, 7, 4};
        assertArrayEquals(expected, res);
    }
}
