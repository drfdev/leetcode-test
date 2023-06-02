package dev.drf.leetcode.kth.largest.element.in.an.array;

import dev.drf.leetcode.Problem;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestElementInAnArrayProblem implements Problem {
    public int findKthLargest(int[] nums, int k) {
        // You must solve it in O(n) time complexity.
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            priorityQueue.offer(value);

            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        return priorityQueue.peek();
    }
}
