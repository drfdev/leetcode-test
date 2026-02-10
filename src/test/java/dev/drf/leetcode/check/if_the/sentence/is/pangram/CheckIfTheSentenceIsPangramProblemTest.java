package dev.drf.leetcode.check.if_the.sentence.is.pangram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfTheSentenceIsPangramProblemTest {
    private final CheckIfTheSentenceIsPangramProblem problem = new CheckIfTheSentenceIsPangramProblem();

    @Test
    void example1() {
        // Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
        // Output: true
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        var bool = problem.checkIfPangram(sentence);

        assertTrue(bool);
    }

    @Test
    void example2() {
        // Input: sentence = "leetcode"
        // Output: false
        String sentence = "leetcode";

        var bool = problem.checkIfPangram(sentence);

        assertFalse(bool);
    }
}
