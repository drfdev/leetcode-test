package dev.drf.leetcode.candy;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/candy/
 * Used solution:
 * https://www.youtube.com/watch?v=1IzCRCcK17A
 */
public class CandyProblem implements Problem {
    public int candy(int[] ratings) {
        if (ratings == null) {
            return 0;
        }
        if (ratings.length == 1) {
            return 1;
        }

        final int size = ratings.length;
        int[] result = new int[size];

        Arrays.fill(result, 1);

        // left to right
        for (int i = 1; i < size; i++) {
            int value = ratings[i];
            int neighbor = ratings[i - 1];

            if (value > neighbor) {
                result[i] = result[i - 1] + 1;
            }
        }

        // right to left
        for (int j = size - 2; j >= 0; j--) {
            int value = ratings[j];
            int neighbor = ratings[j + 1];

            if (value > neighbor) {
                result[j] = Math.max(result[j + 1] + 1, result[j]);
            }
        }

        return Arrays.stream(result)
                .sum();
    }
}
