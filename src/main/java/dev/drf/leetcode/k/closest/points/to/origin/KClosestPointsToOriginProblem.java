package dev.drf.leetcode.k.closest.points.to.origin;

import dev.drf.leetcode.Problem;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
public class KClosestPointsToOriginProblem implements Problem {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(this::comparePoints);

        for (int[] point : points) {
            if (queue.size() < k) {
                queue.offer(point);
            } else if (comparePoints(point, queue.peek()) > 0) {
                queue.poll();
                queue.add(point);
            }
        }

        int[][] result = new int[k][];
        return queue.toArray(result);
    }

    private int comparePoints(int[] left, int[] right) {
        if (left == null && right == null) {
            return 0;
        }
        if (left == null) {
            return -1;
        }
        if (right == null) {
            return 1;
        }

        long leftValue = ((long) left[0]) * left[0] + ((long) left[1]) * left[1];
        long rightValue = ((long) right[0]) * right[0] + ((long) right[1]) * right[1];;

        if (leftValue == rightValue) {
            return 0;
        }

//        return (leftValue < rightValue) ? -1 : 1;
        return (leftValue < rightValue) ? 1 : -1;
    }
}
