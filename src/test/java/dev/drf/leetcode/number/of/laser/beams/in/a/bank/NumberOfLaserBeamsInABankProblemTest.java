package dev.drf.leetcode.number.of.laser.beams.in.a.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfLaserBeamsInABankProblemTest {
    private final NumberOfLaserBeamsInABankProblem problem = new NumberOfLaserBeamsInABankProblem();

    @Test
    void example1() {
        // Input: bank = ["011001","000000","010100","001000"]
        // Output: 8
        String[] bank = {"011001", "000000", "010100", "001000"};

        var out = problem.numberOfBeams(bank);

        assertEquals(8, out);
    }

    @Test
    void example2() {
        // Input: bank = ["000","111","000"]
        // Output: 0
        String[] bank = {"000", "111", "000"};

        var out = problem.numberOfBeams(bank);

        assertEquals(0, out);
    }
}
