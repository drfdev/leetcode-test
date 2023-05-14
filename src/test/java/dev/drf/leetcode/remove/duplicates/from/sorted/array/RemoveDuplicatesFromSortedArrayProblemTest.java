package dev.drf.leetcode.remove.duplicates.from.sorted.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayProblemTest {
    private final RemoveDuplicatesFromSortedArrayProblem problem = new RemoveDuplicatesFromSortedArrayProblem();

    private static void assertNums(int[] nums, int... values) {
        for (int i = 0; i < values.length; i++) {
            assertEquals(values[i], nums[i]);
        }
    }

    @Test
    void example1() {
        /*
        Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]
         */
        int[] nums = new int[]{1, 1, 2};

        int result = problem.removeDuplicates(nums);

        assertEquals(2, result);
        assertNums(nums, 1, 2);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,0,1,1,1,2,2,3,3,4]
        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
         */
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int result = problem.removeDuplicates(nums);

        assertEquals(5, result);
        assertNums(nums, 0, 1, 2, 3, 4);
    }
}
