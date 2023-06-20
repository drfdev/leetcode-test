package dev.drf.leetcode.sliding.window.maximum;

import dev.drf.leetcode.Problem;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/sliding-window-maximum/
 * Used solution:
 * https://leetcode.com/problems/sliding-window-maximum/solutions/65884/java-o-n-solution-using-deque-with-explanation/
 */
public class SlidingWindowMaximumProblem2 implements Problem {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }

        final int size = nums.length;
        int[] result = new int[size - k + 1];
        int resultIndex = 0;

        Deque<Integer> indexes = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!indexes.isEmpty() && indexes.peek() < i - k + 1) {
                indexes.poll();
            }

            while (!indexes.isEmpty() && nums[indexes.peekLast()] < nums[i]) {
                indexes.pollLast();
            }

            indexes.offer(i);
            if (i >= k - 1) {
                result[resultIndex++] = nums[indexes.peek()];
            }
        }
        return result;
    }
}
