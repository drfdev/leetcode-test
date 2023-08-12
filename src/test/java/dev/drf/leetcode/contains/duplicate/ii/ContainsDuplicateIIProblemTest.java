package dev.drf.leetcode.contains.duplicate.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateIIProblemTest {
    private final ContainsDuplicateIIProblem problem = new ContainsDuplicateIIProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,1], k = 3
        Output: true
         */
        int[] nums = new int[]{
                1, 2, 3, 1
        };
        int k = 3;

        var res = problem.containsNearbyDuplicate(nums, k);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,0,1,1], k = 1
        Output: true
         */
        int[] nums = new int[]{
                1, 0, 1, 1
        };
        int k = 1;

        var res = problem.containsNearbyDuplicate(nums, k);

        assertTrue(res);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,2,3,1,2,3], k = 2
        Output: false
         */
        int[] nums = new int[]{
                1, 2, 3, 1, 2, 3
        };
        int k = 2;

        var res = problem.containsNearbyDuplicate(nums, k);

        assertFalse(res);
    }
}
