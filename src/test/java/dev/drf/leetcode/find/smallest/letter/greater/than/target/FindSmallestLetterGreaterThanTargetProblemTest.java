package dev.drf.leetcode.find.smallest.letter.greater.than.target;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindSmallestLetterGreaterThanTargetProblemTest {
    private final FindSmallestLetterGreaterThanTargetProblem problem = new FindSmallestLetterGreaterThanTargetProblem();

    @Test
    void example1() {
        /*
        Input: letters = ["c","f","j"], target = "a"
        Output: "c"
         */
        char[] letters = new char[]{
                'c', 'f', 'j'
        };
        char target = 'a';

        char result = problem.nextGreatestLetter(letters, target);

        assertEquals('c', result);
    }

    @Test
    void example2() {
        /*
        Input: letters = ["c","f","j"], target = "c"
        Output: "f"
         */
        char[] letters = new char[]{
                'c', 'f', 'j'
        };
        char target = 'c';

        char result = problem.nextGreatestLetter(letters, target);

        assertEquals('f', result);
    }

    @Test
    void example3() {
        /*
        Input: letters = ["x","x","y","y"], target = "z"
        Output: "x"
         */
        char[] letters = new char[]{
                'x', 'x', 'y', 'y'
        };
        char target = 'z';

        char result = problem.nextGreatestLetter(letters, target);

        assertEquals('x', result);
    }
}
