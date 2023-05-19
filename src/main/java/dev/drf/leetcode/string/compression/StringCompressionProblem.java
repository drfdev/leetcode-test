package dev.drf.leetcode.string.compression;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/string-compression/
 */
public class StringCompressionProblem implements Problem {
    public int compress(char[] chars) {
        if (chars == null) {
            return 0;
        }

        char ch = chars[0];
        int counter = 1;
        int cursor = 1;

        for (int i = 1; i < chars.length; i++) {
            char value = chars[i];
            if (value == ch) {
                counter++;
            } else {
                int counterChars = getNumber(counter);
                if (counterChars > 0) {
                    if (counterChars > 1) {
                        int res = counter;
                        cursor = cursor + counterChars;
                        for (int k = 0; k < counterChars; k++) {
                            char val = Character.forDigit(res % 10, 10);
                            chars[cursor - k - 1] = val;
                            res = res / 10;
                        }
                    } else {
                        chars[cursor] = Character.forDigit(counter, 10);
                        cursor++;
                    }
                }

                counter = 1;
                ch = value;

                chars[cursor] = value;
                cursor++;
            }
        }

        // last iteration
        int counterChars = getNumber(counter);
        if (counterChars > 0) {
            if (counterChars > 1) {
                int res = counter;
                cursor = cursor + counterChars;
                for (int k = 0; k < counterChars; k++) {
                    char val = Character.forDigit(res % 10, 10);
                    chars[cursor - k - 1] = val;
                    res = res / 10;
                }
            } else {
                chars[cursor] = Character.forDigit(counter, 10);
                cursor++;
            }
        }

        return cursor;
    }

    private int getNumber(int counter) {
        if (counter == 1) {
            return 0;
        } else if (counter < 10) {
            return 1;
        }
        int res = 0;
        while (counter > 9) {
            counter = counter / 10;
            res++;
        }
        res++;
        return res;
    }
}
