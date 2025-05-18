package dev.drf.leetcode.number.of.employees.who.met.the.target;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfEmployeesWhoMetTheTargetProblemTest {
    private final NumberOfEmployeesWhoMetTheTargetProblem problem = new NumberOfEmployeesWhoMetTheTargetProblem();

    @Test
    void example1() {
        // Input: hours = [0,1,2,3,4], target = 2
        // Output: 3
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;

        var count = problem.numberOfEmployeesWhoMetTarget(hours, target);

        assertEquals(3, count);
    }

    @Test
    void example2() {
        // Input: hours = [5,1,4,2,2], target = 6
        // Output: 0
        int[] hours = {5, 1, 4, 2, 2};
        int target = 6;

        var count = problem.numberOfEmployeesWhoMetTarget(hours, target);

        assertEquals(0, count);
    }
}
