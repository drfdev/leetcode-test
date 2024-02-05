package dev.drf.leetcode.custom.sort.string;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/custom-sort-string/
 */
public class CustomSortStringProblem implements Problem {
    public String customSortString(String order, String s) {
        Map<Character, Integer> orderMap = new HashMap<>();

        char[] orderChars = order.toCharArray();
        for (int i = 0; i < orderChars.length; i++) {
            char ch = orderChars[i];
            if (!orderMap.containsKey(ch)) {
                orderMap.put(ch, i);
            }
        }

        Character[] chars = new Character[s.length()];
        char[] vls = s.toCharArray();
        for (int i = 0; i < vls.length; i++) {
            char ch = vls[i];
            chars[i] = ch;
        }
        Arrays.sort(chars, Comparator.comparing(ch -> orderMap.containsKey(ch)
                ? orderMap.get(ch)
                : 100 + ch));

        StringBuilder sb = new StringBuilder();
        for (Character ch : chars) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
