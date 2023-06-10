package dev.drf.leetcode.edit.distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditDistanceProblemTest {
    private final EditDistanceProblem problem = new EditDistanceProblem();

    @Test
    void example1() {
        /*
        Input: word1 = "horse", word2 = "ros"
        Output: 3
         */
        String word1 = "horse", word2 = "ros";

        var dist = problem.minDistance(word1, word2);

        assertEquals(3, dist);
    }

    @Test
    void example2() {
        /*
        Input: word1 = "intention", word2 = "execution"
        Output: 5
         */
        String word1 = "intention", word2 = "execution";

        var dist = problem.minDistance(word1, word2);

        assertEquals(5, dist);
    }
}
