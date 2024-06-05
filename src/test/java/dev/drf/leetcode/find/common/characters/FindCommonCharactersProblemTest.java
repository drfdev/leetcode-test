package dev.drf.leetcode.find.common.characters;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class FindCommonCharactersProblemTest {
    private final FindCommonCharactersProblem problem = new FindCommonCharactersProblem();

    @Test
    void example1() {
        /*
        Input: words = ["bella","label","roller"]
        Output: ["e","l","l"]
         */
        String[] words = {"bella", "label", "roller"};

        var result = problem.commonChars(words);

        assertThat(result, containsInAnyOrder(
                "e", "l", "l"
        ));
    }

    @Test
    void example2() {
        /*
        Input: words = ["cool","lock","cook"]
        Output: ["c","o"]
         */
        String[] words = {"cool", "lock", "cook"};

        var result = problem.commonChars(words);

        assertThat(result, containsInAnyOrder(
                "c", "o"
        ));
    }
}
