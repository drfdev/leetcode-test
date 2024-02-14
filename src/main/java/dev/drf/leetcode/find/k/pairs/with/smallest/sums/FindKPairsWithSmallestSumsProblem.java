package dev.drf.leetcode.find.k.pairs.with.smallest.sums;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
 * Used solution:
 * https://leetcode.com/problems/find-k-pairs-with-smallest-sums/solutions/84551/simple-java-o-klogk-solution-with-explanation/
 */
public class FindKPairsWithSmallestSumsProblem implements Problem {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (k < 1 || nums1.length == 0 || nums2.length == 0) {
            return List.of();
        }
        if (k == 1) {
            return List.of(List.of(
                    nums1[0],
                    nums2[0]
            ));
        }

        List<List<Integer>> sums = new ArrayList<>(k);
        PriorityQueue<int[]> priority = new PriorityQueue<>((left, right) -> left[0] + left[1] - right[0] - right[1]);

        for (int i = 0; i < nums1.length && i < k; i++) {
            priority.offer(new int[]{
                    nums1[i],
                    nums2[0],
                    0
            });
        }

        while (k-- > 0 && !priority.isEmpty()) {
            int[] cur = priority.poll();
            sums.add(List.of(
                    cur[0], cur[1]
            ));
            if (cur[2] == nums2.length - 1) {
                continue;
            }
            priority.offer(new int[]{
                    cur[0],
                    nums2[cur[2] + 1],
                    cur[2] + 1
            });
        }

        return sums;
    }
}
