package dev.drf.leetcode.smallest.number.in.infinite.set;

import dev.drf.leetcode.Problem;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/smallest-number-in-infinite-set/
 */
public class SmallestNumberInInfiniteSetProblem implements Problem {
    public static class SmallestInfiniteSet {
        private final PriorityQueue<Integer> addedBackValues = new PriorityQueue<>();
        private int cursor = 1;

        public SmallestInfiniteSet() {

        }

        public int popSmallest() {
            if (!addedBackValues.isEmpty()) {
                return addedBackValues.poll();
            }
            return cursor++;
        }

        public void addBack(int num) {
            if (num < cursor && !addedBackValues.contains(num)) {
                addedBackValues.offer(num);
            }
        }
    }
}
