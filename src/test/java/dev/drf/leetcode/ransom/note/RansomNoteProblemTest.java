package dev.drf.leetcode.ransom.note;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteProblemTest {
    private final RansomNoteProblem problem = new RansomNoteProblem();

    @Test
    void example1() {
        /*
        Input: ransomNote = "a", magazine = "b"
        Output: false
         */
        String ransomNote = "a";
        String magazine = "b";

        var bool = problem.canConstruct(ransomNote, magazine);

        assertFalse(bool);
    }

    @Test
    void example2() {
        /*
        Input: ransomNote = "aa", magazine = "ab"
        Output: false
         */
        String ransomNote = "aa";
        String magazine = "ab";

        var bool = problem.canConstruct(ransomNote, magazine);

        assertFalse(bool);
    }

    @Test
    void example3() {
        /*
        Input: ransomNote = "aa", magazine = "aab"
        Output: true
         */
        String ransomNote = "aa";
        String magazine = "aab";

        var bool = problem.canConstruct(ransomNote, magazine);

        assertTrue(bool);
    }
}
