package dev.drf.leetcode.find.words.containing.character;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindWordsContainingCharacterProblemTest {
    private final FindWordsContainingCharacterProblem problem = new FindWordsContainingCharacterProblem();

    @Test
    void example1() {
        // Input: words = ["leet","code"], x = "e"
        // Output: [0,1]
        String[] words = {"leet", "code"};
        char x = 'e';

        var out = problem.findWordsContaining(words, x);
        assertThat(out, containsInAnyOrder(
                equalTo(0),
                equalTo(1)
        ));
    }

    @Test
    void example2() {
        // Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
        // Output: [0,2]
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';

        var out = problem.findWordsContaining(words, x);
        assertThat(out, containsInAnyOrder(
                equalTo(0),
                equalTo(2)
        ));
    }

    @Test
    void example3() {
        // Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
        // Output: []
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'z';

        var out = problem.findWordsContaining(words, x);
        assertTrue(out.isEmpty());
    }
}
