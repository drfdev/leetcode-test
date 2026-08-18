package dev.drf.leetcode.check.if_a.string.is.an.acronym.of.words;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfAStringIsAnAcronymOfWordsProblemTest {
    private final CheckIfAStringIsAnAcronymOfWordsProblem problem = new CheckIfAStringIsAnAcronymOfWordsProblem();

    @Test
    void example1() {
        // Input: words = ["alice","bob","charlie"], s = "abc"
        // Output: true
        List<String> words = List.of("alice", "bob", "charlie");
        String s = "abc";

        boolean res = problem.isAcronym(words, s);

        assertTrue(res);
    }

    @Test
    void example2() {
        // Input: words = ["an","apple"], s = "a"
        // Output: false
        List<String> words = List.of("an", "apple");
        String s = "a";

        boolean res = problem.isAcronym(words, s);

        assertFalse(res);
    }

    @Test
    void example3() {
        // Input: words = ["never","gonna","give","up","on","you"], s = "ngguoy"
        // Output: true
        List<String> words = List.of("never", "gonna", "give", "up", "on", "you");
        String s = "ngguoy";

        boolean res = problem.isAcronym(words, s);

        assertTrue(res);
    }
}
