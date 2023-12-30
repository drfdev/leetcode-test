package dev.drf.leetcode.redistribute.characters.to.make.all.strings.equal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RedistributeCharactersToMakeAllStringsEqualProblemTest {
    private final RedistributeCharactersToMakeAllStringsEqualProblem problem = new RedistributeCharactersToMakeAllStringsEqualProblem();

    @Test
    void example1() {
        /*
        Input: words = ["abc","aabc","bc"]
        Output: true
         */
        String[] words = new String[]{
                "abc", "aabc", "bc"
        };

        var isEquals = problem.makeEqual(words);

        assertTrue(isEquals);
    }

    @Test
    void example2() {
        /*
        Input: words = ["ab","a"]
        Output: false
         */
        String[] words = new String[]{
                "ab","a"
        };

        var isEquals = problem.makeEqual(words);

        assertFalse(isEquals);
    }
}
