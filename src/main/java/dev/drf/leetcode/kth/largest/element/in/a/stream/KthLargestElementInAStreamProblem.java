package dev.drf.leetcode.kth.largest.element.in.a.stream;

import dev.drf.leetcode.Problem;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/
 */
public class KthLargestElementInAStreamProblem implements Problem {
    public static class KthLargest {
        private final int k;
        private final PriorityQueue<Integer> queue;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            this.queue = new PriorityQueue<>(Integer::compareTo);
            for (int num : nums) {
                this.add(num);
            }
        }

        public int add(int val) {
            if (queue.size() < k) {
                queue.offer(val);
            } else if (val > queue.peek()) {
                queue.poll();
                queue.add(val);
            }
            return queue.peek();
        }
    }
}
