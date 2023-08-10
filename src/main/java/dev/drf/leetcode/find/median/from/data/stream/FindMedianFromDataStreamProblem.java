package dev.drf.leetcode.find.median.from.data.stream;

import dev.drf.leetcode.Problem;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/find-median-from-data-stream/
 * Used solution:
 * https://www.youtube.com/watch?v=itmhHWaHupI
 */
public class FindMedianFromDataStreamProblem implements Problem {
    public static class MedianFinder {
        private final Queue<Integer> minHeap;
        private final Queue<Integer> maxHeap;

        public MedianFinder() {
            this.minHeap = new PriorityQueue<>((left, right) -> right - left);
            this.maxHeap = new PriorityQueue<>((left, right) -> left - right);
        }

        public void addNum(int num) {
            minHeap.add(num);
            if (minHeap.size() - maxHeap.size() > 1
                    || (!maxHeap.isEmpty() && minHeap.peek() > maxHeap.peek())) {
                maxHeap.add(minHeap.poll());
            }
            if (maxHeap.size() - minHeap.size() > 1) {
                minHeap.add(maxHeap.poll());
            }
        }

        public double findMedian() {
            if (minHeap.size() == maxHeap.size()) {
                return (double) (maxHeap.peek() + minHeap.peek()) / 2;
            } else if (minHeap.size() > maxHeap.size()) {
                return (double) minHeap.peek();
            } else {
                return (double) maxHeap.peek();
            }
        }
    }
}
