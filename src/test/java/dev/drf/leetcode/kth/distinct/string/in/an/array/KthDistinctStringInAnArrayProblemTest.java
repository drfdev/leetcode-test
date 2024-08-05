package dev.drf.leetcode.kth.distinct.string.in.an.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthDistinctStringInAnArrayProblemTest {
    private final KthDistinctStringInAnArrayProblem problem = new KthDistinctStringInAnArrayProblem();

    @Test
    void example1() {
        /*
        Input: arr = ["d","b","c","b","c","a"], k = 2
        Output: "a"
         */
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        int k = 2;

        var output = problem.kthDistinct(arr, k);

        assertEquals("a", output);
    }

    @Test
    void example2() {
        /*
        Input: arr = ["aaa","aa","a"], k = 1
        Output: "aaa"
         */
        String[] arr = {"aaa", "aa", "a"};
        int k = 1;

        var output = problem.kthDistinct(arr, k);

        assertEquals("aaa", output);
    }

    @Test
    void example3() {
        /*
        Input: arr = ["a","b","a"], k = 3
        Output: ""
         */
        String[] arr = {"a", "b", "a"};
        int k = 3;

        var output = problem.kthDistinct(arr, k);

        assertEquals("", output);
    }
}
