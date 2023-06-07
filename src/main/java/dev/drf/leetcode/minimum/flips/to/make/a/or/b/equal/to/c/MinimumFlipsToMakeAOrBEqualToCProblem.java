package dev.drf.leetcode.minimum.flips.to.make.a.or.b.equal.to.c;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/
 */
public class MinimumFlipsToMakeAOrBEqualToCProblem implements Problem {
    public int minFlips(int a, int b, int c) {
        ByteInt aByte = calculateFrom(a);
        ByteInt bByte = calculateFrom(b);
        ByteInt cByte = calculateFrom(c);

        final int maxLen = Math.max(aByte.len,
                Math.max(bByte.len, cByte.len));

        int flipCount = 0;

        for (int i = 0; i < maxLen; i++) {
            int aValue = aByte.bytes[i];
            int bValue = bByte.bytes[i];
            int cValue = cByte.bytes[i];

            int iResult = (aValue == 1 || bValue == 1) ? 1 : 0;

            if (cValue != iResult) {
                if (cValue == 0) {
                    flipCount = flipCount
                            + ((aValue != 0) ? 1 : 0)
                            + ((bValue != 0) ? 1 : 0);
                } else {
                    flipCount = flipCount + 1;
                }
            }
        }

        return flipCount;
    }

    private ByteInt calculateFrom(int value) {
        if (value == 0) {
            ByteInt result = new ByteInt();
            result.len = 0;
            return result;
        }
        if (value == 1) {
            ByteInt result = new ByteInt();
            result.len = 1;
            result.bytes[0] = 1;
            return result;
        }

        int cursor = value;
        ByteInt result = new ByteInt();
        while (cursor > 0) {
            boolean isEven = cursor % 2 == 0;
            result.bytes[result.len] = isEven ? 0 : 1;
            result.len++;
            cursor = cursor>>1;
        }
        return result;
    }

    private static class ByteInt {
        private int[] bytes = new int[32];
        private int len;
    }
}
