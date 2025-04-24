package dev.drf.leetcode.count.complete.subarrays.in.an.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCompleteSubarraysInAnArrayProblemTest {
    private final CountCompleteSubarraysInAnArrayProblem problem = new CountCompleteSubarraysInAnArrayProblem();

    @Test
    void example1() {
        // Input: nums = [1,3,1,2,2]
        // Output: 4
        int[] nums = {1, 3, 1, 2, 2};

        var out = problem.countCompleteSubarrays(nums);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        // Input: nums = [5,5,5,5]
        // Output: 10
        int[] nums = {5, 5, 5, 5};

        var out = problem.countCompleteSubarrays(nums);

        assertEquals(10, out);
    }

    @Test
    void failed1() {
        // nums = [459,459,962,1579,1435,756,1872,1597]
        int[] nums = {459, 459, 962, 1579, 1435, 756, 1872, 1597};

        var out = problem.countCompleteSubarrays(nums);

        assertEquals(2, out);
    }
}
