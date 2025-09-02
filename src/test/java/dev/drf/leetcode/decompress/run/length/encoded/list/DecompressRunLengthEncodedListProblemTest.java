package dev.drf.leetcode.decompress.run.length.encoded.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DecompressRunLengthEncodedListProblemTest {
    private final DecompressRunLengthEncodedListProblem problem = new DecompressRunLengthEncodedListProblem();

    @Test
    void example1() {
        // Input: nums = [1,2,3,4]
        // Output: [2,4,4,4]
        int[] nums = {1, 2, 3, 4};

        var out = problem.decompressRLElist(nums);

        int[] expected = {2, 4, 4, 4};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,1,2,3]
        // Output: [1,3,3]
        int[] nums = {1, 1, 2, 3};

        var out = problem.decompressRLElist(nums);

        int[] expected = {1, 3, 3};
        assertArrayEquals(expected, out);
    }
}
