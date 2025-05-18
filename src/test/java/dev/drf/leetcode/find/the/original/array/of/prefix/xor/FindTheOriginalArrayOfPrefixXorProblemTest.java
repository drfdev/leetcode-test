package dev.drf.leetcode.find.the.original.array.of.prefix.xor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindTheOriginalArrayOfPrefixXorProblemTest {
    private final FindTheOriginalArrayOfPrefixXorProblem problem = new FindTheOriginalArrayOfPrefixXorProblem();

    @Test
    void example1() {
        // Input: pref = [5,2,0,3,1]
        // Output: [5,7,2,3,2]
        int[] pref = {5, 2, 0, 3, 1};

        var arr = problem.findArray(pref);

        int[] expected = {5, 7, 2, 3, 2};
        assertArrayEquals(expected, arr);
    }

    @Test
    void example2() {
        // Input: pref = [13]
        // Output: [13]
        int[] pref = {13};

        var arr = problem.findArray(pref);

        int[] expected = {13};
        assertArrayEquals(expected, arr);
    }
}
