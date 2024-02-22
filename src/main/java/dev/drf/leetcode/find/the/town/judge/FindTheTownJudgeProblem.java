package dev.drf.leetcode.find.the.town.judge;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-the-town-judge/
 */
public class FindTheTownJudgeProblem implements Problem {
    public int findJudge(int n, int[][] trust) {
        int[][] memo = new int[n][2];

        for (int[] pair : trust) {
            int fromIndex = pair[0] - 1;
            int toIndex = pair[1] - 1;

            memo[fromIndex][0]++;
            memo[toIndex][1]++;
        }

        int judgeIndex = -1;

        for (int i = 0; i < memo.length; i++) {
            int[] pair = memo[i];
            int fromCount = pair[0];
            int toCount = pair[1];

            if (fromCount == 0 && toCount == (n - 1)) {
                if (judgeIndex > 0) {
                    return -1;
                }
                judgeIndex = i + 1;
            }
        }

        return judgeIndex;
    }
}
