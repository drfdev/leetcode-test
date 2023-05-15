package dev.drf.leetcode.valid.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeProblemTest {
    private final ValidPalindromeProblem problem = new ValidPalindromeProblem();

    @Test
    void example1() {
        /*
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
         */
        String s = "A man, a plan, a canal: Panama";

        var res = problem.isPalindrome(s);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: s = "race a car"
        Output: false
         */
        String s = "race a car";

        var res = problem.isPalindrome(s);

        assertFalse(res);
    }

    @Test
    void example3() {
        /*
        Input: s = " "
        Output: true
         */
        String s = " ";

        var res = problem.isPalindrome(s);

        assertTrue(res);
    }

    @Test
    void failed1() {
        String s = "0P";

        var res = problem.isPalindrome(s);

        assertFalse(res);
    }
}
