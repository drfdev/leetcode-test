package dev.drf.leetcode.construct.uniform.parity.array.i;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/construct-uniform-parity-array-i/
 */
public class ConstructUniformParityArrayIProblem implements Problem {
    public boolean uniformArray(int[] nums1) {
        // even - even = even
        // odd - odd = even
        // even - odd / odd - even = odd
        // all even => all even / all odd => all odd
        // odd keep, even => convert to odd
        return true;
    }
}
