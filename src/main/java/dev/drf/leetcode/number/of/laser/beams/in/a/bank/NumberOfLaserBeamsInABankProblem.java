package dev.drf.leetcode.number.of.laser.beams.in.a.bank;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/number-of-laser-beams-in-a-bank
 */
public class NumberOfLaserBeamsInABankProblem implements Problem {
    public int numberOfBeams(String[] bank) {
        int sum = 0;
        int laserRow = 0;

        for (String bar : bank) {
            int currentRow = 0;

            var chars = bar.toCharArray();
            for (char ch : chars) {
                if (ch == '1') {
                    currentRow++;
                }
            }

            if (currentRow == 0) {
                // skip
                continue;
            }

            if (laserRow > 0) {
                sum = sum + (laserRow * currentRow);
            }
            laserRow = currentRow;
        }

        return sum;
    }
}
