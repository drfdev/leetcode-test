package dev.drf.leetcode.construct.uniform.parity.array.i;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConstructUniformParityArrayIProblemTest {
    private final ConstructUniformParityArrayIProblem problem = new ConstructUniformParityArrayIProblem();

    @Test
    void example1() {
        // Input: nums1 = [2,3]
        // Output: true
        int[] nums1 = {2, 3};

        boolean out = problem.uniformArray(nums1);

        assertTrue(out);
    }

    @Test
    void example2() {
        // Input: nums1 = [4,6]
        // Output: true
        int[] nums1 = {4, 6};

        boolean out = problem.uniformArray(nums1);

        assertTrue(out);
    }
}
