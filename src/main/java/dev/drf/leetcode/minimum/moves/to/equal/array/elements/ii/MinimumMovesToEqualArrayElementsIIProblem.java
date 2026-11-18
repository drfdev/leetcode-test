package dev.drf.leetcode.minimum.moves.to.equal.array.elements.ii;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
 * Used solution:
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/solutions/8598137/0ms-beats-10000-easy-approach-and-step-b-8hwd/
 */
public class MinimumMovesToEqualArrayElementsIIProblem implements Problem {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        long moves = 0;
        for (int num : nums) {
            moves += Math.abs(num - median);
        }
        return (int) moves;
    }
}
