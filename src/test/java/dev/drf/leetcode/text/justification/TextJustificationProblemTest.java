package dev.drf.leetcode.text.justification;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class TextJustificationProblemTest {
    private final TextJustificationProblem problem = new TextJustificationProblem();

    @Test
    void example1() {
        /*
        Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
        Output:
        [
           "This    is    an",
           "example  of text",
           "justification.  "
        ]
         */
        String[] words = new String[]{
                "This", "is", "an", "example", "of", "text", "justification."
        };
        int maxWidth = 16;

        var out = problem.fullJustify(words, maxWidth);

        assertThat(out, contains(
                "This    is    an",
                "example  of text",
                "justification.  "
        ));
    }

    @Test
    void example2() {
        /*
        Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
        Output:
        [
          "What   must   be",
          "acknowledgment  ",
          "shall be        "
        ]
         */
        String[] words = new String[]{
                "What", "must", "be", "acknowledgment", "shall", "be"
        };
        int maxWidth = 16;

        var out = problem.fullJustify(words, maxWidth);

        assertThat(out, contains(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
        ));
    }
}
