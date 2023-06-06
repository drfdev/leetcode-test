package dev.drf.leetcode.largest.rectangle.in.histogram;

import dev.drf.leetcode.Problem;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 * Used solution:
 * https://leetcode.com/problems/largest-rectangle-in-histogram/solutions/28900/short-and-clean-o-n-stack-based-java-solution/
 * Explanation:
 * https://www.geeksforgeeks.org/largest-rectangular-area-in-a-histogram-using-stack/
 */
public class LargestRectangleInHistogramProblem implements Problem {
    public int largestRectangleArea(int[] heights) {
        final int size = heights.length;

        Deque<Integer> indexes = new LinkedList<>();
        int maxArea = 0;

        for (int i = 0; i <= size; i++) {
            int currentHeight = i == size ? 0 : heights[i];

            if (indexes.isEmpty()
                    || currentHeight >= heights[indexes.peek()]) {
                indexes.push(i);
            } else {
                int tp = indexes.pop();
                int index = indexes.isEmpty() ? i : i - 1 - indexes.peek();
                int calculatedArea = heights[tp] * index;
                maxArea = Math.max(maxArea, calculatedArea);
                i--;
            }
        }

        return maxArea;
    }
}
