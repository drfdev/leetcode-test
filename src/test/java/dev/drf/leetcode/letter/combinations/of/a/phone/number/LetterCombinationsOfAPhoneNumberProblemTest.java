package dev.drf.leetcode.letter.combinations.of.a.phone.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LetterCombinationsOfAPhoneNumberProblemTest {
    private final LetterCombinationsOfAPhoneNumberProblem problem = new LetterCombinationsOfAPhoneNumberProblem();

    @Test
    void example1() {
        /*
        Input: digits = "23"
        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
         */
        String digits = "23";

        var list = problem.letterCombinations(digits);

        assertThat(list, containsInAnyOrder(
                "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
        ));
    }

    @Test
    void example2() {
        /*
        Input: digits = ""
        Output: []
         */
        String digits = "";

        var list = problem.letterCombinations(digits);

        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    void example3() {
        /*
        Input: digits = "2"
        Output: ["a","b","c"]
         */
        String digits = "2";

        var list = problem.letterCombinations(digits);

        assertThat(list, containsInAnyOrder(
                "a", "b", "c"
        ));
    }
}
