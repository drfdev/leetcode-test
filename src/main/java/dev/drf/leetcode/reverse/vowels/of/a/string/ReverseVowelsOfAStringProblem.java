package dev.drf.leetcode.reverse.vowels.of.a.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowelsOfAStringProblem implements Problem {
    public String reverseVowels(String s) {
        if (s == null) {
            return null;
        } else if (s.isEmpty()) {
            return s;
        }

        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];

        int leftIndex = 0;
        int rightIndex = chars.length - 1;

        for (; leftIndex <= rightIndex; leftIndex++) {
            char leftCh = chars[leftIndex];
            if (isVowel(leftCh)) {
                if (leftIndex == rightIndex) {
                    result[leftIndex] = leftCh;
                }
                for (; rightIndex >= leftIndex; rightIndex--) {
                    char rightCh = chars[rightIndex];
                    if (leftIndex == rightIndex) {
                        result[rightIndex] = rightCh;
                        break;
                    }
                    if (isVowel(rightCh)) {
                        result[leftIndex] = rightCh;
                        result[rightIndex] = leftCh;
                        rightIndex--;
                        break;
                    } else {
                        result[rightIndex] = rightCh;
                    }
                }
            } else {
                result[leftIndex] = leftCh;
            }
        }

        return new String(result);
    }

    private boolean isVowel(char ch) {
        /*
        The vowels are 'a', 'e', 'i', 'o', and 'u'
         */
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
