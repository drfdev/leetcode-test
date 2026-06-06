package dev.drf.leetcode.digit.frequency.score;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/digit-frequency-score/
 */
public class DigitFrequencyScoreProblem implements Problem {
    public int digitFrequencyScore(int n) {
        int result = 0;
        while (n > 0) {
            int val = n % 10;
            result += val;
            n = n / 10;
        }
        return result;
    }
}
