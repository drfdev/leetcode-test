package dev.drf.leetcode.palindrome.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberProblemTest {
    private final PalindromeNumberProblem problem = new PalindromeNumberProblem();

    @Test
    void example1() {
        /*
        Input: x = 121
        Output: true
         */
        int x = 121;

        var bool = problem.isPalindrome(x);

        assertTrue(bool);
    }

    @Test
    void example2() {
        /*
        Input: x = -121
        Output: false
         */
        int x = -121;

        var bool = problem.isPalindrome(x);

        assertFalse(bool);
    }

    @Test
    void example3() {
        /*
        Input: x = 10
        Output: false
         */
        int x = 10;

        var bool = problem.isPalindrome(x);

        assertFalse(bool);
    }
}
