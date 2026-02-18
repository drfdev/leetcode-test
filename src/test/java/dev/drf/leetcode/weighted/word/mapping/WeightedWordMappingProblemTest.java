package dev.drf.leetcode.weighted.word.mapping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightedWordMappingProblemTest {
    private final WeightedWordMappingProblem problem = new WeightedWordMappingProblem();

    @Test
    void example1() {
        // Input: words = ["abcd","def","xyz"], weights = [5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2]
        // Output: "rij"
        String[] words = {"abcd", "def", "xyz"};
        int[] weights = {5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2};

        var out = problem.mapWordWeights(words, weights);

        assertEquals("rij", out);
    }

    @Test
    void example2() {
        // Input: words = ["a","b","c"], weights = [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
        // Output: "yyy"
        String[] words = {"a", "b", "c"};
        int[] weights = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        var out = problem.mapWordWeights(words, weights);

        assertEquals("yyy", out);
    }

    @Test
    void example3() {
        // Input: words = ["abcd"], weights = [7,5,3,4,3,5,4,9,4,2,2,7,10,2,5,10,6,1,2,2,4,1,3,4,4,5]
        // Output: "g"
        String[] words = {"abcd"};
        int[] weights = {7, 5, 3, 4, 3, 5, 4, 9, 4, 2, 2, 7, 10, 2, 5, 10, 6, 1, 2, 2, 4, 1, 3, 4, 4, 5};

        var out = problem.mapWordWeights(words, weights);

        assertEquals("g", out);
    }
}
