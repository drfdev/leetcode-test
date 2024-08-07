package dev.drf.leetcode.maximum.repeating.substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumRepeatingSubstringProblemTest {
    private final MaximumRepeatingSubstringProblem problem = new MaximumRepeatingSubstringProblem();

    @Test
    void example1() {
        /*
        Input: sequence = "ababc", word = "ab"
        Output: 2
         */
        String sequence = "ababc", word = "ab";

        var res = problem.maxRepeating(sequence, word);

        assertEquals(2, res);
    }

    @Test
    void example2() {
        /*
        Input: sequence = "ababc", word = "ba"
        Output: 1
         */
        String sequence = "ababc", word = "ba";

        var res = problem.maxRepeating(sequence, word);

        assertEquals(1, res);
    }

    @Test
    void example3() {
        /*
        Input: sequence = "ababc", word = "ac"
        Output: 0
         */
        String sequence = "ababc", word = "ac";

        var res = problem.maxRepeating(sequence, word);

        assertEquals(0, res);
    }
}
