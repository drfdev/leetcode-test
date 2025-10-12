package dev.drf.leetcode.construct.smallest.number.from.di.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/construct-smallest-number-from-di-string/
 */
public class ConstructSmallestNumberFromDiStringProblem implements Problem {
    private static final char ACTION_I = 'I';
    private static final char ACTION_D = 'D';

    public String smallestNumber(String pattern) {
        final char[] patterns = pattern.toCharArray();
        final char[] chars = new char[patterns.length + 1];
        final boolean[] used = new boolean[10];

        // If pattern[i] == 'I', then num[i] < num[i + 1].
        // If pattern[i] == 'D', then num[i] > num[i + 1].

        setCharByIndex(chars, 0, used, '1');
        for (int p = 0; p < patterns.length; p++) {
            char action = patterns[p];
            int index = p;
            int pr = charToInt(chars[index]);

            if (action == ACTION_I) {
                // increment
                // num[i] < num[i + 1]
                int nextInt = (pr + 1);
                while (isUsed(used, intToChar(nextInt))) {
                    nextInt = nextInt + 1;
                }

                setCharByIndex(chars, (index + 1), used, intToChar(nextInt));
            } else if (action == ACTION_D) {
                // decrement
                // num[i] > num[i + 1]
                int nextInt = (pr - 1);
                if (nextInt < 1 || isUsed(used, intToChar(nextInt))) {
                    // backtrack
                    int backIndex = p - 1;
                    while (backIndex >= 0 && patterns[backIndex] == ACTION_D) {
                        backIndex--;
                    }

                    int backValue = charToInt(chars[backIndex + 1]);
                    do {
                        backValue = backValue + 1;
                    } while (isUsed(used, intToChar(backValue)));

                    // insert into index and move other:
                    System.arraycopy(chars, (backIndex + 1), chars, (backIndex + 2), (p - backIndex));
                    setCharByIndex(chars, (backIndex + 1), used, intToChar(backValue));
                } else {
                    setCharByIndex(chars, (index + 1), used, intToChar(nextInt));
                }
            }
        }

        return new String(chars);
    }

    private void setUse(boolean[] used, char ch) {
        used[charToIndex(ch)] = true;
    }

    private void unsetUse(boolean[] used, char ch) {
        used[charToIndex(ch)] = false;
    }

    private boolean isUsed(boolean[] used, char ch) {
        return used[charToIndex(ch)];
    }

    private int charToIndex(char ch) {
        return (ch - '1');
    }

    private int charToInt(char ch) {
        return (ch - '0');
    }

    private char intToChar(int value) {
        return (char) ('0' + value);
    }

    private void setCharByIndex(final char[] chars,
                                int index,
                                boolean[] used,
                                char ch) {
        chars[index] = ch;
        setUse(used, ch);
    }
}
