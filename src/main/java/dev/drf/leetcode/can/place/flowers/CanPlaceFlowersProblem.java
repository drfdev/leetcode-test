package dev.drf.leetcode.can.place.flowers;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/can-place-flowers/
 */
public class CanPlaceFlowersProblem implements Problem {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowersLeft = n;

//        final int plant = 1;
        final int empty = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            int flowerPlot = flowerbed[i];
            if (empty == flowerPlot) {
                int previous = i - 1;
                int next = i + 1;

                boolean emptyPrevious = previous < 0 ? true : flowerbed[previous] == empty;
                boolean emptyNext = next < flowerbed.length ? flowerbed[next] == empty : true;

                if (emptyPrevious && emptyNext) {
                    // planted
                    flowersLeft --;
                    i ++;
                }

                if (flowersLeft <= 0) {
                    return true;
                }
            }
        }

        return flowersLeft <= 0;
    }
}
