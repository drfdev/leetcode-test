package dev.drf.leetcode._final.array.state.after.k.multiplication.operations.i;

import dev.drf.leetcode.Problem;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/
 */
public class FinalArrayStateAfterKMultiplicationOperationsIProblem implements Problem {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<MyPair> heap = new PriorityQueue<>(nums.length, MyPair::compare);
        for (int i = 0; i < nums.length; i++) {
            var pair = new MyPair(i, nums[i]);
            heap.add(pair);
        }

        for (int i = 0; i < k; i++) {
            var pair = heap.poll();
            pair.weight *= multiplier;
            heap.add(pair);
        }

        for (MyPair pair : heap) {
            nums[pair.index] = pair.weight;
        }

        return nums;
    }

    private static class MyPair {
        private final int index;
        private int weight;

        public MyPair(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }

        private static int compare(MyPair left, MyPair right) {
            final int lWeight = left.weight;
            final int rWeight = right.weight;

            if (lWeight == rWeight) {
                return Integer.compare(left.index, right.index);
            }

            return Integer.compare(lWeight, rWeight);
        }
    }
}
