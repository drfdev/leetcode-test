package dev.drf.leetcode.maximum.subsequence.score;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/maximum-subsequence-score/
 * Used solution:
 * https://leetcode.com/problems/maximum-subsequence-score/solutions/3082106/java-c-python-priority-queue/
 */
public class MaximumSubsequenceScoreProblem implements Problem {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] ess = new int[n][2];
        for (int i = 0; i < n; ++i) {
            ess[i] = new int[]{
                    nums2[i], nums1[i]
            };
        }
        Arrays.sort(ess, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long res = 0, sumS = 0;
        for (int[] es : ess) {
            pq.add(es[1]);
            sumS = (sumS + es[1]);
            if (pq.size() > k) {
                sumS -= pq.poll();
            }
            if (pq.size() == k) {
                res = Math.max(res, (sumS * es[0]));
            }
        }
        return res;
    }
}
