package dev.drf.leetcode.construct.smallest.number.from.di.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructSmallestNumberFromDiStringProblemTest {
    private final ConstructSmallestNumberFromDiStringProblem problem = new ConstructSmallestNumberFromDiStringProblem();

    @Test
    void example1() {
        // Input: pattern = "IIIDIDDD"
        // Output: "123549876"
        var pattern = "IIIDIDDD";

        var output = problem.smallestNumber(pattern);

        assertEquals("123549876", output);
    }

    @Test
    void example2() {
        // Input: pattern = "DDD"
        // Output: "4321"
        var pattern = "DDD";

        var output = problem.smallestNumber(pattern);

        assertEquals("4321", output);
    }
}
