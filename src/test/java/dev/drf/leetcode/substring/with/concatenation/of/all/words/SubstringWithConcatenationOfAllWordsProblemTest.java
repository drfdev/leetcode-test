package dev.drf.leetcode.substring.with.concatenation.of.all.words;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubstringWithConcatenationOfAllWordsProblemTest {
    private final SubstringWithConcatenationOfAllWordsProblem problem = new SubstringWithConcatenationOfAllWordsProblem();

    @Test
    void example1() {
        /*
        Input: s = "barfoothefoobarman", words = ["foo","bar"]
        Output: [0,9]
         */
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        var out = problem.findSubstring(s, words);

        assertThat(out, contains(0, 9));
    }

    @Test
    void example2() {
        /*
        Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
        Output: []
         */
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};

        var out = problem.findSubstring(s, words);

        assertTrue(out.isEmpty());
    }

    @Test
    void example3() {
        /*
        Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
        Output: [6,9,12]
         */
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};

        var out = problem.findSubstring(s, words);

        assertThat(out, contains(6, 9, 12));
    }
}
