package dev.drf.leetcode.final_value.of.variable.after.performing.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinalValueOfVariableAfterPerformingOperationsProblemTest {
    private final FinalValueOfVariableAfterPerformingOperationsProblem problem = new FinalValueOfVariableAfterPerformingOperationsProblem();

    @Test
    void example1() {
        /*
        Input: operations = ["--X","X++","X++"]
        Output: 1
         */
        String[] operations = {"--X", "X++", "X++"};

        var out = problem.finalValueAfterOperations(operations);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        /*
        Input: operations = ["++X","++X","X++"]
        Output: 3
         */
        String[] operations = {"++X","++X","X++"};

        var out = problem.finalValueAfterOperations(operations);

        assertEquals(3, out);
    }

    @Test
    void example3() {
        /*
        Input: operations = ["X++","++X","--X","X--"]
        Output: 0
         */
        String[] operations = {"X++","++X","--X","X--"};

        var out = problem.finalValueAfterOperations(operations);

        assertEquals(0, out);
    }
}
