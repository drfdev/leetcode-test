package dev.drf.leetcode.valid.anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramProblemTest {
    private final ValidAnagramProblem problem = new ValidAnagramProblem();

    @Test
    void example1() {
        /*
        Input: s = "anagram", t = "nagaram"
        Output: true
         */
        String s = "anagram";
        String t = "nagaram";

        var result = problem.isAnagram(s, t);

        assertTrue(result);
    }

    @Test
    void example2() {
        /*
        Input: s = "rat", t = "car"
        Output: false
         */
        String s = "rat";
        String t = "car";

        var result = problem.isAnagram(s, t);

        assertFalse(result);
    }
}
