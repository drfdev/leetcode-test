package dev.drf.leetcode.reverse.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringProblemTest {
    private final ReverseStringProblem problem = new ReverseStringProblem();

    @Test
    void example1() {
        /*
        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]
         */
        char[] s = new char[]{
                'h', 'e', 'l', 'l', 'o'
        };

        problem.reverseString(s);

        assertEquals('o', s[0]);
        assertEquals('l', s[1]);
        assertEquals('l', s[2]);
        assertEquals('e', s[3]);
        assertEquals('h', s[4]);
    }

    @Test
    void example2() {
        /*
        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]
         */
        char[] s = new char[]{
                'H', 'a', 'n', 'n', 'a', 'h'
        };

        problem.reverseString(s);

        assertEquals('h', s[0]);
        assertEquals('a', s[1]);
        assertEquals('n', s[2]);
        assertEquals('n', s[3]);
        assertEquals('a', s[4]);
        assertEquals('H', s[5]);
    }

    @Test
    void failed1() {
        // ["A"," ","m","a","n",","," ","a"," ","p","l","a","n",","," ","a"," ","c","a","n","a","l",":"," ","P","a","n","a","m","a"]
        // ["a","m","a","n","a","P"," ",":","l","a","n","a","c"," ","a"," ",",","n","a","l","p"," ","a"," ",",","n","a","m"," ","A"]
        char[] s = new char[]{
                'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'
        };

        problem.reverseString(s);

        var expected = new char[]{
                'a', 'm', 'a', 'n', 'a', 'P', ' ', ':', 'l', 'a', 'n', 'a', 'c', ' ', 'a', ' ', ',', 'n', 'a', 'l', 'p', ' ', 'a', ' ', ',', 'n', 'a', 'm', ' ', 'A'
        };
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], s[i]);
        }
    }
}
