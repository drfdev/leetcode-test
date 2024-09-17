package dev.drf.leetcode.uncommon.words.from.two.sentences;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

public class UncommonWordsFromTwoSentencesProblemTest {
    private final UncommonWordsFromTwoSentencesProblem problem = new UncommonWordsFromTwoSentencesProblem();

    @Test
    void example1() {
        /*
        Input: s1 = "this apple is sweet", s2 = "this apple is sour"
        Output: ["sweet","sour"]
         */
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        var out = problem.uncommonFromSentences(s1, s2);

        var result = Arrays.asList(out);
        assertThat(result, containsInAnyOrder(
                equalTo("sweet"),
                equalTo("sour")
        ));
    }

    @Test
    void example2() {
        /*
        Input: s1 = "apple apple", s2 = "banana"
        Output: ["banana"]
         */
        String s1 = "apple apple";
        String s2 = "banana";

        var out = problem.uncommonFromSentences(s1, s2);

        var result = Arrays.asList(out);
        assertThat(result, containsInAnyOrder(
                equalTo("banana")
        ));
    }
}
