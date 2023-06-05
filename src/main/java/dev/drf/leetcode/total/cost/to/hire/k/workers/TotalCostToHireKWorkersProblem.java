package dev.drf.leetcode.total.cost.to.hire.k.workers;

import dev.drf.leetcode.Problem;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/total-cost-to-hire-k-workers/
 * Used solution:
 * https://leetcode.com/problems/total-cost-to-hire-k-workers/solutions/2783277/priority-queue-easy-easy-to-understand/
 */
public class TotalCostToHireKWorkersProblem implements Problem {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<CostPair> pq = new PriorityQueue<>((a, b) ->
                a.cost != b.cost
                        ? a.cost - b.cost
                        : a.index - b.index
        );

        int size = costs.length;
        int leftIndex = 0;
        int rightIndex = size - 1;
        for (; leftIndex <= rightIndex && leftIndex < candidates; leftIndex++, rightIndex--) {
            pq.add(new CostPair(leftIndex, costs[leftIndex]));
            if (leftIndex < rightIndex) {
                pq.add(new CostPair(rightIndex, costs[rightIndex]));
            }
        }

        long result = 0;
        while (!pq.isEmpty() && k > 0) {
            CostPair minPair = pq.poll();
//            int minVal = minPair.cost;
            int minIndex = minPair.index;

            result += minPair.cost;
            k--;

            if (leftIndex > rightIndex) {
                continue;
            }

            int dist1 = Math.abs(leftIndex - minIndex);
            int dist2 = Math.abs(rightIndex - minIndex);

            if (dist1 < dist2) {
                pq.add(new CostPair(leftIndex, costs[leftIndex]));
                leftIndex++;
            } else {
                pq.add(new CostPair(rightIndex, costs[rightIndex]));
                rightIndex--;
            }
        }

        return result;
    }

    private static class CostPair {
        private final int index;
        private final int cost;

        public CostPair(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }
    }
}
