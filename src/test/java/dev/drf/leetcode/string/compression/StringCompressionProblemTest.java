package dev.drf.leetcode.string.compression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionProblemTest {
    private final StringCompressionProblem problem = new StringCompressionProblem();

    private void assertArrayStarts(char[] chars, char... values) {
        for (int i = 0; i < values.length; i++) {
            assertEquals(values[i], chars[i]);
        }
    }

    @Test
    void example1() {
        /*
        Input: chars = ["a","a","b","b","c","c","c"]
        Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
        Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
         */
        char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int value = problem.compress(chars);

        assertEquals(6, value);
        assertArrayStarts(chars, 'a', '2', 'b', '2', 'c', '3');
    }

    @Test
    void example2() {
        /*
        Input: chars = ["a"]
        Output: Return 1, and the first character of the input array should be: ["a"]
        Explanation: The only group is "a", which remains uncompressed since it's a single character.
         */
        char[] chars = new char[]{'a'};

        int value = problem.compress(chars);

        assertEquals(1, value);
        assertArrayStarts(chars, 'a');
    }

    @Test
    void example3() {
        /*
        Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
        Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
        Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
         */
        char[] chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};

        int value = problem.compress(chars);

        assertEquals(4, value);
        assertArrayStarts(chars, 'a', 'b', '1', '2');
    }

    @Test
    void myTest1() {
        char[] chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c', 'c'};

        int value = problem.compress(chars);

        assertEquals(6, value);
        assertArrayStarts(chars, 'a', 'b', '1', '2', 'c', '2');
    }

    @Test
    void failed1() {
        // "o","o","o","o","o","o","o","o","o","o"

        char[] chars = new char[]{'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'};

        int value = problem.compress(chars);

        assertEquals(3, value);
        assertArrayStarts(chars, 'o', '1', '0');
    }
}
