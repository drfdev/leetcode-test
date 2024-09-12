package dev.drf.leetcode.count.the.number.of.consistent.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheNumberOfConsistentStringsProblemTest {
    private final CountTheNumberOfConsistentStringsProblem problem = new CountTheNumberOfConsistentStringsProblem();

    @Test
    void example1() {
        /*
        Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
        Output: 2
         */
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        var count = problem.countConsistentStrings(allowed, words);

        assertEquals(2, count);
    }

    @Test
    void example2() {
        /*
        Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
        Output: 7
         */
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};

        var count = problem.countConsistentStrings(allowed, words);

        assertEquals(7, count);
    }

    @Test
    void example3() {
        /*
        Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
        Output: 4
         */
        String allowed = "cad";
        String[] words = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};

        var count = problem.countConsistentStrings(allowed, words);

        assertEquals(4, count);
    }
}
