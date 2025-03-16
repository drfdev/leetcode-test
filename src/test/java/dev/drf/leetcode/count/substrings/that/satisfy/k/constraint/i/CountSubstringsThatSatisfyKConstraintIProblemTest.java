package dev.drf.leetcode.count.substrings.that.satisfy.k.constraint.i;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSubstringsThatSatisfyKConstraintIProblemTest {
    private final CountSubstringsThatSatisfyKConstraintIProblem problem = new CountSubstringsThatSatisfyKConstraintIProblem();

    @Test
    void example1() {
        // Input: s = "10101", k = 1
        // Output: 12
        String s = "10101";
        int k = 1;

        var out = problem.countKConstraintSubstrings(s, k);

        assertEquals(12, out);
    }

    @Test
    void example2() {
        // Input: s = "1010101", k = 2
        // Output: 25
        String s = "1010101";
        int k = 2;

        var out = problem.countKConstraintSubstrings(s, k);

        assertEquals(25, out);
    }

    @Test
    void example3() {
        // Input: s = "11111", k = 1
        // Output: 15
        String s = "11111";
        int k = 1;

        var out = problem.countKConstraintSubstrings(s, k);

        assertEquals(15, out);
    }
}
