package dev.drf.leetcode.generate.binary.strings.without.adjacent.zeros;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/
 */
public class GenerateBinaryStringsWithoutAdjacentZerosProblem implements Problem {
    public List<String> validStrings(int n) {
        List<String> strings = new ArrayList<>();

        char[] chars = new char[n];
        generateStringsRecursively(strings, chars, 0, n, 'z');

        return strings;
    }

    private void generateStringsRecursively(List<String> strings,
                                            char[] value,
                                            int index,
                                            final int n,
                                            final char prev) {
        if (index == n) {
            strings.add(new String(value));
            return;
        }

        if (prev != '0') {
            value[index] = '0';
            generateStringsRecursively(strings, value, (index + 1), n, '0');
        }
        value[index] = '1';
        generateStringsRecursively(strings, value, (index + 1), n, '1');
    }
}
