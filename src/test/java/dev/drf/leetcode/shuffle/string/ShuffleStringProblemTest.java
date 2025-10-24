package dev.drf.leetcode.shuffle.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShuffleStringProblemTest {
    private final ShuffleStringProblem problem = new ShuffleStringProblem();

    @Test
    void example1() {
        // Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        // Output: "leetcode"
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        var out = problem.restoreString(s, indices);

        assertEquals("leetcode", out);
    }

    @Test
    void example2() {
        // Input: s = "abc", indices = [0,1,2]
        // Output: "abc"
        String s = "abc";
        int[] indices = {0, 1, 2};

        var out = problem.restoreString(s, indices);

        assertEquals("abc", out);
    }
}
