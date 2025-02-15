package dev.drf.leetcode.find.the.punishment.number.of.an.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindThePunishmentNumberOfAnIntegerProblemTest {
    private final FindThePunishmentNumberOfAnIntegerProblem problem = new FindThePunishmentNumberOfAnIntegerProblem();

    @Test
    void example1() {
        // Input: n = 10
        // Output: 182
        int n = 10;

        var out = problem.punishmentNumber(n);

        assertEquals(182, out);
    }

    @Test
    void example2() {
        // Input: n = 37
        // Output: 1478
        int n = 37;

        var out = problem.punishmentNumber(n);

        assertEquals(1478, out);
    }

    @Test
    void canPartitionTesting() {
        // 1, 9, 10, 36, 45, 55, 82, 91, 99, 100, 235, 297,
        // 369, 370, 379, 414, 657, 675, 703, 756, 792, 909,
        // 918, 945, 964, 990, 991, 999, 1000
        int val = 964;
        var res = problem.canPartition(val * val, val);
        System.out.println(res);
    }
}
