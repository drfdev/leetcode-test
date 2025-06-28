package dev.drf.leetcode.xor.operation.in.an.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XorOperationInAnArrayProblemTest {
    private final XorOperationInAnArrayProblem problem = new XorOperationInAnArrayProblem();

    @Test
    void example1() {
        // Input: n = 5, start = 0
        // Output: 8
        int n = 5;
        int start = 0;

        var out = problem.xorOperation(n, start);

        assertEquals(8, out);
    }

    @Test
    void example2() {
        // Input: n = 4, start = 3
        // Output: 8
        int n = 4;
        int start = 3;

        var out = problem.xorOperation(n, start);

        assertEquals(8, out);
    }
}
