package dev.drf.leetcode.rotate.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArrayProblem implements Problem {
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }

        if (nums == null || nums.length < 2) {
            return;
        }

        final int size = nums.length;
        if (k > size) {
            k = k % size;
        }

        int[] buff = new int[k];
        System.arraycopy(nums, size - k, buff, 0, k);
        System.arraycopy(nums, 0, nums, k, size - k);
        System.arraycopy(buff, 0, nums, 0, k);
    }
}
