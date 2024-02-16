package dev.drf.leetcode.least.number.of.unique.integers.after.k.removals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeastNumberOfUniqueIntegersAfterKRemovalsProblemTest {
    private final LeastNumberOfUniqueIntegersAfterKRemovalsProblem problem = new LeastNumberOfUniqueIntegersAfterKRemovalsProblem();

    @Test
    void example1() {
        /*
        Input: arr = [5,5,4], k = 1
        Output: 1
         */
        int[] arr = {5, 5, 4};
        int k = 1;

        var out = problem.findLeastNumOfUniqueInts(arr, k);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        /*
        Input: arr = [4,3,1,1,3,3,2], k = 3
        Output: 2
         */
        int[] arr = {4, 3, 1, 1, 3, 3, 2};
        int k = 3;

        var out = problem.findLeastNumOfUniqueInts(arr, k);

        assertEquals(2, out);
    }
}
