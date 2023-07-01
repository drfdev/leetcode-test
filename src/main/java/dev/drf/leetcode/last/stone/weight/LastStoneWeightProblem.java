package dev.drf.leetcode.last.stone.weight;

import dev.drf.leetcode.Problem;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/last-stone-weight/
 */
public class LastStoneWeightProblem implements Problem {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            heap.add(stone);
        }

        int stone1;
        int stone2;

        while (!heap.isEmpty()) {
            stone1 = heap.poll();
            if (heap.isEmpty()) {
                return stone1;
            }
            stone2 = heap.poll();

            int newStone = Math.abs(stone2 - stone1);
            if (newStone > 0) {
                heap.add(newStone);
            }
        }

        return 0;
    }
}
