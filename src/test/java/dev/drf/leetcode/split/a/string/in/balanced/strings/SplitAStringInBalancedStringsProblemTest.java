package dev.drf.leetcode.split.a.string.in.balanced.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitAStringInBalancedStringsProblemTest {
    private final SplitAStringInBalancedStringsProblem problem = new SplitAStringInBalancedStringsProblem();

    @Test
    void example1() {
        // Input: s = "RLRRLLRLRL"
        // Output: 4
        var s = "RLRRLLRLRL";

        var out = problem.balancedStringSplit(s);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        // Input: s = "RLRRRLLRLL"
        // Output: 2
        var s = "RLRRRLLRLL";

        var out = problem.balancedStringSplit(s);

        assertEquals(2, out);
    }

    @Test
    void example3() {
        // Input: s = "LLLLRRRR"
        // Output: 1
        var s = "LLLLRRRR";

        var out = problem.balancedStringSplit(s);

        assertEquals(1, out);
    }
}
