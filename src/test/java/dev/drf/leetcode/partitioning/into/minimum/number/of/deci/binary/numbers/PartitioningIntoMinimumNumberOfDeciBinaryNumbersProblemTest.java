package dev.drf.leetcode.partitioning.into.minimum.number.of.deci.binary.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersProblemTest {
    private final PartitioningIntoMinimumNumberOfDeciBinaryNumbersProblem problem = new PartitioningIntoMinimumNumberOfDeciBinaryNumbersProblem();

    @Test
    void example1() {
        // Input: n = "32"
        // Output: 3
        String n = "32";

        var out = problem.minPartitions(n);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        // Input: n = "82734"
        // Output: 8
        String n = "82734";

        var out = problem.minPartitions(n);

        assertEquals(8, out);
    }

    @Test
    void example3() {
        // Input: n = "27346209830709182346"
        // Output: 9
        String n = "27346209830709182346";

        var out = problem.minPartitions(n);

        assertEquals(9, out);
    }
}
