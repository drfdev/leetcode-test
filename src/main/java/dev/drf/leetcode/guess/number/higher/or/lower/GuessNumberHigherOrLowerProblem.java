package dev.drf.leetcode.guess.number.higher.or.lower;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 */
public class GuessNumberHigherOrLowerProblem implements Problem {
    private int pick;

    private int guess(int num) {
        if (num == pick) {
            return 0;
        }

        return num > pick ? -1 : 1;
    }

    public void setPick(int pick) {
        this.pick = pick;
    }

    public int guessNumber(int n) {
        if (guess(n) == 0) {
            return n;
        }

        long min = 0;
        long max = n;

        while (true) {
            if (min == max) {
                return guess((int) min) == 0 ? (int) min : -1;
            }
            if (max == min + 1) {
                return guess((int) min) == 0 ? (int) min :
                        guess((int) max) == 0 ? (int) max : -1;

            }

            int average = (int) ((min + max) / 2);
            var check = guess(average);
            if (check == 0) {
                return average;
            }

            if (check < 0) {
                // average > pick
                max = average;
            } else {
                // pick > average
                min = average;
            }
        }
    }
}
