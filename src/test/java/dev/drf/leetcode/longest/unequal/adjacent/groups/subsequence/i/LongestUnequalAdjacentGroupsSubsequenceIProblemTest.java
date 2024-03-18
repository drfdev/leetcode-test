package dev.drf.leetcode.longest.unequal.adjacent.groups.subsequence.i;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestUnequalAdjacentGroupsSubsequenceIProblemTest {
    private final LongestUnequalAdjacentGroupsSubsequenceIProblem problem = new LongestUnequalAdjacentGroupsSubsequenceIProblem();

    @Test
    void example1() {
        /*
        Input: words = ["e","a","b"], groups = [0,0,1]
        Output: ["e","b"]
         */
        String[] words = {"e", "a", "b"};
        int[] groups = {0, 0, 1};

        var result = problem.getLongestSubsequence(words, groups);

        List<String> expected = List.of("e", "b");
        assertEquals(expected, result);
    }

    @Test
    void example2() {
        /*
        Input: words = ["a","b","c","d"], groups = [1,0,1,1]
        Output: ["a","b","c"]
         */
        String[] words = {"a", "b", "c", "d"};
        int[] groups = {1, 0, 1, 1};

        var result = problem.getLongestSubsequence(words, groups);

        List<String> expected = List.of("a", "b", "c");
        assertEquals(expected, result);
    }
}
