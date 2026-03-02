package dev.drf.leetcode.total.waviness.of.numbers.in.range.i;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/
 */
public class TotalWavinessOfNumbersInRangeIProblem implements Problem {
    public int totalWaviness(int num1, int num2) {
        int wavinessSum = 0;
        int value = num1;

        while (value <= num2) {
            final int w = calculateWaviness(value);
            wavinessSum = wavinessSum + w;
            value++;
        }

        return wavinessSum;
    }

    private int calculateWaviness(int value) {
        if (value < 100) {
            return 0;
        }
        int waviness = 0;
        int left = value % 10;
        value = value / 10;
        int middle = value % 10;
        value = value / 10;
        int right = value % 10;

        do {
            if (isPeak(left, middle, right) || isValley(left, middle, right)) {
                waviness++;
            }

            value = value / 10;

            left = middle;
            middle = right;
            right = value % 10;
        } while (value > 0);

        return waviness;
    }

    private boolean isPeak(int left, int middle, int right) {
        return middle > left && middle > right;
    }

    private boolean isValley(int left, int middle, int right) {
        return middle < left && middle < right;
    }
}
