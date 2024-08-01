package dev.drf.leetcode.sort.the.people;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/sort-the-people/
 */
public class SortThePeopleProblem implements Problem {
    public String[] sortPeople(String[] names, int[] heights) {
        final int n = heights.length;
        final Map<Integer, Integer> mapping = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = heights[i];
            mapping.put(value, i);
        }

        Arrays.sort(heights);

        String[] result = new String[n];
        for (int i = n - 1; i >= 0; i--) {
            int value = heights[i];
            int index = mapping.get(value);

            result[n - 1 - i] = names[index];
        }
        return result;
    }
}
