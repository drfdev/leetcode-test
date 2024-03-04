package dev.drf.leetcode.bag.of.tokens;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/bag-of-tokens/
 * Used solution:
 * https://leetcode.com/problems/bag-of-tokens/solutions/197696/c-java-python-greedy-two-pointers/
 */
public class BagOfTokensProblem implements Problem {
    public int bagOfTokensScore(int[] tokens, int power) {
        final int size = tokens.length;
        if (size == 1) {
            return tokens[0] < power ? 1 : 0;
        }

        Arrays.sort(tokens);

        int minIndex = 0;
        int maxIndex = size - 1;

        int score = 0;
        int point = 0;

        while (minIndex <= maxIndex) {
            int minToken = tokens[minIndex];
            if (minToken <= power) {
                point++;
                score = Math.max(score, point);

                power = power - minToken;
                minIndex++;
            } else if (point > 0) {
                int maxToken = tokens[maxIndex];
                point--;

                power = power + maxToken;
                maxIndex--;
            } else {
                break;
            }
        }

        return score;
    }
}
