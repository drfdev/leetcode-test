package dev.drf.leetcode.longest.common.prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixProblemTest {
    private final LongestCommonPrefixProblem problem = new LongestCommonPrefixProblem();

    @Test
    void example1() {
        /*
        Input: strs = ["flower","flow","flight"]
        Output: "fl"
         */
        var strs = new String[]{"flower", "flow", "flight"};

        var res = problem.longestCommonPrefix(strs);

        assertEquals("fl", res);
    }

    @Test
    void example2() {
        /*
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
         */
        var strs = new String[]{"dog", "racecar", "car"};

        var res = problem.longestCommonPrefix(strs);

        assertEquals("", res);
    }
}
