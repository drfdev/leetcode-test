package dev.drf.leetcode.relative.ranks;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/relative-ranks/
 */
public class RelativeRanksProblem implements Problem {
    public String[] findRelativeRanks(int[] score) {
        int[][] heap = new int[score.length][2];

        for (int i = 0; i < score.length; i++) {
            int sc = score[i];
            heap[i] = new int[]{
                    sc, i
            };
        }

        Arrays.sort(heap, (left, right) -> right[0] - left[0]);
        String[] result = new String[score.length];
        int price = 1;

        for (int[] val : heap) {
//            int value = val[0];
            int index = val[1];

            if (price == 1) {
                result[index] = "Gold Medal";
            } else if (price == 2) {
                result[index] = "Silver Medal";
            } else if (price == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(price);
            }
            price++;
        }

        return result;
    }
}
