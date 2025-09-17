package dev.drf.leetcode.check.if_two.string.arrays.are.equivalent;

import org.junit.jupiter.api.Test;

public class CheckIfTwoStringArraysAreEquivalentProblemTest {
    private final CheckIfTwoStringArraysAreEquivalentProblem problem = new CheckIfTwoStringArraysAreEquivalentProblem();

    @Test
    void example1() {
        // Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
        // Output: true
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
    }

    @Test
    void example2() {
        // Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
        // Output: false
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
    }

    @Test
    void example3() {
        // Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
        // Output: true
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
    }
}
