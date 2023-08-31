package dev.drf.leetcode.merge.triplets.to.form.target.triplet;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/merge-triplets-to-form-target-triplet/
 * Used solution:
 * https://www.youtube.com/watch?v=kShkQLQZ9K4
 */
public class MergeTripletsToFormTargetTripletProblem implements Problem {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean[] greedy = new boolean[3];

        for (int[] triplet : triplets) {
            if (triplet[0] > target[0]
                    || triplet[1] > target[1]
                    || triplet[2] > target[2]) {
                continue;
            }

            for (int i = 0; i < 3; i++) {
                if (triplet[i] == target[i]) {
                    greedy[i] = true;
                }
            }
        }

        return greedy[0] && greedy[1] && greedy[2];
    }
}
