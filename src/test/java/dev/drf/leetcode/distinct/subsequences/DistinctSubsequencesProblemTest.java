package dev.drf.leetcode.distinct.subsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctSubsequencesProblemTest {
    private final DistinctSubsequencesProblem problem = new DistinctSubsequencesProblem();

    @Test
    void example1() {
        /*
        Input: s = "rabbbit", t = "rabbit"
        Output: 3
         */
        String s = "rabbbit", t = "rabbit";

        var res = problem.numDistinct(s, t);

        assertEquals(3, res);
    }

    @Test
    void example2() {
        /*
        Input: s = "babgbag", t = "bag"
        Output: 5
         */
        String s = "babgbag", t = "bag";

        var res = problem.numDistinct(s, t);

        assertEquals(5, res);
    }
}
