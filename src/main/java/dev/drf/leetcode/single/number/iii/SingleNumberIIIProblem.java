package dev.drf.leetcode.single.number.iii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/single-number-iii/
 * Used solution:
 * https://leetcode.com/problems/single-number-iii/solutions/5233206/demon-level-explanation-3-approaches/
 */
public class SingleNumberIIIProblem implements Problem {
    public int[] singleNumber(int[] nums) {
        int xor2no = 0;
        for (int num : nums) {
            xor2no ^= num;
        }

        final int lowestBit = xor2no & (-xor2no);

        int[] result = new int[2];
        for (int num : nums) {
            if ((lowestBit & num) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }

        return result;
    }
}
