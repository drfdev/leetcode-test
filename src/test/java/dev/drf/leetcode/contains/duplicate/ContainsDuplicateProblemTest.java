package dev.drf.leetcode.contains.duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateProblemTest {
    private final ContainsDuplicateProblem problem = new ContainsDuplicateProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,1]
        Output: true
         */
        int[] nums = new int[]{1, 2, 3, 1};

        var res = problem.containsDuplicate(nums);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,3,4]
        Output: false
         */
        int[] nums = new int[]{1, 2, 3, 4};

        var res = problem.containsDuplicate(nums);

        assertFalse(res);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true
         */
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        var res = problem.containsDuplicate(nums);

        assertTrue(res);
    }
}
