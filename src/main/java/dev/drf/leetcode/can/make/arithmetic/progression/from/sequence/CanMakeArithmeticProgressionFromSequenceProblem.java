package dev.drf.leetcode.can.make.arithmetic.progression.from.sequence;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 */
public class CanMakeArithmeticProgressionFromSequenceProblem implements Problem {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr == null) {
            return false;
        }
        if (arr.length < 3) {
            return true;
        }

        Arrays.sort(arr);

        int value0 = arr[0];
        int value1 = arr[1];

        final int diff = value1 - value0;

        int prev = value1;

        for (int i = 2; i < arr.length; i++) {
            int current = arr[i];

            int calculatedDiff = current - prev;

            if (calculatedDiff != diff) {
                return false;
            }

            prev = current;
        }

        return true;
    }
}
