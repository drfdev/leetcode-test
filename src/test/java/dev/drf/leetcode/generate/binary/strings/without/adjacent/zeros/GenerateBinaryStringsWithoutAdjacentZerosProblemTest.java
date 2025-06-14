package dev.drf.leetcode.generate.binary.strings.without.adjacent.zeros;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class GenerateBinaryStringsWithoutAdjacentZerosProblemTest {
    private final GenerateBinaryStringsWithoutAdjacentZerosProblem problem = new GenerateBinaryStringsWithoutAdjacentZerosProblem();

    @Test
    void example1() {
        // Input: n = 3
        // Output: ["010","011","101","110","111"]
        int n = 3;

        var out = problem.validStrings(n);

        assertThat(out, containsInAnyOrder(
                "010",
                "011",
                "101",
                "110",
                "111"
        ));
    }

    @Test
    void example2() {
        // Input: n = 1
        // Output: ["0","1"]
        int n = 1;

        var out = problem.validStrings(n);

        assertThat(out, containsInAnyOrder(
                "0", "1"
        ));
    }
}
