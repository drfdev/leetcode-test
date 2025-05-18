package dev.drf.leetcode.number.of.employees.who.met.the.target;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/number-of-employees-who-met-the-target/
 */
public class NumberOfEmployeesWhoMetTheTargetProblem implements Problem {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }
        return count;
    }
}
