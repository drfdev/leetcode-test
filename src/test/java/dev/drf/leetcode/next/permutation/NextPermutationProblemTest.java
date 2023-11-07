package dev.drf.leetcode.next.permutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextPermutationProblemTest {
    private final NextPermutationProblem problem = new NextPermutationProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3]
        Output: [1,3,2]
         */
        int[] nums = new int[]{
                1, 2, 3
        };

        problem.nextPermutation(nums);

        assertEquals(1, nums[0]);
        assertEquals(3, nums[1]);
        assertEquals(2, nums[2]);
    }

    @Test
    void example2() {
        /*
        Input: nums = [3,2,1]
        Output: [1,2,3]
         */
        int[] nums = new int[]{
                3, 2, 1
        };

        problem.nextPermutation(nums);

        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(3, nums[2]);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,1,5]
        Output: [1,5,1]
         */
        int[] nums = new int[]{
                1, 1, 5
        };

        problem.nextPermutation(nums);

        assertEquals(1, nums[0]);
        assertEquals(5, nums[1]);
        assertEquals(1, nums[2]);
    }
}
