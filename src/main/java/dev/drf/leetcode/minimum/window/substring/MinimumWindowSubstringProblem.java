package dev.drf.leetcode.minimum.window.substring;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/minimum-window-substring/
 * Used solution:
 * https://leetcode.com/problems/minimum-window-substring/solutions/26810/java-solution-using-two-pointers-hashmap/
 */
public class MinimumWindowSubstringProblem implements Problem {
    public String minWindow(String s, String t) {
        if (s == null || s.length() < t.length() || s.length() == 0) {
            return "";
        }

        final int tSize = t.length();
        final int sSize = s.length();

        HashMap<Character, Counter> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            Counter counter = map.get(c);
            if (counter == null) {
                counter = new Counter();
                map.put(c, counter);
            }
            counter.value++;
        }

        int left = 0;
        int minLeft = 0;
        int minLen = sSize + 1;
        int count = 0;

        for (int right = 0; right < sSize; right++) {
            char rightChar = s.charAt(right);

            if (map.containsKey(rightChar)) {
                Counter rightCounter = map.get(rightChar);
                rightCounter.value--;

                if (rightCounter.value >= 0) {
                    count++;
                }

                while (count == tSize) {
                    if (right - left + 1 < minLen) {
                        minLeft = left;
                        minLen = right - left + 1;
                    }
                    char leftChar = s.charAt(left);

                    if (map.containsKey(leftChar)) {
                        Counter leftCounter = map.get(leftChar);
                        leftCounter.value++;
                        if (leftCounter.value > 0) {
                            count--;
                        }
                    }

                    left++;
                }
            }
        }
        if (minLen > sSize) {
            return "";
        }

        return s.substring(minLeft, minLeft + minLen);
    }

    private static class Counter {
        private int value = 0;
    }
}
