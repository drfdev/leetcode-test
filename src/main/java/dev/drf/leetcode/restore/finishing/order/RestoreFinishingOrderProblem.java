package dev.drf.leetcode.restore.finishing.order;

import dev.drf.leetcode.Problem;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/restore-finishing-order/
 */
public class RestoreFinishingOrderProblem implements Problem {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> friendSet = new HashSet<>();
        for (int friend : friends) {
            friendSet.add(friend);
        }

        int[] result = new int[friends.length];
        int index = 0;

        for (int num : order) {
            if (friendSet.contains(num)) {
                result[index++] = num;
            }
        }

        return result;
    }
}
