package dev.drf.leetcode.find.first.palindromic.string.in.the.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFirstPalindromicStringInTheArrayProblemTest {
    private final FindFirstPalindromicStringInTheArrayProblem problem = new FindFirstPalindromicStringInTheArrayProblem();

    @Test
    void example1() {
        /*
        Input: words = ["abc","car","ada","racecar","cool"]
        Output: "ada"
         */
        String[] words = {"abc", "car", "ada", "racecar", "cool"};

        var out = problem.firstPalindrome(words);

        assertEquals("ada", out);
    }

    @Test
    void example2() {
        /*
        Input: words = ["notapalindrome","racecar"]
        Output: "racecar"
         */
        String[] words = {"notapalindrome", "racecar"};

        var out = problem.firstPalindrome(words);

        assertEquals("racecar", out);
    }

    @Test
    void example3() {
        /*
        Input: words = ["def","ghi"]
        Output: ""
         */
        String[] words = {"def", "ghi"};

        var out = problem.firstPalindrome(words);

        assertEquals("", out);
    }
}
