package dev.drf.leetcode.minimum.moves.to.equal.array.elements;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 */
public class MinimumMovesToEqualArrayElementsProblem implements Problem {
    public int minMoves(int[] nums) {
        int lowest = Integer.MAX_VALUE;

        int sum = 0;
        for (int num : nums) {
            lowest = Math.min(num, lowest);
            sum += num;
        }

        final int len = nums.length;
        return sum - (len * lowest);

// ------------------------------------------
        /*

        int lowest = Integer.MAX_VALUE;

        for (int num : nums) {
            lowest = Math.min(num, lowest);
        }

        int sum = 0;
        for (int num : nums) {
            sum += (num - lowest);
        }

        return sum;

         */
    }
}
