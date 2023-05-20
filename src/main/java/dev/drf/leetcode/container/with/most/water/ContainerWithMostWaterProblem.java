package dev.drf.leetcode.container.with.most.water;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWaterProblem implements Problem {
    public int maxArea(int[] height) {
        if (height == null) {
            return 0;
        }

        int leftIndex = 0;
        int rightIndex = height.length - 1;

        int maxArea = -1;

        while (leftIndex < rightIndex) {
            int left = height[leftIndex];
            int right = height[rightIndex];

            int area = Math.min(left, right) * (rightIndex - leftIndex);
            if (area > maxArea) {
                maxArea = area;
            }

            // Used:
            // https://leetcode.com/problems/container-with-most-water/solutions/1915172/java-c-easiest-explanations/
            if(left < right) {
                leftIndex++;
            } else if(left > right) {
                rightIndex--;
            } else {
                leftIndex++;
                rightIndex--;
            }
        }

        return maxArea;
    }
}
