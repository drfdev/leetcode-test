package dev.drf.leetcode.decode.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/decode-string/
 */
public class DecodeStringProblem implements Problem {
    public String decodeString(String s) {
        if (s == null) {
            return null;
        }

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (isNumber(ch)) {
                i = buildEncodedString(chars, i, sb);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    private int buildEncodedString(char[] chars, int index, StringBuilder sb) {
        int repeats = 0;
        int currentIndex = index;

        // calculate repeat count
        for (;;currentIndex++) {
            char number = chars[currentIndex];
            if (number == '[') {
                break;
            }
            repeats = repeats * 10 + Character.getNumericValue(number);
        }

        // skip bucket index
        currentIndex++;

        // build repeat part
        StringBuilder repeatPart = new StringBuilder();
        for (;;currentIndex++) {
            char next = chars[currentIndex];
            if (next == ']') {
                break;
            }

            if (isNumber(next)) {
                currentIndex = buildEncodedString(chars, currentIndex, repeatPart);
            } else {
                repeatPart.append(next);
            }
        }

        // skip bucket index
//        currentIndex++;

        // add string with repeats
        for (int i = 0; i < repeats; i++) {
            sb.append(repeatPart);
        }

        return currentIndex;
    }

    private boolean isNumber(char value) {
        return value == '1' || value == '2' || value == '3' || value == '4' || value == '5'
                || value == '6' || value == '7' || value == '8' || value == '9' || value == '0';
    }
}
