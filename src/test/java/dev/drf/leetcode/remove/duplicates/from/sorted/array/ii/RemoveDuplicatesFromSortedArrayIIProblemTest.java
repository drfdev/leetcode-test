package dev.drf.leetcode.remove.duplicates.from.sorted.array.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayIIProblemTest {
    private final RemoveDuplicatesFromSortedArrayIIProblem problem = new RemoveDuplicatesFromSortedArrayIIProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,1,1,2,2,3]
        Output: 5, nums = [1,1,2,2,3,_]
         */
        int[] nums = new int[]{
                1, 1, 1, 2, 2, 3
        };

        var val = problem.removeDuplicates(nums);

        assertEquals(5, val);

        assertEquals(1, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(2, nums[2]);
        assertEquals(2, nums[3]);
        assertEquals(3, nums[4]);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,0,1,1,1,1,2,3,3]
        Output: 7, nums = [0,0,1,1,2,3,3,_,_]
         */
        int[] nums = new int[]{
                0, 0, 1, 1, 1, 1, 2, 3, 3
        };

        var val = problem.removeDuplicates(nums);

        assertEquals(7, val);

        assertEquals(0, nums[0]);
        assertEquals(0, nums[1]);
        assertEquals(1, nums[2]);
        assertEquals(1, nums[3]);
        assertEquals(2, nums[4]);
        assertEquals(3, nums[5]);
        assertEquals(3, nums[6]);
    }
}
