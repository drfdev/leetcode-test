package dev.drf.leetcode.trapping.rain.water;

import dev.drf.leetcode.Problem;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWaterProblem implements Problem {
    public int trap(int[] height) {
        if (height == null) {
            return 0;
        }

        int sum = 0;

        Deque<Integer> leftIndexes = new LinkedList<>();
        int rightIndex = 0;

        int previousValue = height[0];

        for (int i = 1; i < height.length; i++) {
            int value = height[i];

            if (value == previousValue) {
                // nothing
            } else if (value > previousValue) {
                // increased
                int prH = previousValue;
                while (!leftIndexes.isEmpty()) {
                    int last = leftIndexes.removeLast();
                    int lastValue = height[last];

                    if (lastValue > value) {
                        if (prH < value) {
                            int h = value - prH;
                            if (h > 0) {
                                int len = i - last - 1;
                                sum = sum + (h * len);
                            }
                        }
                        leftIndexes.add(last);
                        break;
                    } else {
                        int h = lastValue - prH;
                        if (h > 0) {
                            int len = i - last - 1;
                            sum = sum + (h * len);
                        }
                    }

                    prH = lastValue;
                }
            } else {
                // value < previousValue
                leftIndexes.add(i - 1);
            }

            previousValue = value;
        }

        return sum;
    }
}
