package dev.drf.leetcode.partitioning.into.minimum.number.of.deci.binary.numbers;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersProblem implements Problem {
    public int minPartitions(String n) {
        var chars = n.toCharArray();
        int val = 0;
        for (char ch : chars) {
            val = Math.max(val, (ch - '0'));
            if (val == 9) {
                return 9;
            }
        }
        return val;
    }
}
