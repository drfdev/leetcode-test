package dev.drf.leetcode.count.symmetric.integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSymmetricIntegersProblemTest {
    private final CountSymmetricIntegersProblem problem = new CountSymmetricIntegersProblem();

    @Test
    void example1() {
        // Input: low = 1, high = 100
        // Output: 9
        int low = 1;
        int high = 100;

        int out = problem.countSymmetricIntegers(low, high);

        assertEquals(9, out);
    }

    @Test
    void example2() {
        // Input: low = 1200, high = 1230
        // Output: 4
        int low = 1200;
        int high = 1230;

        int out = problem.countSymmetricIntegers(low, high);

        assertEquals(4, out);
    }
}
