package dev.drf.leetcode.binary.subarrays.with.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/binary-subarrays-with-sum/
 * Used solution:
 * https://leetcode.com/problems/binary-subarrays-with-sum/solutions/186683/c-java-python-sliding-window-o-1-space/
 */
public class BinarySubarraysWithSumProblem implements Problem {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int psum = 0;
        int res = 0;
        int[] count = new int[nums.length + 1];
        count[0] = 1;
        for (int i : nums) {
            psum += i;
            if (psum >= goal) {
                res += count[psum - goal];
            }
            count[psum]++;
        }
        return res;
    }
}
