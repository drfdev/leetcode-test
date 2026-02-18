package dev.drf.leetcode.weighted.word.mapping;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/weighted-word-mapping/
 */
public class WeightedWordMappingProblem implements Problem {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            int sum = 0;
            final var chars = word.toCharArray();
            for (char ch : chars) {
                final int index = ch - 'a';
                final int chWeight = weights[index];
                sum += chWeight;
            }

            int value = 26 - sum % 26;
            char chValue = (char) ('a' + value - 1);
            sb.append(chValue);
        }

        return sb.toString();
    }
}
