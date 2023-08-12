package dev.drf.leetcode.add.binary;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinaryProblem implements Problem {
    private static final char ZERO = '0';
    private static final char FIRST = '1';

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        final int aLen = a.length();
        final int bLen = b.length();

        final int size = Math.max(aLen, bLen);

        int add = 0;
        for (int i = 0; i < size; i++) {
            char ach = ZERO;
            char bch = ZERO;

            int aIndex = aLen - i - 1;
            int bIndex = bLen - i - 1;

            if (aIndex >= 0) {
                ach = a.charAt(aIndex);
            }
            if (bIndex >= 0) {
                bch = b.charAt(bIndex);
            }

            if (ach == ZERO && bch == ZERO) {
                if (add > 0) {
                    result.append(FIRST);
                    add = 0;
                } else {
                    result.append(ZERO);
                }
            } else if (ach == FIRST && bch == FIRST) {
                if (add > 0) {
                    result.append(FIRST);
                } else {
                    result.append(ZERO);
                }
                add = 1;
            } else {
                // if (ach == FIRST || bch == FIRST)
                // 0 + 1 / 1 + 0 = 1
                if (add > 0) {
                    result.append(ZERO);
                    add = 1;
                } else {
                    result.append(FIRST);
                }
            }
        }

        if (add > 0) {
            result.append(FIRST);
        }

        return result.reverse().toString();
    }
}
