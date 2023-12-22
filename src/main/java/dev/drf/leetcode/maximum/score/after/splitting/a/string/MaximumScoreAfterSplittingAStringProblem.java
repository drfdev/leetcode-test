package dev.drf.leetcode.maximum.score.after.splitting.a.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-score-after-splitting-a-string/
 * Used solution:
 * https://leetcode.com/problems/maximum-score-after-splitting-a-string/solutions/597716/java-5-liner-one-pass/
 */
public class MaximumScoreAfterSplittingAStringProblem implements Problem {
    public int maxScore(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        char[] chars = s.toCharArray();

        int zeroCount = 0;
        int oneCount = 0;

        /*
        Result  = Max of (ZerosOnLeft + OnesOnRight)
                = Max of (ZerosOnLeft + (TotalOnes - OnesOnLeft))
                = Max of (ZerosOnLeft - OnesOnLeft) + TotalOnes (as TotalOnes is constant)
         */
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < chars.length; i++) {
            char value = chars[i];

            if (value == '0') {
                zeroCount++;
            } else if (value == '1') {
                oneCount++;
            }

            if (i != chars.length - 1) {
                max = Math.max(zeroCount - oneCount, max);
            }
        }

        return max + oneCount;
    }
}
