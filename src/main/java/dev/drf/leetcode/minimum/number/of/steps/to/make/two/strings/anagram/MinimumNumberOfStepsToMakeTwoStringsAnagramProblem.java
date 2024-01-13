package dev.drf.leetcode.minimum.number.of.steps.to.make.two.strings.anagram;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
 */
public class MinimumNumberOfStepsToMakeTwoStringsAnagramProblem implements Problem {
    public int minSteps(String s, String t) {
        char[] sChars = s.toCharArray();
        Map<Character, IntCount> map = new HashMap<>();

        for (char sChar : sChars) {
            IntCount cnt = map.get(sChar);
            if (cnt == null) {
                cnt = new IntCount();
                map.put(sChar, cnt);
            }
            cnt.value++;
        }

        char[] tChars = t.toCharArray();

        int diff = 0;
        for (char tChar : tChars) {
            IntCount cnt = map.get(tChar);
            if (cnt == null || cnt.value == 0) {
                diff++;
            } else {
                cnt.value--;
            }
        }

        return diff;
    }

    private static final class IntCount {
        private int value = 0;
    }
}
