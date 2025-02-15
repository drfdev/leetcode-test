package dev.drf.leetcode.find.the.punishment.number.of.an.integer;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-the-punishment-number-of-an-integer/
 * Used solution:
 * https://leetcode.com/problems/find-the-punishment-number-of-an-integer/solutions/6423515/find-the-punishment-number-of-an-integer-beats-98/
 */
public class FindThePunishmentNumberOfAnIntegerProblem implements Problem {
    public int punishmentNumber(int n) {
        int result = 0;

        for (int i = 0; i <= n; i++) {
            int pow = i * i;
            if (canPartition(pow, i)) {
                result = result + pow;
            }
        }

        return result;
    }

    protected boolean canPartition(int num, int target) {
        if (num < target || target < 0) {
            return false;
        }

        if (num == target) {
            return true;
        }

        return (canPartition(num / 10, target - (num % 10))
                || canPartition(num / 100, target - (num % 100))
                || canPartition(num / 1000, target - (num % 1000)));
    }
}
