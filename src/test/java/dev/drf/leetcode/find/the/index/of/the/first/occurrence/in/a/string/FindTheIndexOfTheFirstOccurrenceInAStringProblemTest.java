package dev.drf.leetcode.find.the.index.of.the.first.occurrence.in.a.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheIndexOfTheFirstOccurrenceInAStringProblemTest {
    private final FindTheIndexOfTheFirstOccurrenceInAStringProblem problem = new FindTheIndexOfTheFirstOccurrenceInAStringProblem();

    @Test
    void example1() {
        /*
        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
         */
        String haystack = "sadbutsad";
        String needle = "sad";

        int index = problem.strStr(haystack, needle);

        assertEquals(0, index);
    }

    @Test
    void example2() {
        /*
        Input: haystack = "leetcode", needle = "leeto"
        Output: -1
         */
        String haystack = "leetcode";
        String needle = "leeto";

        int index = problem.strStr(haystack, needle);

        assertEquals(-1, index);
    }

    @Test
    void failed1() {
        // "mississippi"
        // issip
        String haystack = "mississippi";
        String needle = "issip";

        int index = problem.strStr(haystack, needle);

        assertEquals(4, index);
    }

    @Test
    void failed2() {
        // a
        // a
        String haystack = "a";
        String needle = "a";

        int index = problem.strStr(haystack, needle);

        assertEquals(0, index);
    }

    @Test
    void failed3() {
        // abc
        // c
        String haystack = "abc";
        String needle = "c";

        int index = problem.strStr(haystack, needle);

        assertEquals(2, index);
    }
}
