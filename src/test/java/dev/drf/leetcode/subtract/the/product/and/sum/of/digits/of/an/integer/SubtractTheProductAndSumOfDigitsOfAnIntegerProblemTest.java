package dev.drf.leetcode.subtract.the.product.and.sum.of.digits.of.an.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerProblemTest {
    private final SubtractTheProductAndSumOfDigitsOfAnIntegerProblem problem = new SubtractTheProductAndSumOfDigitsOfAnIntegerProblem();

    @Test
    void example1() {
        // Input: n = 234
        // Output: 15
        int n = 234;

        int out = problem.subtractProductAndSum(n);

        assertEquals(15, out);
    }

    @Test
    void example2() {
        // Input: n = 4421
        // Output: 21
        int n = 4421;

        int out = problem.subtractProductAndSum(n);

        assertEquals(21, out);
    }
}
