package dev.drf.leetcode.earliest.time.to.finish.one.task;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/earliest-time-to-finish-one-task/
 */
public class EarliestTimeToFinishOneTaskProblem implements Problem {
    public int earliestTime(int[][] tasks) {
        int res = Integer.MAX_VALUE;

        for (int[] task : tasks) {
            int time = task[0] + task[1];
            res = Math.min(res, time);
        }

        return res;
    }
}
