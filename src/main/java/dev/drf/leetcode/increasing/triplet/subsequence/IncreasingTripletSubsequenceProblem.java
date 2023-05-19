package dev.drf.leetcode.increasing.triplet.subsequence;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/increasing-triplet-subsequence/
 * Used solution:
 * https://leetcode.com/problems/increasing-triplet-subsequence/solutions/2690508/java-easy-solution-o-1-space-o-n-time-complexity/
 */
public class IncreasingTripletSubsequenceProblem implements Problem {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null) {
            return false;
        }
        if (nums.length < 3) {
            return false;
        }

        int[] arr = new int[]{nums[0], 0};
        int cursor = 0;

        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            if (cursor == 1 && value > arr[1]) {
                return true;
            }

            if (value > arr[0]) {
                if (cursor == 0 || value < arr[1]) {
                    arr[1] = value;
                    cursor = 1;
                }
            } else {
                arr[0] = value;
            }
        }

        return false;
    }
}
